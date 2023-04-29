/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */

public class punto2_a {

    public static void main(String[] args) {

        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};

        //Punto F
        String[] caracteristicas = new String[5];
        caracteristicas[0] = "i. Simples, Circulares y Enlazadas";
        caracteristicas[1] = "ii. Primero en entrar, Primero en Salir. Ultimo en entrar, Primero en salir";
        caracteristicas[2] = "iii. Primero en entrar, ultimo en salir";
        caracteristicas[3] = "iv. Parejas de clave y valor";
        caracteristicas[4] = "v. Elementos no repetidos";

        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + ": " + caracteristicas[i]);

        }
    }
}