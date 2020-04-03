package Entidades;

public abstract class Mascota {

    public String subTipoRaza, nombre, edad;

    public String comer(String nombre) {
        return this.nombre + " está comiendo";
    }

    public String dormir(String nombre) {
        return this.nombre + " Está dormido, SHhhhhhhhhh!";
    }
}
