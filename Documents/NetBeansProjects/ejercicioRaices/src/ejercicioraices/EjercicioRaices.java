/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:
   - obtenerRaices(): imprime las 2 posibles soluciones
   - obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
   - criminal(): devuelve el valor del criminal (double),
     el criminal tiene la siguiente formula, b2-4ac
   - tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
     para que esto ocurra, el criminal debe ser mayor o igual que 0.
   - tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
     para que esto ocurra, el criminal debe ser igual que 0.
   - calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación,
     en caso de no existir solución, mostrarlo también.
Formula ecuación 2º grado: (-b±√(b^2-4ac))/2ª
Solo varia el signo delante de –b
 */
package ejercicioraices;

/**
 *
 * @author SAMSUNG
 */
public class EjercicioRaices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Raices Raiz = new Raices(1, 4, 4);
        
        Raiz.calcular();
    }
    
}
