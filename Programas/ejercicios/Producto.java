package mx.edu.uttt.poo.ejercicios;

public class Producto {

    private String nombre;
    private int existencia;
    private double precio;

    public Producto(){
        this.nombre="Sin Nombre";
    }
    public Producto(String nombre, int existencia, double precio){
   this.setNombre(nombre);
   this.setExistencia(existencia);
    this.setPrecio(precio);

    }

    //Metodo accesor (get)
    public String getNombre(){
        return this.nombre;
    }

    //metodo mutador (set)
    public void  setNombre(String nombre){
        this.nombre=nombre.toUpperCase();
    }
    public int getExistencia(){
        return this.existencia;
    }
    public void setExistencia(int existencia){
        if (existencia>=0)
            this.existencia=existencia;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        if (precio>=0.0)
            this.precio=precio;
    }
    @Override
    public String toString(){
        return "Nombre del Producto: " + getNombre()+
                "\nExistencia: "+ getExistencia()+
                "\nPrecio: "+ getPrecio();

    }


}
