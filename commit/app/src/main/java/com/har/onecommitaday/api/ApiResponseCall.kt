package com.har.onecommitaday.api

import com.har.onecommitaday.api.model.ApiResponse
import okhttp3.Request
import okhttp3.ResponseBody
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Response

internal class ApiResponseCall<S: Any, E : Any>(
    private val delegate: Call<S>,
    private val errorConverter: Converter<ResponseBody, E>
) : Call<ApiResponse<S, E>> {

    override fun isExecuted() = delegate.isExecuted

    override fun clone() = ApiResponseCall(delegate.clone(), errorConverter)

    override fun isCanceled() = delegate.isCanceled

    override fun cancel() = delegate.cancel()

    override fun execute(): Response<ApiResponse<S, E>> {
        throw UnsupportedOperationException("NetworkResponseCall doesn't support execute")
    }

    override fun request(): Request = delegate.request()

    override fun timeout(): Timeout = delegate.timeout()

    override fun enqueue(callback: Callback<ApiResponse<S, E>>) {
        return delegate.enqueue(object: Callback<S> {
            override fun onResponse(call: Call<S>, response: Response<S>) {
                val body = response.body()
                val code = response.code()
                val error = response.errorBody()

                if (response.isSuccessful) {
                    if (body != null) {
                        callback.onResponse(this@ApiResponseCall, Response.success(ApiResponse.create(body)))
                    } else {
                        callback.onResponse(this@ApiResponseCall, Response.success(ApiResponse.create(ApiResponse.Error.NoContent, " Empty response body")))
                    }
                } else {
                    val errorBody = when {
                        error == null -> null
                        error.contentLength() == 0L -> null
                        else -> try {
                            errorConverter.convert(error)
                        } catch (ex: Exception) {
                            null
                        }
                    }

                    if (errorBody != null) {
                        callback.onResponse(this@ApiResponseCall, Response.success(ApiResponse.ApiError(errorBody, code)))
                    } else {
                        val errorMessage: String = when (code) {
                            404 -> {
                                "page not found"
                            }
                            504 -> {
                                "gateway timeout"
                            }
                            else -> {
                                "unknown error"
                            }
                        }
                        callback.onResponse(this@ApiResponseCall, Response.success(ApiResponse.create(code, errorMessage)))
                    }
                }
            }

            override fun onFailure(call: Call<S>, t: Throwable) {
                callback.onResponse(this@ApiResponseCall, Response.success(ApiResponse.create(t)))
            }
        })
    }
}