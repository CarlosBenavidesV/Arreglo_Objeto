/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_objeto;

/**
 *
 * @author SAMSUNG
 */
public class Alumno {
    private String nombre;
    private int matricula;
    private String grupo;
    private int grado;
    
    public Alumno(){
        nombre = "";
        matricula = 0;
        grupo = "";
        grado = 0;
    }
    
    public Alumno(String n, int m, String g, int gr){
        this.nombre = n;
        this.matricula = m;
        this.grupo = g;
        this.grado = gr;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
