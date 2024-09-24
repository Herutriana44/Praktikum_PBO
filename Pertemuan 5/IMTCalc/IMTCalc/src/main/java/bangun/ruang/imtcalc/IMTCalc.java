    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bangun.ruang.imtcalc;
import java.util.Scanner;

/**
 *
 * @author Fasilkom
 */
public class IMTCalc {

    public static void main(String[] args) {
        System.out.println("IMT Calculator");
        
        Scanner inp = new Scanner(System.in);
        double bb, tb;
        System.out.print("Berat Badan :\t");
        bb = inp.nextDouble();
        System.out.print("Tinggi Badan :\t");
        tb = inp.nextDouble();
        
        IMT imt = new IMT(bb, tb);
        imt.display();
    }
}
