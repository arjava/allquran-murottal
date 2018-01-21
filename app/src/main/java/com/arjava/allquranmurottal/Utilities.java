package com.arjava.allquranmurottal;

/**
 * Created by arjava on 12/2/17.
 */

public class Utilities {

    //Berfungsi untuk mengubah waktu milidetik
    // Format Timer
    // Jam: Menit: Detik
    public String milliSecondsToTimer(long milliseconds) {
        String finalTimerString = "";
        String secondsString = "";

        // konversi total durasi ke waktu
        int hours = (int) (milliseconds / (1000*60*60));
        int minutes = (int) (milliseconds % (1000*60*60)) / (1000*60);
        int seconds = (int) ((milliseconds % (1000*60*60)) % (1000*60) / 1000);

        //tambahkan jam jika tersedia
        if (hours > 0) {
            finalTimerString = hours + ":";
        }

        //Prepending 0 to seconds if it is one digit
        if (seconds<10) {
            secondsString = "0" + seconds;
        }else {
            secondsString = "" + seconds;
        }
        finalTimerString = finalTimerString + minutes + ":" + secondsString;

        return finalTimerString;
    }

    /**
     * Fungsi untuk mengambil proses persentase
     * @param currentDuration
     * @param totalDuration
     */
    public int getProgressPercentage(long currentDuration, long totalDuration) {
        Double percentage = (double) 0;

        long currentSeconds = (int) (currentDuration / 1000);
        long totalSeconds = (int) (totalDuration / 1000);

        //menghitung persentase
        percentage = (((double)currentSeconds)/totalDuration)*1000;

        //mengembalikan persentase
        return percentage.intValue();
    }

    /**
     * Fungsi mengubah progress ke Timer
     * @param progress
     * @param totalDuration
     * @return durasi terakhir dalam milisecond
     */
    public int progressToTimer(int progress, int totalDuration) {
        int currentDuration = 0;
        totalDuration = (int) (totalDuration / 1000);
        currentDuration = (int) ((((double)progress) / 100) * totalDuration);

        //mengembalikasn durasi terakhir dalam milisecond
        return currentDuration * 1000;
    }

}
