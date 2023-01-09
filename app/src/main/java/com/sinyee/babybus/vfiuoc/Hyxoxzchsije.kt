package com.sinyee.babybus.vfiuoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinyee.babybus.databinding.ActivityHyxoxzchsijeBinding
import com.sinyee.babybus.wdsda.Neisuxicj
import com.sinyee.babybus.wdsda.Vfrsuhxijc
import kotlin.random.Random

class Hyxoxzchsije : AppCompatActivity() {
    private lateinit var bcoixch : ActivityHyxoxzchsijeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bcoixch = ActivityHyxoxzchsijeBinding.inflate(layoutInflater)
        setContentView(bcoixch.root)
        bcoixch.imageView.setImageResource(Neisuxicj.lstImgs[Random.nextInt(4)])
        bcoixch.imageView2.setImageResource(Neisuxicj.lstImgs[Random.nextInt(4)])
        bcoixch.imageView3.setImageResource(Neisuxicj.lstImgs[Random.nextInt(4)])
        bcoixch.imageView4.setImageResource(Neisuxicj.lstImgs[Random.nextInt(4)])
        setBonus()

    }

    private fun setBonus() = with(bcoixch){
        var count = 0
        imageView.setOnClickListener {
            imageView.isClickable = false
            imageView.alpha = 0.5f
            count+=1
            if(count == 4){
                startActivity(Intent(this@Hyxoxzchsije,Vfrsuhxijc::class.java)
                    .putExtra("count",count)
                )
            }
            val bonusScore = Neisuxicj.listBonus[Random.nextInt(6)]
            tvScroe.text = "Bonus score :x$bonusScore"
        }

        imageView2.setOnClickListener {
            imageView2.isClickable = false
            imageView2.alpha = 0.5f
            count+=1
            if(count == 4){
                startActivity(Intent(this@Hyxoxzchsije,Vfrsuhxijc::class.java)
                    .putExtra("count",count)
                )
            }
            val bonusScore = Neisuxicj.listBonus[Random.nextInt(6)]
            tvScroe.text = "Bonus score :x$bonusScore"
        }

        imageView3.setOnClickListener {
            imageView3.isClickable = false
            imageView3.alpha = 0.5f
            count+=1
            if(count == 4){
                startActivity(Intent(this@Hyxoxzchsije,Vfrsuhxijc::class.java)
                    .putExtra("count",count)
                )
            }
            val bonusScore = Neisuxicj.listBonus[Random.nextInt(6)]
            tvScroe.text = "Bonus score :x$bonusScore"
        }

        imageView4.setOnClickListener {
            imageView4.isClickable = false
            imageView4.alpha = 0.5f
            count+=1
            if(count == 4){
                startActivity(Intent(this@Hyxoxzchsije,Vfrsuhxijc::class.java)
                    .putExtra("count",count)
                )
            }
            val bonusScore = Neisuxicj.listBonus[Random.nextInt(6)]
            tvScroe.text = "Bonus score :x$bonusScore"
        }
    }


}