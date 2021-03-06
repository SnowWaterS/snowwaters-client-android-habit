package com.har.habitforyou.ui.printer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.har.habitforyou.R
import com.har.habitforyou.databinding.FragmentPrinterBinding

class PrinterFragment : Fragment() {

    companion object {
        fun newInstance() = PrinterFragment()
    }

    private var _binding: FragmentPrinterBinding? = null
    private val binding get() = _binding ?: throw NullPointerException("FragmentPrinterBinding is Null")
    private val viewModel: PrinterFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_printer, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        val printerPagerAdapter = PrinterPagerAdapter(this)
        binding.vpPrinter.adapter = printerPagerAdapter
        binding.vpPrinter.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tlPrinter, binding.vpPrinter
        ) { tab, position ->
            tab.text = getString(printerPagerAdapter.getTitleResId(position))
            tab.setIcon(printerPagerAdapter.getIconResId(position))
        }.attach()
    }
}