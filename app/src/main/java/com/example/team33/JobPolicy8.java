package com.example.team33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobPolicy8 extends AppCompatActivity {

    TextView text,text2;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_policy8);
        text=(TextView) findViewById(R.id.relate_content7);
        text2=(TextView)findViewById(R.id.relate_content9);
        text.setOnClickListener(this::onClick);
        text2.setOnClickListener(this::onClick);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.relate_content7:
                intent=new Intent(JobPolicy8.this,JobPolicy7.class);
                startActivity(intent);
                break;

            case R.id.relate_content9:
                intent=new Intent(JobPolicy8.this, com.example.team33.JobPolicy9.class);
                startActivity(intent);
                break;

            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youth.seoul.go.kr/site/main/content/urban_youth_regio_win_biz"));
                startActivity(intent);
                break;
        }
    }
}