package com.example.team33.ui.vocabulary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team33.R;

import java.util.ArrayList;


public class VocabularyFragment extends Fragment {

    private SimpleVocaAdapter adapter;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_vocabulary, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<String> vocabulary = new ArrayList<>();
        /*
        for (int i=0; i<10; i++) {
            vocabulary.add(String.format("단어 %d", i)) ;
        }*/
        vocabulary.add("청년 수당");
        vocabulary.add("보호종료아동 자립수당");
        vocabulary.add("청년저축계좌");
        vocabulary.add("국민취업지원제도");
        vocabulary.add("영농정착지원");
        vocabulary.add("뉴딜 일자리");


        ArrayList<String> meaning = new ArrayList<>();
        /*
        for (int i=0; i<10; i++) {
            meaning.add(String.format("단어 뜻 %d", i)) ;
        }*/
        meaning.add("서울시에 거주하고 있는 만 19세~34세 미취업 청년들의 구직 활동을 촉진하는 수당");
        meaning.add("보호종료아동의 시설 퇴소 후 사회정착 및 자립지원을 위해 생계비 지원 목적의 자립수당을 지급하는 사업");
        meaning.add("본인적립금(10만원)을 저축하면 근로소득장려금(월 30만원) 지원하는 프로그램");
        meaning.add("취업을 희망하는 분들에게 취업지원서비스를 종합적으로 제공하고, 저소득 구직자에는 최소한의 소득도 지원하는 제도");
        meaning.add("농업에 뜻이 있는 서울시 청년을 선발하여 정착 지원금독립과 농지, 창업 자금, 기술 등을 종합하여 지원하는 사업");
        meaning.add("사업 참여 후 민간일자리에 취업하도록 디딤돌 역할을 하는 서울시 대표 공공일자리");

        adapter = new SimpleVocaAdapter(vocabulary, meaning);
        recyclerView.setAdapter(adapter);
        return root;
    }
}