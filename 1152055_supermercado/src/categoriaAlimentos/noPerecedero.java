/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categoriaAlimentos;

import tipoProducto.alimentacion;

/**
 *
 * @author 
 */
public class noPerecedero extends alimentacion {

    public noPerecedero() {
    }

    public noPerecedero(int id, String referencia, double volumen, double peso, String categoria, String categoriaAlimento) {
        super(id, referencia, volumen, peso, categoria, categoriaAlimento);
    }

}
