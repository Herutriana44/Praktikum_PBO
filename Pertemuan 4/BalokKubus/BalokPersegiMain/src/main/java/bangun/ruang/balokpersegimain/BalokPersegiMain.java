/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bangun.ruang.balokpersegimain;

/**
 *
 * @author Fasilkom
 */
public class BalokPersegiMain {

    public static void main(String[] args) {
        BalokPersegi balok = new BalokPersegi(2, 3, 4);
        System.out.println("Volume Balok\t\t:\t"+balok.volume());
        System.out.println("Luas Permukaan Balok\t:\t"+balok.luaspermukaan());
        
        BalokPersegi kubus = new BalokPersegi(4);
        System.out.println("Volume Kubus\t\t:\t"+kubus.volume());
        System.out.println("Luas Permukaan Kubus\t:\t"+kubus.luaspermukaan());
    }
}
