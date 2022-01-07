package com.example.web_view
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.web_view.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val tabs:TabLayout = bind.tablayout
        val browser = tabs.newTab()
        browser.text ="Browser"
        tabs.addTab(browser)
        val history = tabs.newTab()
        history.text ="History"
        tabs.addTab(history)
        val play = tabs.newTab()
        play.text = "Play"
        tabs.addTab(play)
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position){
                    0 ->
                    1 ->
                    2 ->


                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}