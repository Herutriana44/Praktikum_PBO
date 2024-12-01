package com.praktikum.pertemuan_10;

public class mahasiswa {
    private String NIM, Nama, Alamat, Matkul, nilaiAkhir;
    
    public mahasiswa(String NIM, String Nama, String Alamat, String Matkul, String nilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getMatkul() {
        return Matkul;
    }
    
    public String getnilaiAkhir() {
        return nilaiAkhir;
    }
}