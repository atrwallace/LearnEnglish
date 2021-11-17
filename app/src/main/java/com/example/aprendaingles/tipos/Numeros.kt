package com.example.aprendaingles.tipos

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aprendaingles.R
import com.example.aprendaingles.databinding.FragmentNumerosBinding

class Numeros : Fragment() {
    private lateinit var binding: FragmentNumerosBinding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNumerosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        som()
    }

    private fun som() {
        binding.imgOne.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.one)
            tocar()
        }
        binding.imgTwo.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.two)
            tocar()
        }
        binding.imgThree.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.three)
            tocar()
        }
        binding.imgFour.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.four)
            tocar()
        }
        binding.imgFive.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.five)
            tocar()
        }
        binding.imgSix.setOnClickListener {
            mediaPlayer = MediaPlayer.create(activity, R.raw.six)
            tocar()
        }

    }

    private fun tocar() {
        if (mediaPlayer != null) {
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener { mediaPlayer.release() }
        }
    }
}