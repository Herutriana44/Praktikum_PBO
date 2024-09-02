/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bingo.bingomain;

/**
 *
 * @author MyPC One Pro L7Z
 */
public class Bingo {
    int num;
    char[] bingo = {'B', 'I', 'N', 'G', 'O'};
            
    Bingo(int num)
    {
        this.num = num;
    }
    
    void displayResult()
    {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        
        
        for(int j = 0; j < 3; j++)
        {
            for(int i = 0; i < bingo.length; i++)
            {
                if (i < this.num) {
                    System.out.print("(clap)");
                    if(i != bingo.length - 1)
                    {
                        System.out.print("-");
                    } else {
                        System.out.println();
                    }
                } else {
                    System.out.print(bingo[i]);
                    if(i != bingo.length - 1)
                    {
                        System.out.print("-");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
        
        System.out.println("And Bingo was his name-o.");
    }
}
