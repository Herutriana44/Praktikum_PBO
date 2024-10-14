package com.no1;

class GanjilGenap {
    public void cetakGanjilGenap() {
        System.out.println("Bilangan Ganjil:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nBilangan Genap:");
        int j = 0;
        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 20);
    }
}
