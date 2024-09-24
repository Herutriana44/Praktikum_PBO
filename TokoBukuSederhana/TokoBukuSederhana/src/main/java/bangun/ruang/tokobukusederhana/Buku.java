/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.tokobukusederhana;

/**
 *
 * @author Fasilkom
 */
public class Buku {
    int[] IDBuku;
    String[] judulBuku;
    String[] penulis;
    double[] harga;
    int[] stok;
    int n = 0;
    
    // contructor
    void TambahBuku(int IDBuku, String judulBuku, String penulis, double harga, int stok)
    {
        this.IDBuku[this.n] = IDBuku;
        this.judulBuku[this.n] = judulBuku;
        this.penulis[this.n] = penulis;
        this.harga[this.n] = harga;
        this.n += 1;
    }
    
    // method
    void displayBuku(int id)
    {
        System.out.println(this.IDBuku[id]);
        System.out.println(this.judulBuku[id]);
        System.out.println(this.penulis[id]);
        System.out.println(this.harga[id]);
        System.out.println(this.stok[id]);
    }
}
