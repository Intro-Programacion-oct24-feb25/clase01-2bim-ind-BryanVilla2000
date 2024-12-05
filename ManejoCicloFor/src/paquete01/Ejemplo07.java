/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        String mensajeFinal1 = "";
        String mensajeFinal2 = "";
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal1 = String.format("%sTabla de multiplicar del número %d\n", 
                    mensajeFinal1, i);
            mensajeFinal2 = String.format("%sTabla de sumar del número %d\n", 
                    mensajeFinal2, i);
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal1 = String.format("%s%d x %d = %d\n", 
                        mensajeFinal1, i, contador, operacion);
                operacion = i + contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal2 = String.format("%s%d + %d = %d\n", 
                        mensajeFinal2, i, contador, operacion);
            }
            // System.out.println("\n");
            mensajeFinal1 = String.format("%s\n", mensajeFinal1);
        } // termina for 01
        
        System.out.printf("%s\n", mensajeFinal1);
        System.out.printf("%s\n", mensajeFinal2);
    }
}
