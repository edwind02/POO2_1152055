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
public class pedido {

    public String referencia;

    public pedido() {
    }

    public pedido(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void realizarPedido() {
        System.out.println("Qué deseas comprar?");
    }
}
