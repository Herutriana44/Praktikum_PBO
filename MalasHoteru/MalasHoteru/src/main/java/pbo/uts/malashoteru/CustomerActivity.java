/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public interface CustomerActivity {
    public abstract void pesanKamar(Kamar kamar, String tanggal_pesan);
    public abstract void cekKamar(int id);
    public abstract void detailPesanan();
}
