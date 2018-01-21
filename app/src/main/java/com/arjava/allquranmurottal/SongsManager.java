package com.arjava.allquranmurottal;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FilenameFilter;

/**
 * Created by arjava on 12/2/17.
 */

public class SongsManager {

    // path sdcard
    final String MEDIA_PATH = new String("/sdcard/");
    private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();

    //empty constructor
    public SongsManager() {

    }

    //Fungsi untuk membaca semua file mp3 dalam sdcard
    //kemudian menyimpan rinciannya dalam arraylist
    public ArrayList<HashMap<String, String>> getPlayList() {
        File home = new File(MEDIA_PATH);

        if (home.listFiles(new FileExtensionFilter()).length>0) {
            for (File file : home.listFiles(new FileExtensionFilter())) {
                HashMap<String, String> songs = new HashMap<String, String>();
                songs.put("songTitle", file.getName().substring(0, (file.getName().length() - 4)));
                songs.put("songPath", file.getPath());

                //menambahkan setiap lagu ke daftar lagu
                songsList.add(songs);
            }
        }
        //mengembalikan arraylist lagu2
        return songsList;
    }

    //Class untuk memfilter file yang memiliki ekstensi .mp3
    class FileExtensionFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            return (name.endsWith(".mp3") || name.endsWith(".MP3"));
        }
    }
}
