package com.arjava.allquranmurottal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.model.ModelSurah;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by arjava on 1/17/18.
 */

public class AdapterSurahList extends RecyclerView.Adapter<AdapterSurahList.ViewHolder> {

    ArrayList<ModelSurah> modelSurah;
    Context context;
    private final String[] nameSurah;

    public AdapterSurahList(Context context, String[] nameSurah) {
        this.context = context;
        this.nameSurah = nameSurah;
        notifyDataSetChanged();
    }

    @Override
    public AdapterSurahList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_surah, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterSurahList.ViewHolder holder, int position) {

        for (int id = 1; id <= nameSurah.length; id++){
            String ids = String.valueOf(id)+".mp3";
            Log.d("AdapterSurahList", "onBindViewHolder: ID_SURAH : "+ids);
        }

        holder.textViewSurah.setText(nameSurah[position]);
        Log.d("AdapterSurahList", "onBindViewHolder: Surah = "+ nameSurah[position]);
        Log.d("AdapterSurahList", "onBindViewHolder: Size = "+ nameSurah.length);

    }

    @Override
    public int getItemCount() {
        return nameSurah.length;
    }

    public ArrayList<ModelSurah> getModelSurah() {
        return modelSurah;
    }

    public void setModelSurah(ArrayList<ModelSurah> modelSurah) {
        this.modelSurah = modelSurah;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewSurah;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewSurah = itemView.findViewById(R.id.tvSurah);

        }
    }
}
