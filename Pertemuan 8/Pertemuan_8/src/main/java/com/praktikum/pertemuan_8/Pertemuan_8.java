/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikum.pertemuan_8;

import java.util.Scanner;

/**
 *
 * @author herutriana44
 */
public class Pertemuan_8 {

    public static void main(String[] args) {
               // Deklarasi array
        String[] kodeBarang = new String[5];
        String[] namaBarang = new String[5];
        int[] hargaBarang = new int[5];

        // Mengisi nilai array
        kodeBarang[0] = "001";
        kodeBarang[1] = "002";
        kodeBarang[2] = "003";
        kodeBarang[3] = "004";
        kodeBarang[4] = "005";

        namaBarang[0] = "Pulpen";
        namaBarang[1] = "Buku";
        namaBarang[2] = "Pensil";
        namaBarang[3] = "Spidol";
        namaBarang[4] = "Penghapus";

        hargaBarang[0] = 3000;
        hargaBarang[1] = 15000;
        hargaBarang[2] = 2000;
        hargaBarang[3] = 5000;
        hargaBarang[4] = 1000;

        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("*****************************");
        System.out.print("Masukan Item Barang   : ");
        int jumlahItem = input.nextInt();
        input.nextLine();

        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        // Menginput data pembelian
        for(int i = 0; i < jumlahItem; i++){
            System.out.println("Data ke " + (i + 1));

            // Input kode barang dan validasi adanya kode barang
            boolean kodeValid = false;
            do{
                System.out.print("Masukkan Kode         : ");
                kodeInput[i] = input.nextLine();
                for(int j = 0; j < kodeBarang.length; j++){
                    if(kodeBarang[j].equals(kodeInput[i])){
                        kodeValid = true;
                        break;
                    }
                }
                if(!kodeValid){
                    System.out.println("Kode barang tidak valid, silakan coba lagi.");
                }
            }while (!kodeValid);

            // Input jumlah beli
            System.out.print("Masukkan jumlah beli  : ");
            jumlahBeli[i] = input.nextInt();
            input.nextLine();
        }

        // Menampilkan hasil pembelian
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===========================================================================");

        int totalBayar = 0;

        // Cetak hasil pembelian
        for(int i = 0; i < jumlahItem; i++){
            int indexBarang = -1;

            // Mencari kode barang yang sesuai dengan input
            for(int j = 0; j < kodeBarang.length; j++){
                if (kodeBarang[j].equals(kodeInput[i])){
                    indexBarang = j;
                    break;
                }
            }

            // Hitung jumlah bayar
            int jumlahBayar = hargaBarang[indexBarang] * jumlahBeli[i];
            totalBayar += jumlahBayar;

            // Menampilkan data
            System.out.print((i + 1) + "\t");
            System.out.print(kodeBarang[indexBarang] + "\t\t");
            // Memastikan nama yang panjang agar rapih dalam tabel
            if ("005".equals(kodeBarang[indexBarang])){
                System.out.print(namaBarang[indexBarang] + "\t");
            } else {
                System.out.print(namaBarang[indexBarang] + "\t\t");
            }
            System.out.print(hargaBarang[indexBarang] + "\t");
            System.out.print(jumlahBeli[i] + "\t\t");
            System.out.println(jumlahBayar);
        }
        
        System.out.println("===========================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("===========================================================================");
    }
}
