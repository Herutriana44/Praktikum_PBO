/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public class Admin extends People implements AdminActivity {
    public Admin(int id, String nama, String nohp, String username, String password)
    {
        super(id, nama, nohp, username, password);
        this.id = id;
        this.nama = nama;
        this.nohp = nohp;
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void detailPesanan(Customer cust)
    {
        cust.detailPesanan();
    }
    
    @Override
    public void cekKamar(Kamar kamar)
    {
        kamar.info();
    }
}
