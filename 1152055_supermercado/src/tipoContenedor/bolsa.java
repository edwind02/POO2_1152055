/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoContenedor;

import Main.contenedor;

/**
 *
 * @author 
 */
public class bolsa extends contenedor {

    private double volumen;

    public bolsa() {
    }

    public bolsa(double volumen, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.volumen = calcularVolumen();
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * largo * alto;
        return volumen; //To change body of generated methods, choose Tools | Templates.
    }

}
