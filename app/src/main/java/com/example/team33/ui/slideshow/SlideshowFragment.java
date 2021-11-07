package com.example.team33.ui.slideshow;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;


import com.example.team33.LivePolicy1;
import com.example.team33.LivePolicy2;
import com.example.team33.LivePolicy3;
import com.example.team33.LivePolicy4;
import com.example.team33.LivePolicy5;
import com.example.team33.LivePolicy6;
import com.example.team33.LivePolicy7;
import com.example.team33.LivePolicy8;
import com.example.team33.LivePolicy9;
import com.example.team33.LivePolicy10;

import com.example.team33.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    TextView tv_sub1Title, tv_sub2Title;
    TextView list1_PolicyNames[] = new TextView[3];
    TextView list1_PolicyContents[] = new TextView[3];
    TextView list1_PolicyDates[] = new TextView[3];

    TextView list2_PolicyNames[] = new TextView[7];
    TextView list2_PolicyContents[] = new TextView[7];
    TextView list2_PolicyDates[] = new TextView[7];

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);


        Resources res = getResources();

        tv_sub1Title = (TextView) root.findViewById(R.id.tvSub1Title);
        tv_sub2Title = (TextView) root.findViewById(R.id.tvSub2Title);

        int id_sub1Title = res.getIdentifier("liveSub1Title", "string", getActivity().getPackageName());
        String sub1Title = res.getString(id_sub1Title);
        tv_sub1Title.setText(sub1Title);

        int id_sub2Title = res.getIdentifier("liveSub2Title", "string", getActivity().getPackageName());
        String sub2Title = res.getString(id_sub2Title);
        tv_sub2Title.setText(sub2Title);

        String tag = "live";

        int sub1 = 3;
        int sub2 = 7;

        for(int i=0; i<sub1; i++) {
            // sub1
            // 레이아웃에 설정된 View 가져오기
            int sub1PolicyName = res.getIdentifier("tv1Policy" + (i + 1) + "Title", "id", getActivity().getPackageName());
            int sub1PolicyContent = res.getIdentifier("tv1Policy" + (i + 1) + "Content", "id", getActivity().getPackageName());
            int sub1PolicyDate = res.getIdentifier("tv1Policy" + (i + 1) + "Date", "id", getActivity().getPackageName());

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

        /*Button onButtonClickedInputRecord1 = (Button) root.findViewById(R.id.liveBtn1);
        onButtonClickedInputRecord1.setOnClickListener(this);
        Button onButtonClickedInputRecord2 = (Button) root.findViewById(R.id.liveBtn2);
        onButtonClickedInputRecord2.setOnClickListener(this);
        Button onButtonClickedInputRecord3 = (Button) root.findViewById(R.id.liveBtn3);
        onButtonClickedInputRecord3.setOnClickListener(this);
        Button onButtonClickedInputRecord4 = (Button) root.findViewById(R.id.liveBtn4);
        onButtonClickedInputRecord4.setOnClickListener(this);
        Button onButtonClickedInputRecord5 = (Button) root.findViewById(R.id.liveBtn5);
        onButtonClickedInputRecord5.setOnClickListener(this);
        Button onButtonClickedInputRecord6 = (Button) root.findViewById(R.id.liveBtn6);
        onButtonClickedInputRecord6.setOnClickListener(this);
        Button onButtonClickedInputRecord7 = (Button) root.findViewById(R.id.liveBtn7);
        onButtonClickedInputRecord7.setOnClickListener(this);
        Button onButtonClickedInputRecord8 = (Button) root.findViewById(R.id.liveBtn8);
        onButtonClickedInputRecord8.setOnClickListener(this);
        Button onButtonClickedInputRecord9 = (Button) root.findViewById(R.id.liveBtn9);
        onButtonClickedInputRecord9.setOnClickListener(this);
        Button onButtonClickedInputRecord10 = (Button) root.findViewById(R.id.liveBtn10);
        onButtonClickedInputRecord10.setOnClickListener(this);
        Button onButtonClickedInputRecord11 = (Button) root.findViewById(R.id.liveBtn11);
        onButtonClickedInputRecord11.setOnClickListener(this);
        Button onButtonClickedInputRecord12 = (Button) root.findViewById(R.id.liveBtn12);
        onButtonClickedInputRecord12.setOnClickListener(this);*/

        return root;
    }

    /*@Override
    public void onClick(View v) {
        Button b = (Button) v;

        switch (b.getId()) {
            //id에 따라서 다른 구현을 한다.
            case R.id.liveBtn1:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy1.class));
                break;
            case R.id.liveBtn2:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy2.class));
                break;
            case R.id.liveBtn3:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy3.class));
                break;
            case R.id.liveBtn4:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy4.class));
                break;
            case R.id.liveBtn5:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy5.class));
                break;
            case R.id.liveBtn6:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy6.class));
                break;
            case R.id.liveBtn7:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy7.class));
                break;
            case R.id.liveBtn8:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy8.class));
                break;
            case R.id.liveBtn9:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy9.class));
                break;
            case R.id.liveBtn10:
                //버튼 클릭시 아래 구현이 실행된다.
                getActivity().startActivity(new Intent(getActivity(), LivePolicy10.class));
                break;
        }
    }*/
}