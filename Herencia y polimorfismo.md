# Herencia

Al hablar de herencia en java hacemos referencia a una clase que pasa sus métodos y atributos a otra clase, tenemos entonces 3 tipos de clases en Java:

- **Superclase:** es la clase que pasa sus métodos y atributos a otra clase para que esta pueda utilizarlos. También conocida como clase padre.
- **Subclase:** es la clase que utiliza los métodos y atributos de otra clase para realizar alguna acción específica. También conocida como clase hija.

![Herencia en Java](https://user-images.githubusercontent.com/99680214/156586410-b79f52bd-0692-4420-87f0-a3a9559efb3f.png)

Las clases hijas heredan todos los métodos y atributos de la clase padre y tambien es posible declarar nuevos en ellas. Para declarar una clase hija de una clase padre debemos ocupar la
palabra *Extends*. La sintaxis es así:

```
public class ClaseHija extends ClasePadre {
   campos;
   metodos();
}
```
Ahora la clase hija, heredará todos los métodos y atributos de la clase padre. Cuando hablamos de herencia es común ocupar los métodos *this* y *super* para acceder a los métodos y atributos
de nuestras clases.

## This

this se refiere al objeto actual sobre el que está actuando un método determinado y se utiliza siempre que se quiera hace referencia al objeto actual de la clase.

Ejemplo:
```
class Miclase {
    // Variable de instancia
    int miVariable; 
    
    // Constructor de la clase
    public Miclase() {
        miVariable = 5;
        }
    
    // Metodo con argumentos
    void miMetodo(int miVariable) { 
        System.out.println( "La variable Local miVariable contiene "
            + miVariable );
        System.out.println( 
            "La variable de Instancia miVariable contiene " 
            + this.miVariable );
        }
    
    public static void main( String args[] ) { 
        // Instanciamos un objeto del tipo de la clase
        Miclase obj = new Miclase();
        // que utilizamos para llamar a su unico metodo
        obj.miMetodo( 10 ); 
        }
    }
```

## Super

Se puede usar la palabra super para acceder a miembros (atributos) de una clase padre, también se usa para acceder a métodos de la misma clase padre.

