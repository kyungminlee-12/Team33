package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy1 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy1);
        text=(TextView) findViewById(R.id.relate_content_live2);
        text2=(TextView)findViewById(R.id.relate_content_live3);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live1);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live2:
                intent=new Intent(LivePolicy1.this,LivePolicy2.class);
                startActivity(intent);
                break;

            case R.id.relate_content_live3:
                intent=new Intent(LivePolicy1.this,LivePolicy3.class);
                startActivity(intent);
                break;

            case R.id.button_live1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bokjiro.go.kr/ssis-teu/index.do"));
                startActivity(intent);
                break;
        }
    }
}