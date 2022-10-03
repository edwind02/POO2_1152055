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
public class producto {

    private int id;
    private String referencia;
    private double volumen;
    private double peso;
    private String categoria;

    public producto() {
    }

    public producto(int id, String referencia, double volumen, double peso, String categoria) {
        this.id = id;
        this.referencia = referencia;
        this.volumen = volumen;
        this.peso = peso;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
       this.id = id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "producto{" + "id=" + id + ", referencia=" + referencia + ", volumen=" + volumen + ", peso=" + peso + ", categoria=" + categoria + '}';
    }

}
