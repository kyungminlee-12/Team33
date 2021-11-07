package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy6 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy6);
        text=(TextView) findViewById(R.id.relate_content_live4);
        text2=(TextView)findViewById(R.id.relate_content_live5);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live6);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live4:
                intent=new Intent(LivePolicy6.this, com.example.team33.LivePolicy4.class);
                startActivity(intent);
                break;

            case R.id.relate_content_live5:
                intent=new Intent(LivePolicy6.this, com.example.team33.LivePolicy5.class);
                startActivity(intent);
                break;

            case R.id.button_live6:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lh.or.kr/index.do"));
                startActivity(intent);
                break;
        }
    }
}