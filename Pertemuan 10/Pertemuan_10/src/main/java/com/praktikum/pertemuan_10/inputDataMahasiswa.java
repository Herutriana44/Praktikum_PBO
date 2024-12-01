package com.praktikum.pertemuan_10;

import java.util.ArrayList;

public class inputDataMahasiswa {
    ArrayList<mahasiswa> listMahasiswa;
    
    public inputDataMahasiswa() {
        listMahasiswa = new ArrayList<>();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String Matkul,
                           String nilaiAkhir) {
        mahasiswa mhs = new mahasiswa(NIM, Nama, Alamat, Matkul, nilaiAkhir);
        listMahasiswa.add(mhs);
    }
    
    public ArrayList<mahasiswa> getAll() {
        return listMahasiswa;
    }
    
    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }
}
