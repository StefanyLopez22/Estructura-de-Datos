package mx.edu.uttt.poo;

public class Alumno {
    //Variables de instancia
    private String nombre;
    private int edad;
    private char sexo;
    private String colorPiel;
    public Alumno(){
    this.setNombre("Sin Nombre");
    this.setEdad(17);
    this.setSexo('I');
    this.setColorPiel("Neutro");

    }
    public Alumno (String nombre, int edad,char sexo, String colorPiel){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setColorPiel(colorPiel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad >=17?edad:17;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo == 'h' || sexo == 'H' || sexo == 'm' || sexo == 'M' ? sexo: 'I';
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        colorPiel = colorPiel.toUpperCase();
        switch (colorPiel){
            case "BLANCO":
            case "WHITE":
                this.colorPiel = colorPiel;
                break;
            case "NEGRO":
            case  "BLACK" :
                this.colorPiel=colorPiel;
                break;
            default:
                this.colorPiel = "NEUTRO";
        }
        this.colorPiel = colorPiel;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", colorPiel='" + colorPiel + '\'' +
                '}';
    }
}
