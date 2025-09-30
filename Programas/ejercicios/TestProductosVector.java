package mx.edu.uttt.poo.ejercicios;

import javax.swing.*;
//eliminar un producto

public class TestProductosVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de productos"));
        ProductosVector pv = new ProductosVector(tamanio);

        String opcion = "";
        boolean sentinel = true;//es para detener el while

        do {
            opcion = JOptionPane.showInputDialog(menu());

            switch (opcion){
                case "1":
                    if (!pv.estalleno())
                    pv.llenarArreglo(llenarProducto());
                    else
                        JOptionPane.showMessageDialog(null, "El vector esta lleno");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null ,pv.imprimir());
                  break;
                case "3":
                    JOptionPane.showMessageDialog(null ,pv.imprimir());
                    String nombreEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto a eliminar:");
                    if (pv.eliminarProducto(nombreEliminar)) {
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado");
                    }
                    break;

                case "4":
                      sentinel=false;
                      JOptionPane.showMessageDialog(null , "Gracias por todo");
                      break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida ");
            }
        }while (sentinel);
    
    }

    public static String menu(){
        return "Menu principal\n1)Agregar Producto\n" +
                "2)Imprimir productos\n" +
                "3)Eliminar producto\n" +
                "4)Salir\n" +
                "Elegir opcion:\n";

    }

    public static Producto llenarProducto(){
        //Crea el objeto del producto
        Producto producto = new Producto();

        //Solicitar los valores de las variables de instancia
        String nombre = JOptionPane.showInputDialog
                ("Introduce el nombre del producto");
        int existencia =  Integer.parseInt
                (JOptionPane.showInputDialog("Introduce la existencia"));

        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introdue el precio: "));
        //Asingan los valores a las variables de instancia del
        //objeto producto
        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);
        return producto;
    }
}