/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.nilaimahasiswademo;

/**
 *
 * @author Fasilkom
 */
public class Mahasiswa {
    String npm;
    String namaMahasiswa;
    double nilaiKehadiran;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    
    public Mahasiswa(String namaMahasiswa, String npm, double niaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS)
    {
        this.npm = npm;
        this.namaMahasiswa = namaMahasiswa;
        this.nilaiKehadiran = niaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    double NilaiAkhir()
    {
        return (0.1 * this.nilaiKehadiran) + (0.2 * this.nilaiTugas) + (0.3 * this.nilaiUTS) + (0.4 * this.nilaiUAS);
    }
    
    String keteranganGrade()
    {
        double nilaiAkhir = this.NilaiAkhir();
        if(nilaiAkhir >= 76)
        {
            return "ISTIMEWA";
        } else if(nilaiAkhir >= 66 && nilaiAkhir <= 75)
        {
            return "BAIK";
        } else if(nilaiAkhir >= 56 && nilaiAkhir <= 65)
        {
            return "CUKUP";
        } else if(nilaiAkhir >= 46 && nilaiAkhir <= 55)
        {
            return "KURANG";
        } else {
            return "KURANG SEKALI";
        }
    }
    
    String Grade()
    {
        double nilaiAkhir = this.NilaiAkhir();
        if(nilaiAkhir >= 76)
        {
            return "A";
        } else if(nilaiAkhir >= 66 && nilaiAkhir <= 75)
        {
            return "B";
        } else if(nilaiAkhir >= 56 && nilaiAkhir <= 65)
        {
            return "C";
        } else if(nilaiAkhir >= 46 && nilaiAkhir <= 55)
        {
            return "D";
        } else {
            return "E";
        }
    }
    
    void tampilanOutput()
    {
        System.out.print("NPMMahasiswa : ");
        System.out.println(this.npm);
        System.out.print("Nama Mahasiswa : ");
        System.out.println(this.namaMahasiswa);
        System.out.print("Nilai : ");
        System.out.println(this.NilaiAkhir());
        System.out.print("Grade : ");
        System.out.println(this.Grade());
        System.out.print("Keterangan : ");
        System.out.println(this.keteranganGrade());
    }
}
