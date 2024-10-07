/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.uts.malashoteru;

import pbo.uts.db.Database;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Heru Triana
 * NPM      :   2110631170022
 */
public class MalasHoteru {

    public static void main(String[] args) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("=== Selamat Datang di MalasHoteru ===");
            System.out.println("1. Login");
            System.out.println("2. Create Account (Customer)");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            switch(pilihan) {
                case 1:
                    login(db, scanner);
                    break;
                case 2:
                    createAccount(db, scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
    
    private static void login(Database db, Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Cek apakah username dan password cocok untuk admin
        for (int i = 0; i < db.db_admin.length; i++) {
            if (db.db_admin[i].username.equals(username) && db.db_admin[i].password.equals(password)) {
                System.out.println("Login sebagai Admin berhasil!");
                adminMenu(db);
                return;
            }
        }

        // Cek apakah username dan password cocok untuk customer
        for (int i = 0; i < db.db_cust.length; i++) {
            if (db.db_cust[i].username.equals(username) && db.db_cust[i].password.equals(password)) {
                System.out.println("Login sebagai Customer berhasil!");
                customerMenu(db.db_cust[i], db, scanner);
                return;
            }
        }

        System.out.println("Username atau password salah!");
    }

    private static void createAccount(Database db, Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("No HP: ");
        String nohp = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Membuat Customer baru
        Customer newCustomer = new Customer(db.db_cust.length + 1, nama, nohp, username, password);

        // Menambahkan Customer baru ke database
        Customer[] newDbCust = new Customer[db.db_cust.length + 1];
        for (int i = 0; i < db.db_cust.length; i++) {
            newDbCust[i] = db.db_cust[i];
        }
        newDbCust[db.db_cust.length] = newCustomer;
        db.db_cust = newDbCust;

        System.out.println("Akun Customer berhasil dibuat!");
    }

    private static void customerMenu(Customer customer, Database db, Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\n=== Menu Customer ===");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Kamar");
            System.out.println("3. Detail Pesanan");
            System.out.println("4. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            switch (pilihan) {
                case 1:
                    pesanKamar(customer, db, scanner);
                    break;
                case 2:
                    cekKamar(customer, db);
                    break;
                case 3:
                    customer.detailPesanan();
                    break;
                case 4:
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    private static void adminMenu(Database db) {
        int pilihan;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Cek Kamar");
            System.out.println("2. Cek Data Customer");
            System.out.println("3. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            switch (pilihan) {
                case 1:
                    db.listKamar();
                    break;
                case 2:
                    for (int i = 0; i < db.db_cust.length; i++) {
                        db.db_cust[i].profile(); // Menampilkan profil customer
                    }
                    break;
                case 3:
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    private static void pesanKamar(Customer customer, Database db, Scanner scanner) {
        System.out.println("Daftar Kamar:");
        db.listKamar();
        System.out.print("Masukkan ID Kamar yang ingin dipesan: ");
        int idKamar = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character
        System.out.print("Masukkan Tanggal Reservasi: ");
        String tanggalReservasi = scanner.nextLine();

        Kamar kamar = db.getKamarById(idKamar);
        if (kamar != null) {
            customer.pesanKamar(kamar, tanggalReservasi);
            System.out.println("Kamar berhasil dipesan!");
        } else {
            System.out.println("ID Kamar tidak ditemukan!");
        }
    }

    private static void cekKamar(Customer customer, Database db) {
        System.out.print("Masukkan ID Kamar yang ingin dicek: ");
        int idKamar = new Scanner(System.in).nextInt();
        customer.cekKamar(idKamar);
    }
}
