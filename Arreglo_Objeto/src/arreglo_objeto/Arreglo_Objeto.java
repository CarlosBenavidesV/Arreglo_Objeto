/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_objeto;

import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Arreglo_Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Alumno a[] = new Alumno[3];

        String nombre = "";
        int matricula = 0;
        String grupo = "";
        int grado = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa tu nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingresa tu matricula");
            matricula = entrada.nextInt();
            System.out.println("Ingresa tu grupo");
            grupo = entrada.nextLine();
            System.out.println("Ingresa tu grado");
            grado = entrada.nextInt();
            a[i] = new Alumno(nombre, matricula, grupo, grado);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getNombre() + " " + a[i].getMatricula() + " " + a[i].getGrupo() + " " + a[i].getGrado());
        }
        // TODO code application logic here
    }

}
