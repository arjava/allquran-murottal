package com.arjava.allquranmurottal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.arjava.allquranmurottal.R;

public class SurahListActivity extends AppCompatActivity {

    int id_surah = 001;
    String url = "http://all-quran.net/documents/Abd_Al_Muhsin_Al_Qasim/Abd_Al_Muhsin_Al_Qasim_files/001.mp3";
    String url_abdul_al_baset = "http://all-quran.net/documents/Abd_Al_Baset_Muratal/Abd_Al_Baset_Muratal_files/"+id_surah+".mp3";
    String url_mishari_al_efasy = "http://www.all-quran.com/documents/Mishary-Al-Efasy/Mishary-Al-Efasy_files/"+id_surah+".mp3";

    String[] nameSurah = {
            "Al Fatihah : Pembukaan", "Al Baqarah : Sapi Betina", "Ali Imran : Keluarga Imran",
            "An Nisa’ : Wanita", "Al Maidah : Hidangan", "Al An’am : Binatang Ternak", "Al A’araf : Tempat Tertinggi",
            "Al Anfal : Rampasan Peraang", "At Tawbah : Pengampunan", "Yunus", "Hud", "Yusuf", "Ar RA’d : Guruh",
            "Ibrahim", "Al Hijr : Negeri Kaum Tsamud", "An Nahl : Lebah", "Al iSra’ : Perjalanan", "Al Kahfi : Gua",
            "Maryam", "Toha", "Al Anbiya’ : Nabi-nabi", "Al Hajj : Haji", "Al Mu’minun : Orang-orang yang Beriman",
            "An Nur : Cahaya", "Al Furqan : Pembeda", "Asy Syu’ara’ : Para Penyair", "An Naml : Semut", "Al Qossos : Cerita-Cerita",
            "Al Ankabut : Laba-laba", "Ar Rum : Kaum Romawi", "Lukman", "As Sajdah : Sujud", "Al Ahzab : Golongan yang Bersekutu",
            "Saba’ : Kaum Saba’", "Fathir : Pencipta", "Yasin", "As Saffat : Yang Bersaf-saf","Shad", "Az Zumar : Rombongan-rombongan",
            "Gafir : Yang mengampuni", "Fussilat : yang dijelaskan", "Asy Syura : Musyawarah", "Az Zukhruf : Perhiasan", "Ad Dukhan : Kabut",
            "Al Jasiyah : Yang berlutut", "Al Ahqaf : Bukit - bukit pasir", "Muhammad", "Al Fath : Kemenangan", "Al Hujurat : Kamar-kamar",
            "Qaf", "Az Zariyat : Angin yang menerbangkan", "At Tur : Bukit", "An Najm : Bintang", "Al Qomar : Bulan", "Ar Rahman : Yang Maha Pemurah",
            "Al Waqiah : Hari Kiamat", "Al Hadid : Besi", "Al Mujadalah : Wanita yang mengajukan gugatan", "Al Hasyr : Pengusiran",
            "Al Mumtahanah : Wanita yang diuji", "As Saff : Satu Barisan", "Al Jumu'ah : Hari Jumat", "Al Munafiqun : Orang-orang Munafik",
            "At Tagabun : Hari dinampakkan kesalahan-kesalahan", "At Talak : Talaq", "At Tahrim : Mengharamkan", "Al Mulk : Kerajaan",
            "Al Qalam : Pena", "Al Haqqah : Hari Kiamat", "Al Ma'arij : Tempat naik", "Nuh", "Al Jinn : Jin", "Al Muzammil : Orang yang berselimut",
            "Al Muddassir : Orang yang berkemul", "Al Qiyamah : Hari Kiamat", "Al Insan : Manusia", "Al Mursalat : Malaikat yang diutus", "An Naba' : Berita besar",
            "An Naziat : Malaikat yang mencabut", "'Abasa : Ia bermuka masam", "At Takwir : Menggulung", "Al Infithar : Terbelah",
            "Al Mutaffifin : Orang-orang yang curang", "Al Insyiqaq : Terbelah", "Al Buruj : Gugusan bintang", "At Tariq : Yang datang dimalam hari",
            "Al 'Ala : Yang paling tinggi", "Al Gasyiyah : Hari pembalasan", "Al Fajr : Fajar", "Al Balad : Negeri", "Asy Syams : Matahari",
            "Al Lail : Malam", "Ad Duha : Waktu matahari", "Asy Syarh : Melapangkan", "At Tin : Buah Tin", "Al 'Alaq : Segumpal darah",
            "Al Qadr : Kemulian", "Al Bayiinah : Pembuktian", "Al Zalzalah : Kegoncangan", "Al 'Adiyat : Berlari kencang", "Al Qori'ah : Hari kiamat",
            "At Takasur : Bermegah - megahan", "Al Asr : Masa / Waktu", "Al Humazah : Pengumpat", "Al Fil : Gajah", "Quraisy : Suku Quraisy",
            "Al Ma'un : Barang - barang yang berguna", "Al Kausar : Nikmat yang berlimpah", "Al Kaafiruun : Orang - orang Kafir",
            "An Nasr : Pertolongan", "Al Lahab : Gejolak Api / Sabut", "Al Ikhlas : Ikhlas / Memurnikan Keesaan Allah", "Al Falaq : Waktu Subuh",
            "An Nas : Manusia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_list);
        id_surah += 1;
        Log.d("ID_SURAH", "onCreate: "+id_surah);
    }
}
