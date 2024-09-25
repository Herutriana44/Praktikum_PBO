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
        buku.tambahBuku(0, "C++ Programming", "John doe", 100.0, 100);
        buku.tambahBuku(1, "C++ Programming", "John doe", 100.0, 100);
        buku.tambahBuku(2, "C++ Programming", "John doe", 100.0, 100);
        buku.tambahBuku(3, "C++ Programming", "John doe", 100.0, 100);
        
        buku.listBuku();

        buku.updateBuku(1, 5, "Introduction of Bioinformatics", "Jekaml Malau", 200, 50);
        System.out.println("Update buku index 1");
        buku.displayBuku(1);

        Pelanggan plg1 = new Pelanggan("Hiro");
        plg1.profile();

        plg1.beliBuku(0);// pelanggan 1 beli buku index 0
        buku.updateStok(0); // stok buku yang di beli di update untuk dikurangi stok nya 1
        plg1.beliBuku(1);; // pelanggan 1 beli buku index 1
        buku.updateStok(1); // stok buku yang di beli di update untuk dikurangi stok nya 1

        System.out.println("Buku yang di beli pelanggan 1");
        for(int i = 0; i < plg1.n; i++)
        {
            buku.displayBuku(i);
        }
    }
}
