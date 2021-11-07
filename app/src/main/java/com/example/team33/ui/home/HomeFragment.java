package com.example.team33.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
//import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team33.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    RecyclerView mRecyclerView1, mRecyclerView2;
    MyRecyclerAdapter mRecyclerAdapter, mRecyclerAdapter2;
    ArrayList<PolicyItem> mpolicyItems = new ArrayList<>();;
    ArrayList<PolicyItem> mpolicyItems2 = new ArrayList<>();;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView1 = (RecyclerView) rootView.findViewById(R.id.recyclerView1);
        mRecyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);

        mpolicyItems = PolicyItem.createContactsList(3);
        mpolicyItems2 = PolicyItem.createContactsList2(3);

        /* initiate adapter */
        mRecyclerAdapter = new MyRecyclerAdapter(getActivity(), mpolicyItems);
        mRecyclerAdapter2 = new MyRecyclerAdapter(getActivity(), mpolicyItems2);

        /* initiate recyclerview */
        mRecyclerView1.setAdapter(mRecyclerAdapter);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));

        mRecyclerView2.setAdapter(mRecyclerAdapter2);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}