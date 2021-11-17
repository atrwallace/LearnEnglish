package com.example.aprendaingles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.aprendaingles.databinding.ActivityMainBinding
import com.example.aprendaingles.tipos.Bichos
import com.example.aprendaingles.tipos.Numeros
import com.example.aprendaingles.tipos.Vogais
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add("Bichos", Bichos::class.java)
                .add("Números", Numeros::class.java)
                .add("Vogais", Vogais::class.java)
                .create()
        )
        supportActionBar?.elevation = 0f

        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = adapter

        val viewPagerTab: SmartTabLayout = binding.viewPagerTab
        viewPagerTab.setViewPager(viewPager)

        initViewers()
        initListeners()
    }

    fun initViewers() {}
    fun initListeners() {}
}