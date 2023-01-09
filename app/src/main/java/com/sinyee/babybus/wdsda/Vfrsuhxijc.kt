package com.sinyee.babybus.wdsda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinyee.babybus.databinding.ActivityVfrsuhxijcBinding
import com.sinyee.babybus.vfiuoc.Hyxoxzchsije
import kotlin.random.Random

class Vfrsuhxijc : AppCompatActivity() {
    private lateinit var mkijbvo : ActivityVfrsuhxijcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mkijbvo = ActivityVfrsuhxijcBinding.inflate(layoutInflater)
        setContentView(mkijbvo.root)
        val bonusScore = intent.getIntExtra("count",0)
        val preWin = Neisuxicj.listWin[Random.nextInt(14)]
        val totalWin = preWin * bonusScore
        mkijbvo.tvBonus.text = "You received $bonusScore bonuses score"
        mkijbvo.tvWin.text = "Your total win $totalWin points"
        mkijbvo.button2.setOnClickListener {
            startActivity(Intent(this,Hyxoxzchsije::class.java))
        }
    }
}