# Introducción.

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

Todos estos objetos tienen comportamientos similares como: llamar(), recibirMensajes() y características como tamañoDeMemoria, megaPixelesDeLaCamara, etc. 

# Variables

Una variable es una palabra o símbolo que almacena un valor que puede cambiar. Por ejemplo tu edad es una variable porque cambia con el tiempo pero puede que tu nombre no, por lo que se le considera una constante.

Java es un lenguaje de *tipado fuerte* es decir cuando definimos una variable tenemos que expresar el tipo de dato que se va a utilizar.  No se permiten violaciones a la declaración del tipo de dato, es decir, dado el valor de una variable de un tipo concreto, no se puede usar como si fuera de otro tipo distinto a *menos* que se haga una conversión.

Veamos como se declara una variable en java. 

```
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

La sintaxis es la siguiente *variable* = *expresión*;

La asignación produce un cambio de estado y reserva espacio en la memoria para almacenar la variable que acabamos que declarar. La sintaxis de java nos dice que siempre debemos de terminar nuestra línea de código con un **punto y coma**, así le decimos al compilador que hemos terminado la instrucción.

En java, el código se le de arriba hacia abajo y de derecha a izquierda, así que si declaramos una variable y le asignamos un valor e inmediatamente después le asignamos otro, se le quedara guardado el ultimo valor.
 
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

## Tipo de datos

Java tiene distintos tipos de datos. Una buena practica de programación es solamente reservar la memoria necesaria que nuestro programa necesite. Aquí es donde entran en juego los distintos tipos de datos que existen pues cada uno almacena cierta cantidad de bits.

|Tipo de dato| Contiene| Tamaño|Rango|
|------------|-------|---------|-----|
|boolean|True, False |1 bit||
|byte|Entero|8 bits|[-128,127]|
|char|Character Unicode|16 bits|[0,65535]|
|short|Entero|16 bits|[-32768,32767]|
|int| Entero| 32 bits| [-2147483648, 2147483647]|
|long| Entero | 64 bits | [-9223372036854775808, 9223372036854775807]|
|float| Numeros Fraccionarios y hasta 7 digitos decimales| 32 bits|[±1.4012985E-45, ±3.4028235E+38]|
|double|Numeros Fraccionarios y hasta 15 digitos decimales|64 bits|[±4.94065645841246544E-324,±1.7976931348623157E+308]|


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
Hola. Me llamo David y tengo 12 años y mido 1.6m

12

David

## Operadores

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators
