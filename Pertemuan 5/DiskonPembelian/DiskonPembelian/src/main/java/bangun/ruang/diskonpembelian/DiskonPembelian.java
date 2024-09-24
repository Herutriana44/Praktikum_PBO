/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bangun.ruang.diskonpembelian;
import java.util.Scanner;
/**
 *
 * @author Fasilkom
 */
public class DiskonPembelian {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pembelian;
        System.out.print("Total pembelian Rp. =\t");
        pembelian = inp.nextInt();
        double potongan = Potongan(pembelian);
        double potonganPembelian = pembelian - potongan;
        System.out.print("Besarnya potongan Rp. =\t");
        System.out.println(potongan);
        System.out.print("Jumlah yang harus dibayarkan ");
        System.out.println(potonganPembelian);
    }
    
    static double Potongan(int pembelian)
    {
        if(pembelian < 50000)
        {
            return (pembelian * 0.05);
        } else {
            return (pembelian * 0.2);
        }
    }
}
