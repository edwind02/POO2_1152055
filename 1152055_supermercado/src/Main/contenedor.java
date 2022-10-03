/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author 
 */
public abstract class contenedor {

    public double ancho;
    public double largo;
    public double alto;

    public contenedor() {
    }

    public contenedor(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public abstract double calcularVolumen();
        
    
    @Override
    public String toString() {
        return "contenedor{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }

}
