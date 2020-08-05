/*
                         Ejercicio #8 Herencia, empleado y abstracción.
Nos piden hacer una un programa que gestione empleados.
Los empleados se definen por tener:
   • Nombre
   • Edad
   • Salario
También tendremos una constante llamada PLUS, que tendrá un valor de 300€
Tenemos dos tipos de empleados: repartidor y comercial.
El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double).
El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).
Crea sus constructores, getters and setters y toString (piensa como aprovechar la herencia).
No se podrán crear objetos del tipo Empleado (la clase padre) pero si de sus hijas.
Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación distinta.
Este plus básicamente aumenta el salario del empleado.
   • En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicara el plus.
   • En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.
Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar que funciona.
 */
package ejer_poo;

import com.sun.org.apache.xpath.internal.operations.Plus;

/**
 *
 * @author SAMSUNG
 */
public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public final double plus = 300;
    
    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;    
    }
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
        
        @Override
        public String toString(){
            return "El empleado: "+nombre+
                   ", con la edad de: "+edad+
                   " años y cuenta con un salario de: "+salario;
        }
        
        public abstract boolean plus();
}
