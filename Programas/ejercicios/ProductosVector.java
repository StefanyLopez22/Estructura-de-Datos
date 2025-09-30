package mx.edu.uttt.poo.ejercicios;

import javax.swing.*;

public class ProductosVector {    private Producto[] productos;
    private final int TAMANO = 2;

    public ProductosVector() {
        this.productos=new Producto[this.TAMANO];
    }

    public ProductosVector(int tamanio) {
        if(tamanio<=0)
            this.productos=new Producto [this.TAMANO];
        else
            this.productos=new Producto[tamanio];
    }


    public void llenarArreglo(Producto producto) {
        if (estalleno()){
            JOptionPane.showMessageDialog(null, "El vector esta lleno");
        }else{
            this.productos[buscarPosicion()]=producto;
        }
    }
    private int buscarPosicion(){
        int posicion=0;
        for(int i=0;i<this.productos.length;i++){
            if(this.productos[i]==null){
                posicion=i;
                break;

            }
        }
        return posicion;

    }

    public boolean estalleno(){
        boolean lleno=true;
        for(Producto producto: this.productos){
            if (producto ==null){
                lleno=false;
                break;
            }
        }
        return lleno;
    }
    public String imprimir(){
        String salida = "Lista de productos: \n";

//        for(Producto producto: this.productos){
//            salida+=producto.toString() + "\n";
//        }
        for(int i=0; i<this.productos.length; i++) {
            if(this.productos[i]!=null) {
                salida += this.productos[i].toString() + "Importe: " +
                        productos[i].getPrecio() * productos[i].getExistencia()
                        + "\n";
            }
        }

        return salida;
}

    public boolean eliminarProducto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null && this.productos[i].getNombre().equalsIgnoreCase(nombre)) {
                this.productos[i] = null; // lo hacemos nulo
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }


}