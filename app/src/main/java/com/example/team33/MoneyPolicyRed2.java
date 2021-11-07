package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyPolicyRed2 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_policy_red2);
        text=(TextView) findViewById(R.id.relate_content_money_red2);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_money_red2);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_money_red2:
                intent=new Intent(MoneyPolicyRed2.this,MoneyPolicyRed1.class);
                startActivity(intent);
                break;

            case R.id.button_money_red2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/mind_reliable_ask"));
                startActivity(intent);
                break;
        }
    }
}