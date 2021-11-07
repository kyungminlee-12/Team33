package com.example.team33.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team33.R;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<PolicyItem> mPolicyList = new ArrayList<>();

    public MyRecyclerAdapter(Context context, List<PolicyItem> mPolicyList) {
        this.context = context;
        this.mPolicyList = mPolicyList;
    }

    @NonNull
    @Override
    public com.example.team33.ui.home.MyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.team33.ui.home.MyRecyclerAdapter.ViewHolder holder, int position) {
        holder.onBind(mPolicyList.get(position));
    }

//    public void setFriendList(ArrayList<PolicyItem> list){
//        this.mPolicyList = list;
//        notifyDataSetChanged();
//    }

    @Override
    public int getItemCount() {
        return mPolicyList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView name;
        TextView message;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.profile);
            name = (TextView) itemView.findViewById(R.id.name);
            message = (TextView) itemView.findViewById(R.id.message);
        }

        void onBind(PolicyItem item){
            icon.setImageResource(item.getResourceId());
            name.setText(item.getName());
            message.setText(item.getMessage());
        }
    }
}