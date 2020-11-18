package com.har.habitforyou.ui.printer.tab.image

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrinterImageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}