package com.no1;

public class Main {
    public static void main(String[] args) {
        // Memanggil class PrimaDanBukan
        PrimaDanBukan primaDanBukan = new PrimaDanBukan();
        primaDanBukan.cetakPrimaBukanPrima();

        System.out.println("\n");

        // Memanggil class GanjilGenap
        GanjilGenap ganjilGenap = new GanjilGenap();
        ganjilGenap.cetakGanjilGenap();

        System.out.println("\n");

        // Memanggil class HurufZA
        HurufZA hurufZA = new HurufZA();
        hurufZA.cetakHurufZA();

        System.out.println("\n");

        // Memanggil class AnakAyam
        AnakAyam anakAyam = new AnakAyam();
        anakAyam.cetakLaguAnakAyam();
    }
}