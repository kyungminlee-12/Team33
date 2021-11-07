package com.example.team33.ui.vocabulary;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.team33.R;

import java.util.ArrayList;

public class SimpleVocaAdapter extends RecyclerView.Adapter <SimpleVocaAdapter.ViewHolder> {
    private ArrayList<String> vocaData = null ;
    private ArrayList<String> meanData = null ;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1 ;

        ViewHolder(View itemView) {
            super(itemView) ;
            // 뷰 객체에 대한 참조. (hold strong reference)

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition() ;
                    if (pos != RecyclerView.NO_POSITION) {
                        vocaData.set(pos, meanData.get((pos))) ;
                        notifyItemChanged(pos) ;
                    }
                }
            });
            textView1 = itemView.findViewById(R.id.vocaTextView) ;
            textView1.setTextSize(25);
            textView1.setTextColor(Color.BLACK);
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    SimpleVocaAdapter(ArrayList<String> vocabulary, ArrayList<String> meaning) {
        vocaData = vocabulary ;
        meanData = meaning;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.item, parent, false) ;
        ViewHolder vh = new ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String text = vocaData.get(position) ;
        holder.textView1.setText(text) ;
    }
    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return vocaData.size() ;
    }
}
