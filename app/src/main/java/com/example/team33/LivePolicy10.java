package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy10 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy10);
        text=(TextView) findViewById(R.id.relate_content_live9);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live10);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live9:
                intent=new Intent(LivePolicy10.this, com.example.team33.LivePolicy9.class);
                startActivity(intent);
                break;

            case R.id.button_live10:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.applyhome.co.kr/"));
                startActivity(intent);
                break;
        }
    }
}