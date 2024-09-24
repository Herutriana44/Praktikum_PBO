/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.imtcalc;

/**
 *
 * @author Fasilkom
 */
public class IMT {
    double bb, tb;
    
    public IMT(double bb, double tb)
    {
        this.bb = bb;
        this.tb = tb;
    }
    
    double IMTVal()
    {
        return (this.bb) /  (this.tb * this.tb);
    }
    
    String Kriteria()
    {
        double imt = this.IMTVal();
        if(imt <= 18.4)
        {
            return "Berat Badan Kurang";
        } else if(imt >= 18.5 && imt <= 24.9)
        {
            return "Berat Badan Ideal";
        } else if(imt >= 25 && imt <= 29.9)
        {
            return "Berat Badan Lebih";
        } else if(imt >= 30 && imt <= 39.9)
        {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
    
    void display()
    {
        System.out.print("IMT : ");
        System.out.println(this.IMTVal());
        System.out.print("Kriteria IMT : ");
        System.out.println(this.Kriteria());
    }
}
