package com.arjava.allquranmurottal.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjava.allquranmurottal.R;

import java.util.Random;

/**
 *
 * Created by arjava on 12/3/17.
 */

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {
    private String[] sDataSet;
    private Context context;
    private Random random = new Random();

    public ColorAdapter(Context context, String[] sDataSet) {
        this.sDataSet = sDataSet;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create a new View
        View v = LayoutInflater.from(context).inflate(R.layout.playlist_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(sDataSet[position]);
        // Set a random height for TextView
        holder.textView.getLayoutParams().height = getRandomIntInRange(250,75);
        // Set a random color for TextView background
        holder.textView.setBackgroundColor(getRandomHSVColor());
    }

    private int getRandomHSVColor() {
        // Generate a random hue value between 0 to 360
        int hue = random.nextInt(361);
        // We make the color depth full
        float saturation = 1.0f;
        // We make a full bright color
        float value = 1.0f;
        // We avoid color transparency
        int alpha = 255;
        // Finally, generate the color
        int color = Color.HSVToColor(alpha, new float[]{hue, saturation, value});
        // Return the color
        return color;
    }

    private int getRandomIntInRange(int max, int min) {
        return random.nextInt((max-min)+min)+min;
    }

    @Override
    public int getItemCount() {
        return sDataSet.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.songTitle);
        }
    }
}
