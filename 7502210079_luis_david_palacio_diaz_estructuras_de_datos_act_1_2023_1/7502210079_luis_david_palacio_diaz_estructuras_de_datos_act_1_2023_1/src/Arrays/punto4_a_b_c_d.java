/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class punto4_a_b_c_d {

    public static void main(String[] args) {

        System.out.println("Punto # 4 \nA - B - C - D");

        double[] ventas = {200.0, 920.0, 87.0, 417.0, 600.0, 765.0};
        ordenDescendente(ventas);
        System.out.println("\nVentas ordenadas de forma descendente: " + Arrays.toString(ventas));

        ordenAscendente(ventas);
        System.out.println("\nVentas ordenadas de forma ascendente: " + Arrays.toString(ventas));

        disorder(ventas);
        System.out.println("\nVentas desordenadas: " + Arrays.toString(ventas));

        ordenVentasParesImpares(ventas);
        System.out.println("\nVentas en orden pares e impares: " + Arrays.toString(ventas));

    }

    //PUNTO A
    public static void ordenDescendente(double[] ventas) {
        Arrays.sort(ventas);
        for (int i = 0; i < ventas.length / 2; i++) {
            double vlrTemp = ventas[i];
            ventas[i] = ventas[ventas.length - 1 - i];
            ventas[ventas.length - 1 - i] = vlrTemp;
        }
    }

    //PUNTO B
    public static void ordenAscendente(double[] ventas) {
        Arrays.sort(ventas);
    }

    //PUNTO C
    public static void disorder(double[] ventas) {
        Random random = new Random();
        for (int i = ventas.length - 1; i > 0; i--) {
            int in = random.nextInt(i + 1);
            double vlrTemp = ventas[in];
            ventas[in] = ventas[i];
            ventas[i] = vlrTemp;
        }
    }

    //Este codigo lo tengo de ejemplo ahora mismo ya que intento 
    //comprender el como funciona con diferentes ejemplos
    public static void ordenVentasParesImpares(double[] ventas) {
        double[] ventasPares = new double[ventas.length];
        double[] ventasImpares = new double[ventas.length];
        int par = 0, i = 0;
        for (double venta : ventas) {
            if (venta % 2 == 0) {
                ventasPares[par++] = venta;
            } else {
                ventasImpares[i++] = venta;
            }
        }
        Arrays.sort(ventasPares, 0, par);
        Arrays.sort(ventasImpares, 0, i);
        System.arraycopy(ventasPares, 0, ventas, 0, par);
        System.arraycopy(ventasImpares, 0, ventas, par, i);
    }
}
