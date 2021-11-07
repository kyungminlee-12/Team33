package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LivePolicy7 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_policy7);
        text=(TextView) findViewById(R.id.relate_content_live8);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_live7);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_live8:
                intent=new Intent(LivePolicy7.this,LivePolicy8.class);
                startActivity(intent);
                break;

            case R.id.button_live7:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.daegu.go.kr/YouthPolicy/index.do?menu_id=00936785&menu_link=/front/youthpolicy/selectYouthpolicy.do"));
                startActivity(intent);
                break;
        }
    }
}