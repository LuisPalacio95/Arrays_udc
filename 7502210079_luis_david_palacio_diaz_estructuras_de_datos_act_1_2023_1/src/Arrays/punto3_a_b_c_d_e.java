/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.text.DecimalFormat;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */

public class punto3_a_b_c_d_e {

    public static void main(String[] args) {
        double[] ventas = {998.0, 453.9, 456.0, 234.0, 976.0, 24.0, 75.0};
        for (double i : ventas) {
            System.out.println("Los valores son: \n" + i);
        }

        double ventaMasAlta = buscarVentaMasAlta(ventas);
        System.out.println("La venta mas alta es: " + ventaMasAlta);

        double ventaMasBaja = buscarVentaMasBaja(ventas);
        System.out.println("La venta mas baja es: " + ventaMasBaja);

        double totalVentas = buscarTotalVentas(ventas);
        System.out.println("El total de las ventas es: " + totalVentas);

        DecimalFormat df = new DecimalFormat("#.##");
        double promVentas = buscarPromVentas(ventas);
        System.out.println("El promedio de la venta es: "
                + df.format(buscarPromVentas(ventas)));

        double ventaMasCercana = buscarVentaMasCercanaProm(ventas, promVentas);
        System.out.println("La venta mas cercana al promedio es: " + ventaMasCercana);

    }

    //Punto A
    public static double buscarVentaMasAlta(double[] ventas) {
        double ventaMasAlta = ventas[0];
        for (double venta : ventas) {
            if (venta > ventaMasAlta) {
                ventaMasAlta = venta;
            }
        }
        return ventaMasAlta;
    }

    //Punto B
    public static double buscarVentaMasBaja(double[] ventas) {
        double ventaMasBaja = ventas[0];
        for (double venta : ventas) {
            if (venta < ventaMasBaja) {
                ventaMasBaja = venta;
            }
        }
        return ventaMasBaja;
    }

    //Punto C
    public static double buscarTotalVentas(double[] ventas) {
        double totalVentas = 0;
        for (double venta : ventas) {
            if (venta > 0) {
                totalVentas += venta;
            }
        }
        return totalVentas;
    }

    //Punto D
    public static double buscarPromVentas(double[] ventas) {
        double totalVentas = buscarTotalVentas(ventas);
        double promVentas = totalVentas / ventas.length;
        return promVentas;
    }

    //PUNTO E
    public static double buscarVentaMasCercanaProm(double[] ventas, double promVentas) {
        double ventaMasCercanaProm = ventas[0];
        double difActual = Math.abs(ventas[0] - promVentas);
        int i = 1;
        while (i < ventas.length) {
            double venta = ventas[i];
            double dif = Math.abs(venta - promVentas);
            if (dif < difActual) {
                difActual = dif;
                ventaMasCercanaProm = venta;
            }
            i++;
        }
        return ventaMasCercanaProm;
    }

}
