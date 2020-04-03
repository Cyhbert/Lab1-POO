package Entidades;

public class Ave extends Mascota {

    public Ave(String subtipoRaza, String nombre, String edad) {
        this.subTipoRaza = subtipoRaza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Ave() {
    }

    //Getters y Setters

    public String getSubTipoRaza() {
        return subTipoRaza;
    }

    public void setSubTipoRaza(String subTipoRaza) {
        this.subTipoRaza = subTipoRaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    public String dormir() {
        return super.dormir(this.nombre); //To change body of generated methods, choose Tools | Templates.
    }

    public String comer() {
        return super.comer(this.nombre); //To change body of generated methods, choose Tools | Templates.
    }

    public String volar() {
        return this.nombre + " Está volando";
    }

    public String cantar() {
        return this.nombre + " Ha cantado";
    }

}
