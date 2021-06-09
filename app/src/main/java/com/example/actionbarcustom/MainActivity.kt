package com.example.actionbarcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
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

    }
}