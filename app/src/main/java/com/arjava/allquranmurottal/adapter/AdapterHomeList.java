package com.arjava.allquranmurottal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.activity.SurahListActivity;
import com.arjava.allquranmurottal.model.ModelQori;

import java.util.ArrayList;

/**
 *
 * Created by arjava on 1/13/18.
 */

public class AdapterHomeList extends RecyclerView.Adapter<AdapterHomeList.ViewHolder> {

    private Context context;
    private ArrayList<ModelQori> arrayList;
    private final int[] imageQori;
    private final String[] nameQori;

    public AdapterHomeList(Context context, int[] image, String[] name) {
        this.context = context;
        this.imageQori = image;
        this.nameQori = name;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imageView.setImageResource(imageQori[position]);
        holder.textView.setText(nameQori[position]);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "CardClick "+ imageQori[position]+ "dan "+
                        nameQori[position], Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context, SurahListActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageQori.length;
    }

    public ArrayList<ModelQori> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<ModelQori> arrayList) {
        this.arrayList = arrayList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        LinearLayout layout;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageQori);
            textView = itemView.findViewById(R.id.textviewQori);
            layout = itemView.findViewById(R.id.layoutItemQori);
        }
    }
}
