package com.example.memesoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<Button>(R.id.sound_button_one)
        buttonOne.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.kak_tam_s_dengami)
            mediaPlayer?.start()
        }

        val buttonTwo = findViewById<Button>(R.id.sound_button_two)
        buttonTwo.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.nu_kak_tam_s_dengami)
            mediaPlayer?.start()
        }

        val buttonThree = findViewById<Button>(R.id.sound_button_three)
        buttonThree.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.ale_ya_po_povodu_deneg)
            mediaPlayer?.start()
        }

        val buttonFour = findViewById<Button>(R.id.sound_button_four)
        buttonFour.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.ale)
            mediaPlayer?.start()
        }

        val buttonFive = findViewById<Button>(R.id.sound_button_five)
        buttonFive.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.kak_s_dengami_obstoit_vopros)
            mediaPlayer?.start()
        }
        val buttonSix = findViewById<Button>(R.id.sound_button_six)
        buttonSix.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.che_s_dengami)
            mediaPlayer?.start()
        }

        val buttonSeven = findViewById<Button>(R.id.sound_button_seven)
        buttonSeven.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.a_s_dengami_kak_vopros_obstoit)
            mediaPlayer?.start()
        }

        val buttonEight = findViewById<Button>(R.id.sound_button_eight)
        buttonEight.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.nu_kak_s_dengami)
            mediaPlayer?.start()
        }
    }
}