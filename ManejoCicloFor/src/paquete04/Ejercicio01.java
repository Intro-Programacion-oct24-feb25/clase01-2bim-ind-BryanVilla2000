/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int operacion;
        String cadena = "";
        for (int i = 30; i >= 10; i--) {
            cadena = String.format("%s%d", cadena,i);
            for (int j = 2; j <= 4; j++) {
                operacion = i * j;
                cadena = String.format("%s-%d", cadena,
                         operacion);
            }
            cadena = String.format("%s\n", cadena);
        }
         System.out.printf("%s\n", cadena);
    }
}
