package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy4 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy4);
        text=(TextView) findViewById(R.id.relate_content_live5);
        text2=(TextView)findViewById(R.id.relate_content_live6);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live4);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live5:
                intent=new Intent(LivePolicy4.this,LivePolicy5.class);
                startActivity(intent);
                break;

            case R.id.relate_content_live6:
                intent=new Intent(LivePolicy4.this,LivePolicy6.class);
                startActivity(intent);
                break;

            case R.id.button_live4:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://housing.seoul.go.kr/site/main/home"));
                startActivity(intent);
                break;
        }
    }
}