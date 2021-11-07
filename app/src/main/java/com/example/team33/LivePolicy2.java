package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy2 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy2);
        text=(TextView) findViewById(R.id.relate_content_live1);
        text2=(TextView)findViewById(R.id.relate_content_live3);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live2);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live1:
                intent=new Intent(LivePolicy2.this,LivePolicy1.class);
                startActivity(intent);
                break;

            case R.id.relate_content_live3:
                intent=new Intent(LivePolicy2.this, com.example.team33.LivePolicy3.class);
                startActivity(intent);
                break;

            case R.id.button_live2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://housing.seoul.go.kr/site/main/home"));
                startActivity(intent);
                break;
        }
    }
}