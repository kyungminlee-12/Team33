package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobPolicyRed1 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_policy_red1);
        text=(TextView) findViewById(R.id.relate_content_red1);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_red1);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_red1:
                intent=new Intent(JobPolicyRed1.this,JobPolicyRed2.class);
                startActivity(intent);
                break;

            case R.id.button_red1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.korea.kr/special/bhFocusView.do?newsId=148891398&pkgId=49500733"));
                startActivity(intent);
                break;
        }
    }
}