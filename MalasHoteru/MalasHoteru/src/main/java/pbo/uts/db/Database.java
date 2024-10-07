/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts.db;

import pbo.uts.malashoteru.*;

/**
 *
 * @author laboran
 */
public class Database {
    public Kamar obj_kamar;
    public Customer obj_customer;
    public Admin obj_admin;
    public Kamar[] db_kamar = {
        new Kamar(0),
        new Kamar(1),
        new Kamar(2)
    };
    public Customer[] db_cust = {
        new Customer(1, "Alice", "08123456789", "alice123", "password1"),
        new Customer(2, "Bob", "08234567890", "bob456", "password2"),
        new Customer(3, "Charlie", "08345678901", "charlie789", "password3")
    };
    public Admin[] db_admin = {
        new Admin(1, "Admin1", "08123456780", "admin1", "adminpass1"),
        new Admin(2, "Admin2", "08234567881", "admin2", "adminpass2")
    };
    
    public void listKamar() {
        System.out.println("Daftar Kamar:");
        for (int i = 0; i < db_kamar.length; i++) {
            this.db_kamar[i].info();
        }
    }
    
    public Customer getCustomerById(int id) {
        for (int i = 0; i < db_cust.length; i++) {
            if (db_cust[i].id == id) {
                return db_cust[i];
            }
        }
        return null;
    }
    
    public Kamar getKamarById(int id) {
        for (int i = 0; i < db_kamar.length; i++) {
            if (db_kamar[i].idKamar == id) {
                return db_kamar[i];
            }
        }
        return null; // Jika kamar tidak ditemukan
    }
    
    
}
