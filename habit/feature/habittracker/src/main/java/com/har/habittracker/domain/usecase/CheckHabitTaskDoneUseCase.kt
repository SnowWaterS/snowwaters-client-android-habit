package com.har.habittracker.domain.usecase

import com.har.habittracker.domain.repository.IHabitTaskLogRepository

class CheckHabitTaskDoneUseCase(private val repository: IHabitTaskLogRepository) {

    suspend fun execute(habitTaskId: Long) {
        repository.checkHabitTaskDone(habitTaskId)
    }
}