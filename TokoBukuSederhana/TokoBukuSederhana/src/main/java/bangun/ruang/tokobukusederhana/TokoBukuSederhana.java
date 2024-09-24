/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bangun.ruang.tokobukusederhana;

/**
 *
 * @author Fasilkom
 */
public class TokoBukuSederhana {

    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.TambahBuku(0, "C++ Programming", "John doe", 100.0, 100);
        buku.TambahBuku(1, "C++ Programming", "John doe", 100.0, 100);
        buku.TambahBuku(2, "C++ Programming", "John doe", 100.0, 100);
        buku.TambahBuku(3, "C++ Programming", "John doe", 100.0, 100);
        
        for(int i = 0; i < buku.n; i++)
        {
            buku.displayBuku(i);
        }
        
        Pelanggan plg1 = new Pelanggan("Hiro", 1, 1);
        
    }
}
