package mx.edu.uttt.areglos;
import mx.edu.uttt.poo.Alumno;

import java.lang.reflect.Array;

public class DeclaracionVectores {
    public static void main(String[] args) {
        // delcaracion de vecotres

        int v1[];
        double v2[], v3[];
        boolean v4[];
        char v5[];
        String v6[];
        // Alumno v7[];

        //crear el vector en memoria
        v1 = new int[4];
        v2 = new double[3];
        v3 = new double[3];
        v4 = new boolean[4];
        v5 = new char[5];
        v6 = new String[4];

        Alumno[] v7 = new Alumno[3];

        //declaracion de vector con valores uniciales
        double[] v8 = {3.2, 8.5, 8.9, 7.4};

        int tamaño = v1.length;
        System.out.println(tamaño);

        //imprimir valor de un arreglo
        try {
            System.out.println(v3[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El arreglo se desbordo");
        }
        System.out.println(esTmario(v1));
    }//cierre main

    public static int esTmario(int[] vector) {
        return vector.length;
    }
}//cierra la clase
        /*public static void imprimir (int[] vector){

            for (int i = 0; i < vector.length; i++) {
                System.out.println("| " + vector[i] + " | ");

            }
            System.out.println();
            int i = 0;
            do {
                System.out.println("| " + vector[i] + " | ");
                i++;
            } while (i < vector.length);

            System.out.println();

            i = 0;
            while (i < vector.length) {
                System.out.println("| " + vector[i] + "| ");
                i++;
            }

            for (int valor : vector) {
                System.out.println("| " + valor + " | ");
            }
        }
    }

*/