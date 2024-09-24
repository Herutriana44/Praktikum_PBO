/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.tokobukusederhana;

/**
 *
 * @author Fasilkom
 */
public class Pelanggan {
    String namaPelanggan;
    int IDBukuDibeli;
    int jumlahBukuDibeli;
    
    public Pelanggan(String namaPelanggan, int IDBukuDibeli, int JumlahBukuDibeli)
    {
        this.namaPelanggan = namaPelanggan;
        this.IDBukuDibeli = IDBukuDibeli;
        this.jumlahBukuDibeli = JumlahBukuDibeli;
    }
    
    void profile()
    {
        System.out.println(this.namaPelanggan);
        System.out.println(this.IDBukuDibeli);
        System.out.println(this.jumlahBukuDibeli);
    }
}
