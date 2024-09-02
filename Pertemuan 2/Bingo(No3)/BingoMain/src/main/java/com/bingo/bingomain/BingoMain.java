/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bingo.bingomain;

/**
 *
 * @author MyPC One Pro L7Z
 */
public class BingoMain {

    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++)
        {
            Bingo bingo = new Bingo(i);
            bingo.displayResult();
            System.out.println();
        }
    };
}
