package com.arjava.allquranmurottal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.model.ModelSurah;

import java.util.List;

/**
 *
 * Created by arjava on 1/17/18.
 */

public class AdapterSurahList extends RecyclerView.Adapter<AdapterSurahList.ViewHolder> {

    List<ModelSurah> modelSurah;
    Context context;

    @Override
    public AdapterSurahList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_surah, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterSurahList.ViewHolder holder, int position) {

        ModelSurah result = modelSurah.get(position);

        for (int i = position ; i<115 ; i++){

        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewSurah;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewSurah = itemView.findViewById(R.id.tvSurah);

        }
    }
}
