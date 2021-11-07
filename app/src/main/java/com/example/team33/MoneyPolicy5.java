package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyPolicy5 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_policy5);
        text=(TextView) findViewById(R.id.relate_content_money5);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_money5);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_money5:
                intent=new Intent(MoneyPolicy5.this, com.example.team33.MoneyPolicy4.class);
                startActivity(intent);
                break;

            case R.id.button_money5:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/stu_loan_cred_reco_intro"));
                startActivity(intent);
                break;
        }
    }
}