/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import tipoProducto.alimentacion;
import tipoProducto.higiene;
import tipoProducto.mascotas;
import tipoProducto.drogueria;
import tipoContenedor.bolsa;
import tipoContenedor.caja;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class supermercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        contenedor bolsa = new bolsa();
        contenedor caja = new caja();

        producto productoAL_CO = new alimentacion(1, "Pescado", 15.5, 20.6,"Alimento", "Congelado");
        producto productoAl_FR = new alimentacion(1, "Frito Lay Mayonesa", 15.5, 20.6,"Alimento", "Fresco");
        producto productoAl_NP = new alimentacion(1, "Arveja", 15.5, 20.6,"Alimento", "No perecedero");
        producto productoDr    = new drogueria(1, "Clonazepam", 15.5, 20.6, "Ansiolítico");
        producto productoHg    = new higiene(1, "HI01", 15.5, 20.6, "Papel higiénico");
        producto Mascota       = new mascotas(1, "MA01", 15.5, 20.6, "Cocker Spaniel");

        System.out.println("Bienvenido al supermercado sOOPer! \n"
                + "Deseas realizar un pedido? \n"
                + "1. Sí. \n"
                + "0. No");

        byte opcion = sc.nextByte();

        switch (opcion) {
            case 1:
                pedido pedido = new pedido("01_sOOPer_UFPS");
                pedido.realizarPedido();

                break;
            case 0:
                System.out.println("Hasta luego! Gracias por confiar en sOOPer");

                break;
            default:
                throw new AssertionError();
        }
    }

}
