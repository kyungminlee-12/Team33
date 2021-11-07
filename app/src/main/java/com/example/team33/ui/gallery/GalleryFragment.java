package com.example.team33.ui.gallery;

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
import com.example.team33.R;

import androidx.lifecycle.ViewModelProvider;


public class GalleryFragment extends Fragment implements View.OnClickListener {

    private GalleryViewModel galleryViewModel;

    TextView tv_sub1Title, tv_sub2Title;
    TextView list1_PolicyNames[] = new TextView[10];
    TextView list1_PolicyContents[] = new TextView[10];
    TextView list1_PolicyDates[] = new TextView[10];

    TextView list2_PolicyNames[] = new TextView[2];
    TextView list2_PolicyContents[] = new TextView[2];
    TextView list2_PolicyDates[] = new TextView[2];

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

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

        int sub1 = 10;
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

    Button onButtonClickedInputRecord1 = (Button) root.findViewById(R.id.jobBtn1);
    onButtonClickedInputRecord1.setOnClickListener(this);
    Button onButtonClickedInputRecord2 = (Button) root.findViewById(R.id.jobBtn2);
    onButtonClickedInputRecord2.setOnClickListener(this);
    Button onButtonClickedInputRecord3 = (Button) root.findViewById(R.id.jobBtn3);
    onButtonClickedInputRecord3.setOnClickListener(this);
    Button onButtonClickedInputRecord4 = (Button) root.findViewById(R.id.jobBtn4);
    onButtonClickedInputRecord4.setOnClickListener(this);
    Button onButtonClickedInputRecord5 = (Button) root.findViewById(R.id.jobBtn5);
    onButtonClickedInputRecord5.setOnClickListener(this);
    Button onButtonClickedInputRecord6 = (Button) root.findViewById(R.id.jobBtn6);
    onButtonClickedInputRecord6.setOnClickListener(this);
    Button onButtonClickedInputRecord7 = (Button) root.findViewById(R.id.jobBtn7);
    onButtonClickedInputRecord7.setOnClickListener(this);
    Button onButtonClickedInputRecord8 = (Button) root.findViewById(R.id.jobBtn8);
    onButtonClickedInputRecord8.setOnClickListener(this);
    Button onButtonClickedInputRecord9 = (Button) root.findViewById(R.id.jobBtn9);
    onButtonClickedInputRecord9.setOnClickListener(this);
    Button onButtonClickedInputRecord10 = (Button) root.findViewById(R.id.jobBtn10);
    onButtonClickedInputRecord10.setOnClickListener(this);
    Button onButtonClickedInputRecord11 = (Button) root.findViewById(R.id.jobBtn11);
    onButtonClickedInputRecord11.setOnClickListener(this);
    Button onButtonClickedInputRecord12 = (Button) root.findViewById(R.id.jobBtn12);
    onButtonClickedInputRecord12.setOnClickListener(this);


    return root;
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;

        switch(b.getId()) {
            //id에 따라서 다른 구현을 한다.
            case R.id.jobBtn1:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy1.class));
                break;
            case R.id.jobBtn2:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy2.class));
                break;
            case R.id.jobBtn3:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy3.class));
                break;
            case R.id.jobBtn4:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy4.class));
                break;
            case R.id.jobBtn5:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy5.class));
                break;
            case R.id.jobBtn6:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy6.class));
                break;
            case R.id.jobBtn7:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy7.class));
                break;
            case R.id.jobBtn8:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy8.class));
                break;
            case R.id.jobBtn9:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy9.class));
                break;
            case R.id.jobBtn10:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicy10.class));
                break;
            case R.id.jobBtn11:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicyRed1.class));
                break;
            case R.id.jobBtn12:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), JobPolicyRed2.class));
                break;
        }
    }
}