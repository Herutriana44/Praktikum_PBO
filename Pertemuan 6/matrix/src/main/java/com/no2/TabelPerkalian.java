package com.no2;

class TabelPerkalian {
    public void cetakTabelPerkalian(int n) {
        if (n > 10 || n < 1) {
            System.out.println("Masukkan nilai n antara 1 hingga 10.");
            return;
        }

        // Cetak header kolom
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Cetak garis pemisah
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Cetak baris dan hasil perkalian
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i); // Header baris
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
