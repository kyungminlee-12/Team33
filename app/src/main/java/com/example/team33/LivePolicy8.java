package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy8 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy8);
        text=(TextView) findViewById(R.id.relate_content_live7);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live8);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live7:
                intent=new Intent(LivePolicy8.this, com.example.team33.LivePolicy7.class);
                startActivity(intent);
                break;

            case R.id.button_live8:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sdm.go.kr/corona/index.do"));
                startActivity(intent);
                break;
        }
    }
}