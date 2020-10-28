package com.har.habitforyou.ui.printer.tab.image

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.har.habitforyou.R

class PrinterImageFragment : Fragment() {

    companion object {
        fun newInstance() = PrinterImageFragment()
    }

    private lateinit var viewModel: PrinterImageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_printer_image, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrinterImageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}