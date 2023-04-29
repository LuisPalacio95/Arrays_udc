/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class punto5_a_b_c_d_e_f_g_h_i_j {

    public static void main(String[] args) {
        Object[][] lenguajes = new Object[5][8];
        lenguajes[0][0] = "NOMBRE";
        lenguajes[0][1] = "AÑO";
        lenguajes[0][2] = "AUTOR";
        lenguajes[0][3] = "DETALLES";
        lenguajes[0][4] = "FRAMEWORKS";
        infoLenguajes(lenguajes);

        boolean encontrado = buscarLenguaje("Java", lenguajes);
        System.out.println("Encontrado!");

        try {
            Object[] registro = obtenerRegistro(2, lenguajes);
            System.out.println(Arrays.toString(registro));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void infoLenguajes(Object[][] lenguajes) {
        Scanner sc = new Scanner(System.in);
        //Inicia en 1 para evitar la primera fila 

        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("Ingresa los datos para el lenguaje " + i + ":");
            System.out.println("Nombre: ");
            lenguajes[i][0] = sc.nextLine();
            System.out.println("Ano: ");
            lenguajes[i][1] = sc.nextLine();
            System.out.println("Autor: ");
            lenguajes[i][2] = sc.nextLine();
            System.out.println("Detalles: ");
            lenguajes[i][3] = sc.nextLine();
            System.out.println("Frameworks: ");
            lenguajes[i][4] = sc.nextLine();
        }
    }

    public static boolean buscarLenguaje(String nombreLenguaje, Object[][] lenguajes) {
        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }

    //Punto E
    public static int[] hallarLenguaje(String nombreLenguaje, Object[][] lenguajes) {
        for (int i = 1; 1 < lenguajes.length; i++) {
            for (int j = 0; j < lenguajes[i].length; j++) {
                if (lenguajes[i][0].equals(nombreLenguaje)) {
                    int[] coordenadas = {i, j};
                    return coordenadas;
                }
            }
        }
        return null;

    }

    public static Object[] obtenerRegistro(int fila, Object[][] lenguajes) throws Exception {
        if (fila < 1 || fila >= lenguajes.length) {
            throw new Exception("Fila no existe en la matriz de lenguajes");
        }
        return lenguajes[fila];
    }

}
