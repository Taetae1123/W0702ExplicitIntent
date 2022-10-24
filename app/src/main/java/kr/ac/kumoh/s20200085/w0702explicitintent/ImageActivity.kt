package kr.ac.kumoh.s20200085.w0702explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//activity image 추가
class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
    }
}