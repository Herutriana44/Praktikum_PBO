/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.malashoteru;

/**
 *
 * @author laboran
 */
public class Message {
    public String garis = "=============================================================";
    
    public void start()
    {
        message("Selamat Datang di aplikasi MalasHoteru");
    }
    
    public void listKamar(Kamar[] kamar)
    {
        System.out.println(garis);
        for(int i = 0; i < kamar.length; i++)
        {
            kamar[i].info();
        }
        System.out.println(garis);
    }
    
    public void message(String txt)
    {
        System.out.println(garis);
        System.out.println(txt);
        System.out.println(garis);
    }
}
