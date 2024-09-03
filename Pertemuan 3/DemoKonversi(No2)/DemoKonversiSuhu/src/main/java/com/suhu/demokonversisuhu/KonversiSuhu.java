/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.suhu.demokonversisuhu;

/**
 *
 * @author Fasilkom
 */
public class KonversiSuhu {
    public double celcius;
    
    public double celciusToFahrenheit()
    {
        return ((this.celcius* 180)/100) + 32;
    }
    
    public double celciusToReamur()
    {
        return ((this.celcius* 80)/100);
    }
}
