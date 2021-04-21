package com.apllication.myapplication_1301208552;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MobilAdapter_1301208552 extends RecyclerView.Adapter<MobilAdapter_1301208552.myViewHolder> {
    Context context;
    ArrayList<MobilList> isiMobilList;

    public MobilAdapter_1301208552(Context context, ArrayList<MobilList> isiMobilList) {
        this.context = context;
        this.isiMobilList = isiMobilList;
    }

    @NonNull
    @Override
    public MobilAdapter_1301208552.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_1301208552, parent, false);
        myViewHolder viewHolder = new myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MobilAdapter_1301208552.myViewHolder holder, int position) {
        holder.tittle.setText(isiMobilList.get(position).getTittle());
        holder.desc.setText(isiMobilList.get(position).getDesc());
        holder.content1.setText(isiMobilList.get(position).getContent1());
        holder.content2.setText(isiMobilList.get(position).getContent2());
        holder.image.setImageResource(isiMobilList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return isiMobilList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        private TextView tittle, desc, content1, content2;
        private ImageView image;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.tV_tittle_1301208552);
            desc = itemView.findViewById(R.id.tV_desc_1301208552);
            content1 = itemView.findViewById(R.id.tV_content1_1301208552);
            content2 = itemView.findViewById(R.id.tV_content2_1301208552);
            image = itemView.findViewById(R.id.gambar_1301208552);

        }
    }
}
