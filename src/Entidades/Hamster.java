package Entidades;

public class Hamster extends Mascota {

    public Hamster(String subtipoRaza, String nombre, String edad) {
        this.subTipoRaza = subtipoRaza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Hamster() {
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

    public String rodar() {
        return this.nombre + " Ha rodado en su bolita";

    }

    public String esconderse() {
        return this.nombre + " Se ha escondido en su jaula";
    }

}
