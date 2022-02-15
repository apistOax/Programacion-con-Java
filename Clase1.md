# Introducción.

## Clases en java

En java el código se lee de arriba hacia abajo, además de estar estructurado por clases y objetos de esas clases. Cada archivo de programación que creamos se le conoce como clase y al final nuestro programa está conformado por un montón de clases. Todas las clases deben tener un constructor cuyo objetivo es inicializar (métodos y características) un objeto de esa clase, pero eso lo veremos después.

Al crear una clase en java, el nombre de nuestro archivo debe de ser el mismo que el de nuestra clase y tener la terminación **.java**, así nuestro archivo deberá llamarse **Primera.java**. Java es sensible a mayúsculas y minúsculas, debemos de recordar que tanto el nombre de nuestro archivo como el de nuestra clase debe de comenzar con Mayúscula. Tampoco es posible ocupar **palabras reservadas** en java como nombres de las clases. 


```
public class Primera {
    
}
```

### pero entonces ¿Qué es una clase?

Las clases forman parte del paradigma de la programación orientada a objetos **(POO)** u **(OPP)** por sus siglas en inglés. Una clase representa al conjunto de objetos que comparten una estructura y un comportamiento comunes. Por ejemplo

La clase smartphone puede tener objetos del tipo
- iPhone
- Redmi Note
- Galaxy Note

Todos estos objetos tienen comportamientos similares como: llamar(), recibirMensajes() y caracteristicas similares como tamañoDeMemoria, megaPixelesDeLaCamara, etc. 

## Variables
Java es un lenguaje de *tipado fuerte* es decir cuando definimos una variable tenemos que expresar el tipo de dato que se va a utilizar. Por ejemplo, al asignar a


```
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```
Cabe aclarar que la sintaxis es la siguiente *variable* = *expresión*;
por lo que siempre debemos de terminar nuestra linea de código con un punto y coma, así le decimos al compilador que hemos terminado la instrucción.

Los tipos de datos que tenemos en java son los siguientes:



La asignación produce un cambio de estado, se compone de una varibale y una expresión. Un programa está compuesto de una secuencia de instrucciones. Primero hay que definir las variables para luego realizar una serie de pasos empleando esas variables en un programa.

Como ya habiamos mencionado el código se le de arriba hacia abajo, así que si declaramos una varibale y le asignamos un valor e inmediatamente después le asignamos otro, se le quedara guardado el ultimo valor. 

```
int edad = 15;
edad = 20;
System.out.println(edad);
```
El resultado será 20.

En caso de necesitar que nuestra variable no pueda ser modificada después necesitamos ocupar la palabra reservada **final**, la declaración de una constante se hace de la siguiente manera:

```
final tipo nombreVble = valor;
```
Es posible concatenar diferentes tipos de variables en java con el simbolo "+", copia y modifica el siguiente código:

```
public class Presentacion {
    public static void main(String[] args) {
        final String nombre = "David";
        float altura = 1.60f;
        int edad = 24;
        edad = 12;
        System.out.println("Hola. Me llamo "+ nombre + " y tengo " + edad + " años y mido "+ altura+ "m");
        //se ocupa el simbolo + para concatenar variables.
        //Si se desea imprimir una sola variable no necesitamos ocupar el simbolo
        System.out.println(edad);
        System.out.println(nombre);
    }
}
```
