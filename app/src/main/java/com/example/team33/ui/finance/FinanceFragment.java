package com.example.team33.ui.finance;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.team33.JobPolicy1;
import com.example.team33.JobPolicy10;
import com.example.team33.JobPolicy2;
import com.example.team33.JobPolicy3;
import com.example.team33.JobPolicy4;
import com.example.team33.JobPolicy5;
import com.example.team33.JobPolicy6;
import com.example.team33.JobPolicy7;
import com.example.team33.JobPolicy8;
import com.example.team33.JobPolicy9;
import com.example.team33.JobPolicyRed1;
import com.example.team33.JobPolicyRed2;
import com.example.team33.MoneyPolicy1;
import com.example.team33.MoneyPolicy2;
import com.example.team33.MoneyPolicy3;
import com.example.team33.MoneyPolicy4;
import com.example.team33.MoneyPolicy5;
import com.example.team33.MoneyPolicyRed1;
import com.example.team33.MoneyPolicyRed2;
import com.example.team33.R;


public class FinanceFragment extends Fragment {

    private FinanceViewModel galleryViewModel;

    TextView tv_sub1Title, tv_sub2Title;
    TextView list1_PolicyNames[] = new TextView[5];
    TextView list1_PolicyContents[] = new TextView[5];
    TextView list1_PolicyDates[] = new TextView[5];

    TextView list2_PolicyNames[] = new TextView[2];
    TextView list2_PolicyContents[] = new TextView[2];
    TextView list2_PolicyDates[] = new TextView[2];


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(FinanceViewModel.class);

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        tv_sub1Title = (TextView) root.findViewById(R.id.tvSub1Title);
        tv_sub2Title = (TextView) root.findViewById(R.id.tvSub2Title);

        Resources res = getResources();

        int id_sub1Title = res.getIdentifier("jobSub1Title", "string", getActivity().getPackageName());
        String sub1Title = res.getString(id_sub1Title);
        tv_sub1Title.setText(sub1Title);

        int id_sub2Title = res.getIdentifier("jobSub2Title", "string", getActivity().getPackageName());
        String sub2Title = res.getString(id_sub2Title);
        tv_sub2Title.setText(sub2Title);

        String tag = "job";

        int sub1 = 5;
        int sub2 = 2;

        for(int i=0; i<sub1; i++) {
            // 레이아웃에 설정된 View 가져오기
            int sub1PolicyName = getResources().getIdentifier("tv1Policy" + (i + 1) + "Title", "id", (getActivity()).getPackageName());
            int sub1PolicyContent = getResources().getIdentifier("tv1Policy" + (i + 1) + "Content", "id", (getActivity()).getPackageName());
            int sub1PolicyDate = getResources().getIdentifier("tv1Policy" + (i + 1) + "Date", "id", (getActivity()).getPackageName());

            list1_PolicyNames[i] = (TextView) root.findViewById(sub1PolicyName);
            list1_PolicyContents[i] = (TextView) root.findViewById(sub1PolicyContent);
            list1_PolicyDates[i] = (TextView) root.findViewById(sub1PolicyDate);

            // string에서 text 가져오기
            int id_title1 = res.getIdentifier(tag + "1Policy" + (i + 1) + "Title", "string", getActivity().getPackageName());
            String title1 = res.getString(id_title1);
            list1_PolicyNames[i].setText(title1);

            int id_content1 = res.getIdentifier(tag + "1Policy" + (i + 1) + "Content", "string", getActivity().getPackageName());
            String content1 = res.getString(id_content1);
            list1_PolicyContents[i].setText(content1);

            int id_date1 = res.getIdentifier(tag + "1Policy" + (i + 1) + "Date", "string", getActivity().getPackageName());
            String date1 = res.getString(id_date1);
            list1_PolicyDates[i].setText(date1);
        }

        for(int i=0; i<sub2; i++) {
            // sub1
            // 레이아웃에 설정된 View 가져오기
            int sub2PolicyName = res.getIdentifier("tv2Policy" + (i+1) + "Title", "id", getActivity().getPackageName());
            int sub2PolicyContent = res.getIdentifier("tv2Policy" + (i+1) + "Content", "id", getActivity().getPackageName());
            int sub2PolicyDate = res.getIdentifier("tv2Policy" + (i+1) + "Date", "id", getActivity().getPackageName());

            list2_PolicyNames[i] = (TextView) root.findViewById(sub2PolicyName);
            list2_PolicyContents[i] = (TextView) root.findViewById(sub2PolicyContent);
            list2_PolicyDates[i] = (TextView) root.findViewById(sub2PolicyDate);

            // string에서 text 가져오기
            int id_title2 = res.getIdentifier(tag + "2Policy" + (i+1) + "Title", "string", getActivity().getPackageName());
            String title2 = res.getString(id_title2);
            list2_PolicyNames[i].setText(title2);

            int id_content2 = res.getIdentifier(tag + "2Policy" + (i+1) + "Content", "string", getActivity().getPackageName());
            String content2 = res.getString(id_content2);
            list2_PolicyContents[i].setText(content2);

            int id_date2 = res.getIdentifier(tag + "2Policy" + (i+1) + "Date", "string", getActivity().getPackageName());
            String date2 = res.getString(id_date2);
            list2_PolicyDates[i].setText(date2);
        }

        //Button onButtonClickedInputRecord = (Button) root.findViewById(R.id.btn1);
        //onButtonClickedInputRecord.setOnClickListener(this);

        /*Button onButtonClickedInputRecord1 = (Button) root.findViewById(R.id.moneyBtn1);
        onButtonClickedInputRecord1.setOnClickListener(this);
        Button onButtonClickedInputRecord2 = (Button) root.findViewById(R.id.moneyBtn2);
        onButtonClickedInputRecord2.setOnClickListener(this);
        Button onButtonClickedInputRecord3 = (Button) root.findViewById(R.id.moneyBtn3);
        onButtonClickedInputRecord3.setOnClickListener(this);
        Button onButtonClickedInputRecord4 = (Button) root.findViewById(R.id.moneyBtn4);
        onButtonClickedInputRecord4.setOnClickListener(this);
        Button onButtonClickedInputRecord5 = (Button) root.findViewById(R.id.moneyBtn5);
        onButtonClickedInputRecord5.setOnClickListener(this);
        Button onButtonClickedInputRecord6 = (Button) root.findViewById(R.id.moneyBtn6);
        onButtonClickedInputRecord6.setOnClickListener(this);
        Button onButtonClickedInputRecord7 = (Button) root.findViewById(R.id.moneyBtn7);
        onButtonClickedInputRecord7.setOnClickListener(this);*/


        return root;
    }

    /*@Override
    public void onClick(View v) {
        Button b = (Button) v;

        switch(b.getId()) {
            //id에 따라서 다른 구현을 한다.
            case R.id.moneyBtn1:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicy1.class));
                break;
            case R.id.moneyBtn2:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicy2.class));
                break;
            case R.id.moneyBtn3:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicy3.class));
                break;
            case R.id.moneyBtn4:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicy4.class));
                break;
            case R.id.moneyBtn5:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicy5.class));
                break;
            case R.id.moneyBtn6:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicyRed1.class));
                break;
            case R.id.moneyBtn7:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), MoneyPolicyRed2.class));
                break;
        }
    }*/
}