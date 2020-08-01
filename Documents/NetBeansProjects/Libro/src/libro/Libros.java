/*
Crear una clase Libro que contenga los siguientes atributos:
   - ISBN
   - Titulo
   - Autor
   - Número de páginas
Crear sus respectivos métodos get y set correspondientes para cada atributo. 
Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
   "El libro su_titulo con ISBN su_ISBN creado por el autor su_autor tiene num_paginas páginas"
En el fichero main, crear 2 objetos Libro, los valores que se quieran, y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro;

/**
 *
 * @author SAMSUNG
 */
public class Libros {
    private int Ibsn;
    private String Titulo;
    private String Autor;
    private int NPaginas;
    
    public Libros(int Ibsn, String Titulo, String Autor, int NPaginas){
        this.Ibsn = Ibsn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NPaginas = NPaginas;
    }
    
    public int getIbsn(){
        return Ibsn;
    }
    
    public void serIbsn(int Ibsn){
        this.Ibsn = Ibsn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNPaginas() {
        return NPaginas;
    }

    public void setNPaginas(int NPaginas) {
        this.NPaginas = NPaginas;
    }
    
    @Override
    public String toString(){
        return "El libro: "+Titulo+
               ", con IBSN: "+Ibsn+
               ", del autor: "+Autor+
               ", contiene "+NPaginas+" paginas.";
    }
}
