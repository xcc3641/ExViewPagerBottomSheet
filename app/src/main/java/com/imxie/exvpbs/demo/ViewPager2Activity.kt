package com.imxie.exvpbs.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.imxie.exvpbs.BottomSheetVP2Helper
import kotlinx.android.synthetic.main.activity_viewpager2.vp


class ViewPager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager2)
        (0 until 10).map { SimpleListFragment.new(it) }.also { list ->
            vp.adapter = object : FragmentStateAdapter(this) {
                override fun getItemCount(): Int {
                    return list.size
                }

                override fun createFragment(position: Int): Fragment {
                    return list[position]
                }
            }
        }

        BottomSheetVP2Helper.setupViewPager(vp)

    }
}