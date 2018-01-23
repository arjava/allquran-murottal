package com.arjava.allquranmurottal.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.adapter.AdapterHomeList;
import com.arjava.allquranmurottal.model.ModelQori;

import java.util.ArrayList;

/**
 *
 * Created by arjava on 12/3/17.
 */

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ArrayList<ModelQori> list;

    //inisiasi string baru
    String[] nameQori = {
            "Sheikh Abdul Basit Abdul Samad", "Sheikh Mashary Al'afasi", "Syekh Mahmud khalil Al - Hussary",
            "Syaikh Ali Al - Huthaify", "Syaikh Abdul Al Muhsin Al Qosim", "Syaikh Abdullah Basfar", "Syaikh Shoud As-Shuraim",
            "Syaikh Saad Al Ghamidi", "Syaikh Hani Ar-Rifai", "Syaikh Mahmud Al-Bana", "Syaikh Abu Bakar As-Shatery",
            "Syaikh Muhammad Jibril", "Syaikh Muhammad Ayub"
    };

    int[] imageQori = {
            R.drawable.abdulbasit_abdulsamad, R.drawable.mishari_alafasy, R.drawable.al_hussary, R.drawable.ali_alhuthaify,
            R.drawable.abdulmohsen_alqasim, R.drawable.abdullah_basfar, R.drawable.shoud_assuraim, R.drawable.saad_alghamidi,
            R.drawable.hani_arrifai, R.drawable.mahmud_albana, R.drawable.abubakr_asshatri, R.drawable.muhammad_jibriel,
            R.drawable.muhammad_ayob
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //mendapatkan referensi widget dari layout xml
        recyclerView = findViewById(R.id.rv_playlist);
        recyclerView.setHasFixedSize(true);

        showRecyclerViewList();
    }

    private void showRecyclerViewList() {
        recyclerView.setLayoutManager(new GridLayoutManager(HomeActivity.this, 3));
        AdapterHomeList adapterHomeList = new AdapterHomeList(HomeActivity.this, imageQori, nameQori);
        adapterHomeList.setArrayList(list);
        recyclerView.setAdapter(adapterHomeList);
    }
}
