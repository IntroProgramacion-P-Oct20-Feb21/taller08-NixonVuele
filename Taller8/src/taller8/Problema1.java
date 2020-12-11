/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

/**
 *
 * @author Nixon
 */
public class Problema1 {
    public static void main (String[] args){
        String palabra = "Universidad";
        char letra;
        for (int i = 0; i < palabra.length(); i++){
            letra = palabra.charAt (i);
            for (int j=0; j<=i; j++){
                System.out.printf("%s", letra);
            }
            System.out.println("");
        }
    }
}