package com.example.team33.ui.slideshow;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

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
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
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

        return root;
    }
}