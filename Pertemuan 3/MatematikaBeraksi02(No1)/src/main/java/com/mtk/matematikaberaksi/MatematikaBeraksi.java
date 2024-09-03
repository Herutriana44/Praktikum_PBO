/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mtk.matematikaberaksi;

/**
 *
 * @author MyPC One Pro L7Z
 */
public class MatematikaBeraksi {

    public static void main(String[] args) {
        System.out.println("Superclass Matematika()");
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10-5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian : 10*3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian : 21/2 = " + mtk.pembagian(21, 2));
        
        System.out.println();
        
        System.out.println("Superclass Matematika2()");
        Matematika2 mtk2 = new Matematika2();
        System.out.println("Pertambahan : 20 + 10 = " + mtk2.pertambahan(20, 10));
        System.out.println("Pengurangan : 10-5 = " + mtk2.pengurangan(10, 5));
        System.out.println("Perkalian : 10*3 = " + mtk2.perkalian(10, 3));
        System.out.println("Pembagian : 21/2 = " + mtk2.pembagian(21, 2));
        System.out.println("Pembagian : 21/2 = " + mtk2.modulus(21, 2));
    }
}
