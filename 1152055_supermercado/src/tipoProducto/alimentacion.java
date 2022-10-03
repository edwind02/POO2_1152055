/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoProducto;

import Main.producto;
import categoriaAlimentos.congelado;
import categoriaAlimentos.fresco;
import categoriaAlimentos.noPerecedero;

/**
 *
 * @author 
 */
public class alimentacion extends producto {

    String categoriaAlimento;

    public alimentacion() {
    }

    public alimentacion(int id, String referencia, double volumen, double peso, String categoria, String categoriaAlimento) {
        super(id, referencia, volumen, peso, categoria);
        this.categoriaAlimento = categoriaAlimento(categoria);
    }

    public String categoriaAlimento(String categoria) {

        switch (categoria) {
            case "Fresco":
                alimentacion productoFR = new fresco(super.getId(), super.getReferencia(), super.getVolumen(), super.getPeso(), super.getCategoria(), categoria);
                break;

            case "Congelado":
                alimentacion productoCO = new congelado(super.getId(), super.getReferencia(), super.getVolumen(), super.getPeso(), super.getCategoria(), categoria);
                break;

            case "No perecedero":
                alimentacion productoNP = new noPerecedero(super.getId(), super.getReferencia(), super.getVolumen(), super.getPeso(), super.getCategoria(), categoria);
                break;

            default:
                throw new AssertionError();
        }
        return categoria;
    }

//    enum Alimentacion {
//        FRESCO("Fresco"), CONGELADO("Congelado"), NO_PERECEDERO("No perecedero");
//
//        private String catAlimentacion;
//
//        private Alimentacion(String catAlimentacion) {
//            this.catAlimentacion = catAlimentacion;
//        }
//
//        public String getCatAlimentacion() {
//            return catAlimentacion;
//        }
//
//        public void setCatAlimentacion(String catAlimentacion) {
//            this.catAlimentacion = catAlimentacion;
//        }
//    }
}
