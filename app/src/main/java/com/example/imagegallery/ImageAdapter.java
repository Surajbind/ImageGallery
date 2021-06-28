package com.example.imagegallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private List<Photo> il;
    private static Context context;
    public ImageAdapter(List<Photo> il) {
        this.il = il;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Glide.with(context).load(il.get(i).getUrlS()).override(500,200).into(viewHolder.iv);
        viewHolder.id.setText(il.get(i).getId());
    }

    @Override
    public int getItemCount() {
        return il.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv;
        private TextView id;

        public ViewHolder(View view) {
            super(view);

            iv = (ImageView) view.findViewById(R.id.iv);
            id = (TextView)view.findViewById(R.id.imageid);
            context = view.getContext();


        }
    }

}
