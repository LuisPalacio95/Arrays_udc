/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class punto1_e_f_g {

    public static void main(String[] args) {

        /*Se declara y define un arreglo tipo String en 
        una variable llama dataStructs*/
        //Punto E.
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        for (String i : dataStructs) {
            System.out.println(i);
        }

        //Punto F
        System.out.println("\nImpresion de caracteristicas");
        String[] caracteristicas = new String[5];
        caracteristicas[0] = "i.	Simples, Circulares y Enlazadas";
        caracteristicas[1] = "ii.	Primero en entrar, Primero en Salir. Último en entrar, "
                + "Primero en salir";
        caracteristicas[2] = "iii.	Primero en entrar, ultimo en salir";
        caracteristicas[3] = "iv.	Parejas de clave y valor";
        caracteristicas[4] = "v.	Elementos no repetidos";

        for (int i = 0; i < 5; i++) {
            System.out.println(caracteristicas[i]);
        }

        //Punto G
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngreso de datos por teclado:\n");
        System.out.println("Ingrese la caracteristica 1:");
        sc.nextLine();
        System.out.println("Ingrese la caracteristica 2:");
        sc.nextLine();
        System.out.println("Ingrese la caracteristica 3:");
        sc.nextLine();
        System.out.println("Ingrese la caracteristica 4:");
        sc.nextLine();
        System.out.println("Ingrese la caracteristica 5:");
        sc.nextLine();
    }
}
