/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public class People {
    public int id;
    public String nama;
    public String nohp;
    public String username;
    public String password;
    
    public People(int id, String nama, String nohp, String username, String password)
    {
        this.id = id;
        this.nama = nama;
        this.nohp = nohp;
        this.username = username;
        this.password = password;
    }
    
    public void profile()
    {
        System.out.println("Nama\t: "+this.nama);
        System.out.println("No Hp\t: "+this.nohp);
    }
}
