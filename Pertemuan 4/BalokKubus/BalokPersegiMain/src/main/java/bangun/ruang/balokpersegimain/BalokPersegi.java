/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.balokpersegimain;

/**
 *
 * @author Fasilkom
 */
public class BalokPersegi {
    int p, l, t;
    public BalokPersegi(int p, int l, int t)
    {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    public BalokPersegi(int p)
    {
        this.p = p;
        this.l = p;
        this.t = p;
    }
    
    int volume()
    {
        return this.p * this.l * this.t;
    }
    
    int luaspermukaan()
    {
        // 2x (p.l +p.t+ l.t)
        return 2*((this.p * this.l) + (this.p * this.t) + (this.l * this.t));
    }
}
