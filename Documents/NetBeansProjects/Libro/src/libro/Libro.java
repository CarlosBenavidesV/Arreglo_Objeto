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
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros L1 = new Libros(978-84-122191-4-2, "La Niebla verde", "Enrique Javier de Lara", 192);
        Libros L2 = new Libros(978-84-122191-3-5, "Angel de Cristal", "Ricard Vidal Franch", 246);
        
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        
        //metodo set para cambiar el valor del numero de paginas.
        L1.setNPaginas(300);
        
        if (L1.getNPaginas() > L2.getNPaginas()){
            System.out.println("El libro: "+L1.getTitulo()+" contiene mas paginas");
        }else{
            System.out.println("El libro: "+L2.getTitulo()+" contiene mas paginas");
        }
    }
    
}
