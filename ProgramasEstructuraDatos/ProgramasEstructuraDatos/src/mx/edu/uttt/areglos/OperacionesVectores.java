package mx.edu.uttt.areglos;

import javax.swing.*;

public class OperacionesVectores {

    private double [] vector;
    private final int TAMANO=5;
    public OperacionesVectores(){
        vector =new double[TAMANO];

    }

    public OperacionesVectores (double [] vector){
        this.vector =new double[vector.length];
        llenarVector(vector);
    }
    public void llenarVector(double [] vector){
        for (int i=0; i<vector.length; i++){
            this.vector [i] =vector[i];

        }
    }
    public void llenarVector(){
        int i=0;
        do {
            this.vector[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posicion [ " + (i + 1) + "]"));
            i++;
        }while (i<this.vector.length);
    }
    public void imprimir (){
        this.toString();
    }
        public double sumarElementos(double [] vector){
            double op1 = 0;
            for (int i = 0; i < vector.length; i++) {
                op1 += vector[i];
            }
            return op1;

    }

    public double obtenerMaximoValor(){
        int i=0;
        double maximo = 0.0;
        while (i<this.vector.length){
            if (maximo<this.vector[i]){
                maximo =vector[i];
            }
i++;        }
        return maximo;
    }
    public void cambiarTamanioArreglo(int tamanio){

        if (vector.length >=tamanio){
            double tem[] = new double[tamanio];
            for (int i=0; i<=this.vector.length;i++){
                tem[i] = vector[i];
        }
            tem =null;
            return;
        }
        System.out.println("No se puede crear un arreglo mas pequeño que el vector");
    }

    public boolean compararArreglos(double [] vector){
        boolean isEqual = true;

        if (this.vector.length != vector.length){
            isEqual = false;
        }else {
            for (int i = 0; i <this.vector.length && isEqual ; i++) {
                if (vector[i] != this.vector [i]){
                    isEqual =false;
                }
            }
        }
        return isEqual;
    }
    @Override
    public String toString (){
        String salida ="";
        for (double valor: this.vector){
            salida+="| " +valor + " |";
        }
        return salida;
    }
}
