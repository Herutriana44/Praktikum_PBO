/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public class Customer extends People implements CustomerActivity
{
    public Kamar kamar;
    public Customer(int id, String nama, String nohp, String username, String password)
    {
        super(id, nama, nohp, username, password);
        this.id = id;
        this.nama = nama;
        this.nohp = nohp;
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void pesanKamar(Kamar kamar, String tanggal_pesan){
        System.out.println("Anda memilih kamar" + kamar.idKamar);
        this.kamar = new Kamar(kamar.idKamar);
        this.kamar.Reservasi(this.id, tanggal_pesan);
        this.kamar.setStatus("Sudah Terisi");
        this.kamar.cek();
    }
    
    @Override
    public void cekKamar(int id){
        this.kamar.info();
    }
    
    @Override
    public void detailPesanan(){
        this.kamar.cek();
    }
}
