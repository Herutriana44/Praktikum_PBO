package com.praktikum.pertemuan_9_soal2;

public class HitungHari {
    public int hitung(int tahun, String bulan){
        int hari = 0;
        
        switch (bulan){
            case "April":
            case "Juni":
            case "September":
            case "November":
                hari = 30;
                break;
            case "Januari":
            case "Maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                hari = 31;
                break;
            case "Februari":
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                    hari = 29;
                }else{
                    hari = 28;
                }
                break;
            default:
                break;
        }
        return hari;
    }
}
