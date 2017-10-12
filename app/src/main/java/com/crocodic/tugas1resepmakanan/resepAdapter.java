package com.crocodic.tugas1resepmakanan;

/**
 * Created by PHAP on 04/10/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class resepAdapter extends RecyclerView.Adapter<resepAdapter.MyViewHolder> {

    private List<resep> resepList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);

        }
    }


    public resepAdapter(List<resep> resepList) {
        this.resepList = resepList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_resep, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        resep resep = resepList.get(position);
        holder.title.setText(resep.getTitle());
        holder.description.setText(resep.getDescription());
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }
}
