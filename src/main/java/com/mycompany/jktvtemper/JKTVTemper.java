package com.mycompany.jktvtemper;

import java.util.Scanner;

/**
 *
 * @author kostj
 */
public class JKTVTemper {

    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Это конвертор температуры с Цельсий в Форенгейты.");
        System.out. print("Набери температуру в Цельсиях:");
        
        double cels = Scanner.nextDouble();
        /*Соотношение ((9*Цельс +(32*5))/5)*/
        double faren = ((9 * cels + (32*5)) / 5);
        System.out.println(cels + " Это в цельсиях. "+ "Получается что в форенгентах = " + faren);
    }
}
