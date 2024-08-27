/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nilai.demonilai;

/**
 *
 * @author Fasilkom
 */
public class Nilai {
    String nama, nim;
    float absen, tugas, uts, uas;
    
    Nilai(String nama, String nim, float absen, float tugas, float uts, float uas)
    {
        this.nama = nama;
        this.nim = nim;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    
    double Nilai()
    {
        return ((this.absen*0.1) + (this.tugas*0.2) + (this.uts*0.3) + (this.uas*0.4));
    }
    
    void CetakNilai()
    {
        String tab = "\t\t";
        System.out.println("NIM"+tab+":\t"+this.nim);
        System.out.println("NAMA"+tab+":\t"+this.nama);
        System.out.println("NILAI ABSEN[10%]"+tab+":\t"+this.absen);
        System.out.println("NILAI TUGAS[20%]"+tab+":\t"+this.tugas);
        System.out.println("NILAI UTS[30%]"+tab+":\t"+this.uts);
        System.out.println("NILAI UAS[40%]"+tab+":\t"+this.uas);
        double NilaiAkhir = Nilai();
        System.out.println("NILAI AKHIR"+tab+":\t"+NilaiAkhir);
    }
}
