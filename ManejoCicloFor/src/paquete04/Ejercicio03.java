/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int contador = 1; contador <= i; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
            if (i == 5) {
                for (int j = i; j >= 1; j--) {
            for (int contador = 1; contador <= j; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
            }
        }
    }
}
