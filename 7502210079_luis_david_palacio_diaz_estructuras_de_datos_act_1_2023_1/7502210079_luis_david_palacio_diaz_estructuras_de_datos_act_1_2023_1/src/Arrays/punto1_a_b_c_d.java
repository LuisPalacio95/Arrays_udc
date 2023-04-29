/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/*
 * @author LUIS DAVID PALACIO DIAZ
 * Codigo  7502210079
 */
public class punto1_a_b_c_d {

    public static void main(String[] args) {

        // Punto A - B - C - D
        // Declarar un arreglo por cada uno de los tipos de datos primitivos:
        System.out.println("*** Declaracion de Arrays, definicion de tamano, "
                + "valores y su impresion *** \n *** Puntos A - B - C - D ***");

        /*Otra manera de realizar el codigo
        byte[] fechasDePago = {12, 13, 14, 15, 16};
        for (byte b : fechasDePago) {
            System.out.println(b);
        }
        
        Para imprimir la cantidad de valores que trae nuestro arreglo, en caso que sea muy extenso.
        byte[] fechasDePago = {12, 13, 14, 15, 16};
        for (byte b = 0; b <fechasDePago.length; b++) {
            System.out.println(fechasDePago[b]);
        }*/
        //Tipo de dato Byte
        System.out.println("\nTipo de dato Byte");
        byte[] fechasDePago = new byte[5];
        fechasDePago[0] = 3;
        fechasDePago[1] = 8;
        fechasDePago[2] = 13;
        fechasDePago[3] = 20;
        fechasDePago[4] = 28;

        for (int b = 0; b < 5; b++) {
            System.out.println(fechasDePago[b]);
        }

        //Tipo de dato char
        System.out.println("\nTipo de dato char");
        char[] inicialesDeNombresMasUsados = new char[5];
        inicialesDeNombresMasUsados[0] = 'e';
        inicialesDeNombresMasUsados[1] = 'f';
        inicialesDeNombresMasUsados[2] = 'h';
        inicialesDeNombresMasUsados[3] = 'p';
        inicialesDeNombresMasUsados[4] = 'a';

        for (int c = 0; c < 5; c++) {
            System.out.println(inicialesDeNombresMasUsados[c]);
        }

        //Tipo de dato short
        System.out.println("\nTipo de dato short");
        short[] numerosMasJugadosDeLoterias = new short[5];
        numerosMasJugadosDeLoterias[0] = 1528;
        numerosMasJugadosDeLoterias[1] = 2354;
        numerosMasJugadosDeLoterias[2] = 7837;
        numerosMasJugadosDeLoterias[3] = 1485;
        numerosMasJugadosDeLoterias[4] = 0472;

        for (int s = 0; s < 5; s++) {
            System.out.println(numerosMasJugadosDeLoterias[s]);
        }

        //Tipo de dato int
        System.out.println("\nTipo de dato int");
        int[] NumerosEnteros = new int[5];
        NumerosEnteros[0] = 40;
        NumerosEnteros[1] = 60;
        NumerosEnteros[2] = 80;
        NumerosEnteros[3] = 100;
        NumerosEnteros[4] = 120;

        for (int i = 0; i < 5; i++) {
            System.out.println(NumerosEnteros[i]);
        }

        //Tipo de dato long
        System.out.println("\nTipo de dato long");
        long[] numerosDeCuentasEmpleados = new long[5];
        numerosDeCuentasEmpleados[0] = 778333837363693L;
        numerosDeCuentasEmpleados[1] = 873653837363683L;
        numerosDeCuentasEmpleados[2] = 926343830986383L;
        numerosDeCuentasEmpleados[3] = 835493692354493L;
        numerosDeCuentasEmpleados[4] = 725684735272927L;

        for (int l = 0; l < 5; l++) {
            System.out.println(numerosDeCuentasEmpleados[l]);
        }

        //Tipo de dato float
        System.out.println("\nTipo de dato float");
        float[] temperatura_en_fahrenheit = new float[5];
        temperatura_en_fahrenheit[0] = 234f;
        temperatura_en_fahrenheit[1] = 938f;
        temperatura_en_fahrenheit[2] = 12f;
        temperatura_en_fahrenheit[3] = 84f;
        temperatura_en_fahrenheit[4] = 9f;

        for (int f = 0; f < 5; f++) {
            System.out.println(temperatura_en_fahrenheit[f]);
        }

        //Tipo de dato double
        System.out.println("\nTipo de dato double");
        double[] coordenadasTopograficas = new double[5];
        coordenadasTopograficas[0] = 37.93873873973783;
        coordenadasTopograficas[1] = 23.97364694638391;
        coordenadasTopograficas[2] = 37.73538464839363;
        coordenadasTopograficas[3] = -12.09330393386534;
        coordenadasTopograficas[4] = -34.74564827356373;

        for (int d = 0; d < 5; d++) {
            System.out.println(coordenadasTopograficas[d]);
        }

        //Tipo de dato Object
        System.out.println("\nTipo de dato Object");
        Object[] deportistasFamosos = new Object[5];
        deportistasFamosos[0] = "Messi";
        deportistasFamosos[1] = "Cristiano ronaldo";
        deportistasFamosos[2] = "Pele";
        deportistasFamosos[3] = "Maradonna";
        deportistasFamosos[4] = "El pibe";

        for (Object df : deportistasFamosos) {
            System.out.println(df);
        }

        //Tipo de dato String
        System.out.println("\nTipo de dato String");
        String[] animalesAcuaticos = new String[5];
        animalesAcuaticos[0] = "Ballena";
        animalesAcuaticos[1] = "Tiburon";
        animalesAcuaticos[2] = "Delfin";
        animalesAcuaticos[3] = "Pulpo";
        animalesAcuaticos[4] = "Megalodon";

        for (int a = 0; a < 5; a++) {
            System.out.println(animalesAcuaticos[a]);
        }
    }
}
