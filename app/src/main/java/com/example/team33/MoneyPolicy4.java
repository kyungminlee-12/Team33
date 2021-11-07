package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyPolicy4 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_policy4);
        text=(TextView) findViewById(R.id.relate_content_money4);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_money4);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_money4:
                intent=new Intent(MoneyPolicy4.this,MoneyPolicy5.class);
                startActivity(intent);
                break;

            case R.id.button_money4:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/sup_busi_intro"));
                startActivity(intent);
                break;
        }
    }
}