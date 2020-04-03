/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author me
 */
public class Pez extends Mascota {
     public Pez(String subtipoRaza, String nombre, String edad) {
        this.subTipoRaza = subtipoRaza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Pez() {
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
    
    public String nadar(){
        return this.nombre + " Está nadando en las profundidades de la pecera";
    }
    
    public String saltar(){
        return this.nombre + " Casi se escapa de la pecera de un salto";
    }

}
