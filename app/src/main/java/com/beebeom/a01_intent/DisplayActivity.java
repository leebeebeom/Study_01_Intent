package com.beebeom.a01_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textView = findViewById(R.id.text_msg);

        //인텐트 받기
        Intent intent = getIntent();
        //이 액티비티를 실행한 인텐트를 가져온다.

        String msg = intent.getStringExtra("msg");
        //인텐트에 담긴 데이터 가져오기.

        textView.setText(msg);
        //텍스트뷰에 텍스트 설정하기.
    }
}