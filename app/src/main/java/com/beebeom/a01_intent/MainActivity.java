package com.beebeom.a01_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.et_msg);

        Button button = findViewById(R.id.btn_send);
        /*버튼에 클릭 리스너 달아주기
        * 여러가지 방법이 있다.*/
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //인텐트 발행
        Intent intent = new Intent(this, DisplayActivity.class);

        //인텐트에 데이터 담기
        intent.putExtra("msg", mEditText.getText().toString());
        //인텐트에 데이터를 담을때는 키값이 필요하다
        //키값이란?
        //받는 쪽에서 입력하면 그에 맞는 데이터를 주는 느낌이다.
        //위 코드에서는 "msg"가 키값이다.

        //startActivity 코드를 써주지 않으면 실행되지 않는다.
        //인자값에 내가 발행한 인텐트를 넣어준다.
        startActivity(intent);




    }
}