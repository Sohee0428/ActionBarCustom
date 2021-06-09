package com.example.actionbarcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

//    액션바에 있는 UI를 담아둘 변수
//    변수 : 멤버 변수 => 답아주는 행위 : onCreate

    lateinit var toastBnt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        기본 액션바 부르기
        val defaultActionBar = supportActionBar!!

//        모드를 커스넘 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        실제로 어떤 커스텀바를 사용할 것인지
        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

//        커스텀뷰를 들고있는 튤바를 변수로 저장
        val toolbar = defaultActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0, 0)
        
//        커스텀 액션바에 달아둔 버튼을 찾아오기
        toastBnt = defaultActionBar.customView.findViewById(R.id.toastBtn)
        
        toastBnt.setOnClickListener {
            Toast.makeText(this, "액션바를 통한 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}