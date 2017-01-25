package com.kagssoft.cobonat.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kagssoft.cobonat.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by sams on 1/19/2017.
 */

public class Cobon_Adapter extends RecyclerView.Adapter <Cobon_Adapter.MyViewHolder> {
    private LayoutInflater inflater;
    List<cobon> data= Collections.emptyList();

    public Cobon_Adapter(Context context,List<cobon>data){
        inflater=LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cobon,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        cobon current=data.get(position);
   holder.title.setText(current.title);
   holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title ;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.tv_what);
            icon= (ImageView) itemView.findViewById(R.id.hitler);
        }
    }
}
