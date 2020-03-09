package com.imxie.exvpbs.demo

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_tab.*


class SimpleListFragment : Fragment(R.layout.fragment_tab) {

    private var indexStr = ""
    override fun setArguments(args: Bundle?) {
        indexStr = args?.getString(DATA) ?: ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvContent.text = indexStr
        rv.adapter = SimpleAdapter()
    }

    companion object {

        const val DATA = "data"

        fun new(index: Int): SimpleListFragment {
            return SimpleListFragment().apply { arguments = bundleOf(DATA to index.toString()) }
        }
    }

}
