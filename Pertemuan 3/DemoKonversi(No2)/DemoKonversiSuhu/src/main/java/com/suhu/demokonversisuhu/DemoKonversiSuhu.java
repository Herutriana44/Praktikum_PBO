/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.suhu.demokonversisuhu;

/**
 *
 * @author Fasilkom
 */
public class DemoKonversiSuhu {

    public static void main(String[] args) {
        KonversiSuhu2 tes2 = new KonversiSuhu2();
        tes2.celcius = 20;
        System.out.println("Celcius \t:\t" + tes2.celcius);
        System.out.println("Celcius to Fahrenheit\t:\t" + tes2.celciusToFahrenheit());
        System.out.println("Celcius to Reamur\t:\t" + tes2.celciusToReamur());
        System.out.println("Fahrenheit to Reamur\t:\t" + tes2.fahrenheitToReamur());
    }
}
