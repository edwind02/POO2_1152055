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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrera carrera = new Carrera("15","Ing de sistemas",120);
        Estudiante estudiante = new Estudiante("1152055", "Marcos", "Peñaloza", "Quinto", 50);
        Docente docente = new Docente("158070","Edwin","Duarte","Ingeniero de sistemas",513.25,1.60,55.2);
        Administrativo administrativo = new Administrativo("13170989","Andres","Rodriguez", 2018);
        System.out.println();
        docente.calcularIMC();
        System.out.println();
        estudiante.matricularProyectoGrado(carrera);
        System.out.println();
        administrativo.antiguedad();
        
    }
    
}
