/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public class Kamar {
    public int idKamar;
    private int idCust = 0;
    public String tanggalReservasi = "";
    private String status = "Belum terisi";
    
    public Kamar(int id)
    {
        this.idKamar = id;
    }
    
    public void Reservasi(int id_cust, String tanggal)
    {
        this.idCust = id_cust;
        this.tanggalReservasi = tanggal;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void cek()
    {
        System.out.println("Id Kamar\t: "+this.idKamar);
        System.out.println("Id Customer\t: "+this.idCust);
        System.out.println("Tanggal Reservasi\t: "+this.tanggalReservasi);
        System.out.println("Status\t: "+this.status);
    }
    
    public void info()
    {
        System.out.println("Id Kamar\t: "+this.idKamar);
        System.out.println("Status\t: "+this.status);
    }
}
