/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.suhu.demokonversisuhu;

/**
 *
 * @author Fasilkom
 */
public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur()
    {
        double celcius = this.celcius;
        double fahrenheit = this.celciusToFahrenheit();
//        double reamur = this.celciusToReamur();
        return ((80*(fahrenheit-32))/180);
    }
}
