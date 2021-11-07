package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobPolicyRed2 extends AppCompatActivity {

    TextView text;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_policy_red2);
        text=(TextView) findViewById(R.id.relate_content_red2);
        text.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button_red2);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content_red2:
                intent=new Intent(JobPolicyRed2.this,JobPolicyRed1.class);
                startActivity(intent);
                break;

            case R.id.button_red2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/unemp_emp_incentives_intro"));
                startActivity(intent);
                break;
        }
    }
}