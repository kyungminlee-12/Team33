package com.example.team33.ui.finance;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.team33.R;
import com.example.team33.ui.vocabulary.SimpleVocaAdapter;

import java.util.ArrayList;


public class FinanceFragment extends Fragment {

    private FinanceViewModel galleryViewModel;
    TextView tv_sub1Title2, tv_sub2Title2;
    TextView list1_PolicyNames[] = new TextView[10];
    TextView list1_PolicyContents[] = new TextView[10];
    TextView list1_PolicyDates[] = new TextView[10];

    TextView list2_PolicyNames[] = new TextView[2];
    TextView list2_PolicyContents[] = new TextView[2];
    TextView list2_PolicyDates[] = new TextView[2];


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_finance, container, false);

        return root;
    }
}