package com.example.myapplication222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication222.databinding.ActivityMainBinding
import com.example.myapplication222.post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val p = post(
            id = 1,
            author = "Нетология. Университет интернет-профессий будущего",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            likedByMe = false
        )
         with(binding){
             textView.text = p.author
             textView2.text = p.published
             textView3.text = p.content
             if(p.likedByMe) {
                 like.setImageResource(R.drawable.ic_launcher_foreground)

             }
             likeCount.text = p.likes.toString()
             root.setOnClickListener{
                 Log.d( "stuff", "stuff")
             }
             imageView.setOnClickListener{
                Log.d("stuff", "avatar")

             }
             like.setOnClickListener{
                 Log.d("stuff", "like")
                 p.likedByMe = !p.likedByMe
                 like.setImageResource(
                     if(p.likedByMe) R.drawable.ic_launcher_foreground else R.drawable.baseline_favorite_border_24
                 )
                 if(p.likedByMe) p.likes++ else p.likes--
                 likeCount.text = p.likes.toString()
                 if (p.likes == 1000) likeCount.text = p.likes.toString(); likeCount.text = "1k"
             }

                 share.setOnClickListener {
                     Log.d("stuff", "sharee")
                     p.shareByMe = !p.shareByMe
                     if (p.shareByMe) p.shares++
                     shareCount.text = p.shares.toString()
                 }



         }
        }
    }
