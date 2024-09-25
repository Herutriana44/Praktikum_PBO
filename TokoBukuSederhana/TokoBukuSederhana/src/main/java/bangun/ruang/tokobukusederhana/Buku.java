/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang.tokobukusederhana;

/**
 *
 * @author Fasilkom
 */
public class Buku {
    private int[] IDBuku;
    private String[] judulBuku;
    private String[] penulis;
    private double[] harga;
    public int[] stok;
    public int n; // Keep track of the current number of books
    private static final int MAX_BOOKS = 1000; // Set a maximum limit for books
    
    // Constructor
    public Buku() {
        this.IDBuku = new int[MAX_BOOKS];
        this.judulBuku = new String[MAX_BOOKS];
        this.penulis = new String[MAX_BOOKS];
        this.harga = new double[MAX_BOOKS];
        this.stok = new int[MAX_BOOKS];
        this.n = 0; // Initialize n to zero
    }
    
    // Method to add a book
    public void tambahBuku(int IDBuku, String judulBuku, String penulis, double harga, int stok) {
        if (n < MAX_BOOKS) {
            this.IDBuku[n] = IDBuku;
            this.judulBuku[n] = judulBuku;
            this.penulis[n] = penulis;
            this.harga[n] = harga;
            this.stok[n] = stok;
            n += 1; // Increment the number of books
        } else {
            System.out.println("Maximum book limit reached. Cannot add more books.");
        }
    }
    
    // Method to display book details
    public void displayBuku(int id) {
        if (id >= 0 && id < n) { // Ensure the index is valid
            System.out.println("ID Buku: " + this.IDBuku[id]);
            System.out.println("Judul Buku: " + this.judulBuku[id]);
            System.out.println("Penulis: " + this.penulis[id]);
            System.out.println("Harga: " + this.harga[id]);
            System.out.println("Stok: " + this.stok[id]);
        } else {
            System.out.println("Invalid book ID.");
        }
    }

    public void listBuku()
    {
        System.out.println("List Buku Yang Dapat Dibeli : ");
        for(int i = 0; i < this.n; i++)
        {
            this.displayBuku(i);
            System.out.println("");
        }
    }

    public void updateBuku(int n, int IDBuku, String judulBuku, String penulis, double harga, int stok) {
        if (n < MAX_BOOKS && n <  this.n) {
            this.IDBuku[n] = IDBuku;
            this.judulBuku[n] = judulBuku;
            this.penulis[n] = penulis;
            this.harga[n] = harga;
            this.stok[n] = stok;
            // n += 1; // Increment the number of books
        } else {
            System.out.println("Maximum book limit reached. Cannot add more books.");
        }
    }

    
    public void updateStok(int n) {
        if (n < MAX_BOOKS && n <  this.n) {
            this.stok[n] -= 1;
            // n += 1; // Increment the number of books
        } else {
            System.out.println("Maximum book limit reached. Cannot add more books.");
        }
    }
}
