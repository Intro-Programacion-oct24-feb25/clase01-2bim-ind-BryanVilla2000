/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        double fahrenhei= 20;
        double celcius;
        String cadena="";
        for (int i = 0; i <= 20; i++) {
            
            celcius= (5.0/9)*(fahrenhei-32);
            
            cadena= String.format("%sOperacion(%d) Fahrenheit: %.2f ===> Calecius;"
                    + " %.2f\n",
                    cadena,
                    i,
                    fahrenhei,
                    celcius);
            fahrenhei=fahrenhei+4;
        }
        System.out.printf("%s\n", cadena);
    }
}
