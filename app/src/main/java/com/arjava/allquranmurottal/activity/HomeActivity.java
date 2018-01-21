package com.arjava.allquranmurottal.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.widget.LinearLayout;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.adapter.AdapterHomeList;
import com.arjava.allquranmurottal.adapter.ColorAdapter;
import com.arjava.allquranmurottal.helper.DataQori;
import com.arjava.allquranmurottal.model.ModelQori;

import java.util.ArrayList;

/**
 *
 * Created by arjava on 12/3/17.
 */

public class HomeActivity extends AppCompatActivity {

    private Context context;

    LinearLayout linearLayout;
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
        /*// permintaan window action bar
        requestWindowFeature(Window.FEATURE_ACTION_BAR);*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //mendapatkan context aplikasi
//        context = getApplicationContext();

        //mengganti warna action bar
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.RED));

        //mendapatkan referensi widget dari layout xml
        linearLayout = findViewById(R.id.ln_playlist);
        recyclerView = findViewById(R.id.rv_playlist);



        /*
            StaggeredGridLayoutManager
                A LayoutManager that lays out children in a staggered grid formation. It supports
                horizontal & vertical layout as well as an ability to layout children in reverse.

                Staggered grids are likely to have gaps at the edges of the layout. To avoid these
                gaps, StaggeredGridLayoutManager can offset spans independently or move items
                between spans. You can control this behavior via setGapStrategy(int).
        */
        /*
            public StaggeredGridLayoutManager (int spanCount, int orientation)
                Creates a StaggeredGridLayoutManager with given parameters.

            Parameters
                spanCount : If orientation is vertical, spanCount is number of columns.
                    If orientation is horizontal, spanCount is number of rows.
                orientation : VERTICAL or HORIZONTAL
        */
        //menetapkan layout recyclerview
        recyclerView.setHasFixedSize(true);
        /*list = new ArrayList<>();
        list.addAll(DataQori.getNameQori());
        list.addAll(DataQori.getImageQori());*/

        showRecyclerViewList();
    }

    private void showRecyclerViewList() {
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(new GridLayoutManager(HomeActivity.this, 3));
        AdapterHomeList adapterHomeList = new AdapterHomeList(HomeActivity.this, imageQori, nameQori);
        adapterHomeList.setArrayList(list);
        recyclerView.setAdapter(adapterHomeList);
    }
}
