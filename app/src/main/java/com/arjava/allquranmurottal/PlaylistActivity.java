package com.arjava.allquranmurottal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by arjava on 12/2/17.
 */

public class PlaylistActivity extends ListActivity {
    // list lagu - lagu
    public ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        ArrayList<HashMap<String, String>> songsListData = new ArrayList<HashMap<String, String>>();

        SongsManager sra = new SongsManager();

        //mengambil semua lagu dari sdcard
        this.songsList = sra.getPlayList();

        //mengulang daftar putar
        for (int i = 0; i<songsList.size(); i++) {
            //membuat Hashmap baru
            HashMap<String, String> song = songsList.get(i);

            //menambahkan Hashlist ke arrayList
            songsListData.add(song);
        }

        //menambahkan daftar item ke listview
        ListAdapter adapter = new SimpleAdapter(this, songsListData,
                R.layout.playlist_item, new String[] { "songTitle" }, new int[] {
                R.id.songTitle
        });

        setListAdapter(adapter);

        //memilih listview single item
        ListView listView = getListView();
        //penanganan ketika item di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //mendapatkan index daftar item
                int songIndex = position;

                //menjalankan intent baru
                Intent itn = new Intent(getApplicationContext(),
                        MainActivity.class);
                //mengirimkan index ke activity player
                itn.putExtra("songIndex", songIndex);
                setResult(100, itn);
                //menutup PlayListview
                finish();
            }
        });
    }
}
