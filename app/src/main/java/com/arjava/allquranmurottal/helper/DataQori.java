package com.arjava.allquranmurottal.helper;

import com.arjava.allquranmurottal.R;
import com.arjava.allquranmurottal.model.ModelQori;

import java.util.ArrayList;

/**
 *
 * Created by arjava on 1/15/18.
 */

public class DataQori {

    public static String[] name_qori = {
            "Sheikh Abdul Basit Abdul Samad", "Sheikh Mashary Al'afasi", "Syekh Mahmud khalil Al - Hussary",
                    "Syaikh Ali Al - Huthaify", "Syaikh Abdul Al Muhsin Al Qosim", "Syaikh Abdullah Basfar", "Syaikh Shoud As-Shuraim",
                    "Syaikh Saad Al Ghamidi", "Syaikh Hani Ar-Rifai", "Syaikh Mahmud Al-Bana", "Syaikh Abu Bakar As-Shatery",
                    "Syaikh Muhammad Jibril", "Syaikh Muhammad Ayub"
    };

    public static int[] image_qori = {
            R.drawable.abdulbasit_abdulsamad, R.drawable.mishari_alafasy, R.drawable.al_hussary, R.drawable.ali_alhuthaify,
            R.drawable.abdulmohsen_alqasim, R.drawable.abdullah_basfar, R.drawable.shoud_assuraim, R.drawable.saad_alghamidi,
            R.drawable.hani_arrifai, R.drawable.mahmud_albana, R.drawable.abubakr_asshatri, R.drawable.muhammad_jibriel,
            R.drawable.muhammad_ayob
    };

    public static ArrayList<ModelQori> getNameQori() {
        ModelQori modelQori = null;
        ArrayList<ModelQori> list = new ArrayList<>();
        for (int s = 0; s<name_qori.length; s++) {
            modelQori = new ModelQori();
            modelQori.setNama_qori(name_qori[s]);

            list.add(modelQori);
        }
        return list;
    }

    public static ArrayList<ModelQori> getImageQori() {
        ModelQori modelQori = null;
        ArrayList<ModelQori> list = new ArrayList<>();
        for (int i = 0; i<image_qori.length; i++) {
            modelQori = new ModelQori();
            modelQori.setFoto_qori(image_qori[i]);

            list.add(modelQori);
        }
        return list;
    }

}
