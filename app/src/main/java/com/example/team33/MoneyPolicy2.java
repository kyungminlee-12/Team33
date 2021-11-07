package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyPolicy2 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_policy2);
        text=(TextView) findViewById(R.id.relate_content0);
        text2=(TextView)findViewById(R.id.relate_content2);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_money2);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content0:
                intent=new Intent(MoneyPolicy2.this,MoneyPolicy1.class);
                startActivity(intent);
                break;

            case R.id.relate_content2:
                intent=new Intent(MoneyPolicy2.this,MoneyPolicy3.class);
                startActivity(intent);
                break;

            case R.id.button_money2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/hd_youth_passbok_intro"));
                startActivity(intent);
                break;
        }
    }
}