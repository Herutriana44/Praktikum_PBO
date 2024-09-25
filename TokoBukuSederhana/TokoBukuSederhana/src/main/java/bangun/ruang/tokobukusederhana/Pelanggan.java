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
    public String namaPelanggan;
    public int jumlahBukuDibeli = 0;
    public int[] bukuDibeli;
    public int n = 0;

    public Pelanggan(String namaPelanggan)
    {
        this.namaPelanggan = namaPelanggan;
        this.bukuDibeli = new int[1000];
    }
    
    void profile()
    {
        System.out.println(this.namaPelanggan);
        System.out.println(this.jumlahBukuDibeli);
    }

    void beliBuku(int id)
    {
        this.bukuDibeli[this.n] = id;
        this.n += 1;
    }
}
