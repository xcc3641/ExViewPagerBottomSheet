package com.imxie.exvpbs.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.imxie.exvpbs.BottomSheetVPHelper
import kotlinx.android.synthetic.main.activity_viewpager.*


class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)

        (0 until 10).map { SimpleListFragment.new(it) }.also { list ->
            vp.adapter = object : FragmentStatePagerAdapter(
                supportFragmentManager,
                BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
            ) {
                override fun getItem(position: Int): Fragment {
                    return list[position]
                }

                override fun getCount(): Int {
                    return list.size
                }

            }
        }

        BottomSheetVPHelper.setupViewPager(vp)
    }
}