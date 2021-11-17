package com.example.aprendaingles.tipos

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.aprendaingles.R
import com.example.aprendaingles.databinding.FragmentBichosBinding

class Bichos : Fragment() {
    private lateinit var binding: FragmentBichosBinding
    private lateinit var mediaplayer: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBichosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        som()
    }

    private fun som() {

        binding.imgMonkey.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.monkey)
            tocar()
        }
        binding.imgCow.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.cow)
            tocar()
        }
        binding.imgShip.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.sheep)
            tocar()
        }
        binding.imgLion.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.lion)
            tocar()
        }
        binding.imgDog.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.dog)
            tocar()
        }
        binding.imgCat.setOnClickListener {
            mediaplayer = MediaPlayer.create(activity, R.raw.cat)
            tocar()
        }

    }

    private fun tocar() {
        if (mediaplayer != null) {
            mediaplayer.start()
            mediaplayer.setOnCompletionListener { mediaplayer.release() }
        }
    }
}