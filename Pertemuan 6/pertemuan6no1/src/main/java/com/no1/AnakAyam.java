package com.no1;

import java.util.Scanner;

class AnakAyam {
    public void cetakLaguAnakAyam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
        scanner.close();
    }
}
