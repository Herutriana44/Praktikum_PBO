/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nilai.demonilai;

/**
 *
 * @author Fasilkom
 */
public class DemoNilai {

    public static void main(String[] args) {
        Nilai nilai1 = new Nilai("Dengklek", "123456", 100, 80, 85, 90);
        System.out.println("Nilai Akhir\t\t:\t"+nilai1.Nilai());
        System.out.println("\n");
        System.out.println("Cetak Nilai\n");
        nilai1.CetakNilai();
    }
}
