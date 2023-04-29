/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.text.DecimalFormat;
import java.util.Random;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class punto2_b_c_d_e_f_g_h {

    public static void main(String[] args) {
        //Declaracion de arreglo de un entero en una variable llamada venta

        //int[] ventas = new int[0];
        //Inicializar arreglo con una cantidad aleatoria de elementos
        Random ra = new Random();
        int cantidadVentas = ra.nextInt(17) + 1;
        int[] ventas = new int[cantidadVentas];

        for (int i = 0; i < cantidadVentas; i++) {
            ventas[i] = ra.nextInt(1000);
        }

        System.out.println("Valores aleatorios: ");
        for (int venta : ventas) {
            System.out.println(venta);
        }
        System.out.println("La cantidad de ventas es: " + ventas.length);

        int totalV = 0;
        for (int venta : ventas) {
            totalV += venta;
        }
        System.out.println("El total de las ventas es: " + totalV);

        double promVentas = (double) totalV / ventas.length;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("El promedio de ventas es: " + df.format(promVentas));
    }
}
