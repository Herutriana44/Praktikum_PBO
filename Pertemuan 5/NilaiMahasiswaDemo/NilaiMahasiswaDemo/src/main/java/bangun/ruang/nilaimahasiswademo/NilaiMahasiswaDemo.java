/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bangun.ruang.nilaimahasiswademo;

import java.util.Scanner;

/**
 *
 * @author Fasilkom
 */
public class NilaiMahasiswaDemo {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("NPM Mahasiswa\t:\t");
        String npmMahasiswa = inp.nextLine();
        System.out.print("Nama Mahasiswa\t:\t");
        String namaMahasiswa = inp.nextLine();
        System.out.print("Nilai Kehadiran\t:\t");
        double kehadiran = inp.nextInt();
        System.out.print("Nilai Tugas\t:\t");
        double tugas = inp.nextInt();
        System.out.print("Nilai UTS\t:\t");
        double uts = inp.nextInt();
        System.out.print("Nilai UAS\t:\t");
        double uas = inp.nextInt();
        
        Mahasiswa mhs = new Mahasiswa(npmMahasiswa, namaMahasiswa, kehadiran, tugas, uts, uas);
        mhs.tampilanOutput();
    }
}
