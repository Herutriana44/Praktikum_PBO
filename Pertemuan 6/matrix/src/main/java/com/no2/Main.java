package com.no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (1 hingga 10): ");
        int n = scanner.nextInt();

        TabelPerkalian tabel = new TabelPerkalian();
        tabel.cetakTabelPerkalian(n);

        scanner.close();
    }
}
