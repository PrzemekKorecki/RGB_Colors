package com.example.rgb_colors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        sbRed.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{

            var value = 0

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
               Toast.makeText(this@MainActivity,"wartosc: $value", Toast.LENGTH_SHORT).show()
                btnColor.setBackgroundColor(Color.rgb(sbBlue.progress, sbRed.progress, sbGreen.progress))
            }

        })
        sbBlue.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{

            var value = 0

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@MainActivity,"wartosc: $value", Toast.LENGTH_SHORT).show()
                btnColor.setBackgroundColor(Color.rgb(sbBlue.progress, sbRed.progress, sbGreen.progress))
            }

        })
        sbGreen.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{

            var value = 0

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@MainActivity,"wartosc: $value", Toast.LENGTH_SHORT).show()
                btnColor.setBackgroundColor(Color.rgb(sbBlue.progress, sbRed.progress, sbGreen.progress))
            }

        })

    }
}
