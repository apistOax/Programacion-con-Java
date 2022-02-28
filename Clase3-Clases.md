# Clases en java

Como ya habíamos dicho, Java es un lenguaje de programación orientado a objetos, es decir simula virtualmente la realidad por medio de clases, o *tipo de datos*. Las clases son un conjunto de objetos con características (datos) y comportamientos (funcionalidad) idénticos. Un programa son un conjunto de clases que interactúan entre sí. Este paradigma es más fácil de entender si tenemos conocimientos previos sobre la *teoría de conjuntos*.

Los tipos de datos que podemos declarar en java, por ejemplo *String* también son una clase que tienen sus propias características y comportamientos pero que fueron diseñados para representar una unidad de almacenamiento en la máquina. En java es el programador el que puede definir una clase para modelar el problema que está resolviendo. Es lo que hace poderoso al lenguaje.

 Es posible extender el lenguaje de programación añadiendo nuevos tipos de datos específicos de las necesidades de cada problema.

Pongamos de ejemplo al conjunto de las frutas o a la *Clase* frutas la cual tiene ciertas características:
- sabor: puede ser dulce o amargo
- forma: alargada, ovalada, redonda
- color: roja, verde, amarilla

pero tambien tiene ciertos comportamientos o que es lo que podemos hacer con ellas
- hacer jugo
- comerla
- pelarla
- etc.

![conjuntos-y-subconjuntos-1](https://user-images.githubusercontent.com/99680214/154113419-fd119d80-6e9a-4584-88de-758469ff0ab1.png)

|Clase| Objeto|
|-----|--------|
|Fruta|manzana platano aguacate|

Podemos decir entonces que un objeto es una instancia de una clase que hereda todo los metodos y variables de la clase.

### Ejercicio: Crea tu propia clase frutas con los atributos que vimos

```
public class Frutas {
    //Atributos de las clase: Las caracteristícas
    String nombre;
    String sabor;
    String forma;
    String color;
    }
```
### Constructores

Cuando creamos una clase es necesario crear un constructor. Un constructor es un método que inicializara un objeto de la clase. Como veremos después un constructor debe ser del tipo *public* pues solo podra accederse a el mediante objetos.

```
    public Frutas(){
        //Constructor sin parámetros (constructor por defecto)
    }//Cierre del constructor
```
El anterior constructor inicializa un objeto de una clase sin parametros, es decir, será iniciado con los valores predeterminados por el sistema:
- Los atributos numéricos a cero
- Los alfanuméricos a nulo
- Las referencias a objetos a null

Podemos tener tantos constructores como queramos o necesitemos, siempre y cuando cada uno inicialice un objeto de manera diferente. 
```
    public Frutas(String valorNombre){
        //Constructor que solo inicializa el atributo nombre del objeto
        nombre = valorNombre;
    }
```
El anterior constructor solo inicializa el nombre, pero el de a continuación inicializa todos los parámetros, dependerá de nosotros y del tipo de problema que estemos resolviendo para crear el o los constructores que necesitemos.

```
    public Frutas(String valorNombre,String valorSabor,String valorForma,String valorColor){
        //Constructor que recibe parámetros con los que inicializa los atributos del objeto
        nombre = valorNombre;
        sabor = valorSabor;
        forma = valorForma;
        color = valorColor;
    }//Cierre del constructor
```

## Métodos Set y Get
*El código de java se lee de arriba hacía abajo* es por eso que cuando creamos una clase declaramos los atributos de las clases seguido de los *Constructores* pues necesitamos inicializar los objetos de esa clase, como ya vimos podemos crear tantos constructores que creemos sean necesarios.

Enseguida debemos creear los *métodos* **set()** y **get()** pues estos son los que nos van a ayudar a ver o modificar la información que tenemos de los objetos de la clase. Ambos métodos comparten la misma sintaxis, 

### método get()

Este método, como lo dice su nombre es el que *obtiene* los valores de nuestros objetos que hemos *inicializado* con nuestros constructores.
La sintaxis es así

```
    public String getForma(){
        //método que regresa la forma de la fruta
        return forma;
    }
```
- La palabra *public* hace referencia (entre otras cosas) a que es un método al que solo podrá acceder un objeto
- Enseguida tenemos la pabra *String* que significa el tipo de dato que *Regresara* al programa principal o el que lo mandó a llamar.
- getForma() es el nombre de nuestro método, puede ser cualquiera, sin embargo siempre se recomienda tener congruencia con los nombres de nuestra variables y funciones.
- La única instrucción que tiene este método es la de *regresar* el valor que tiene almacenado el atributo forma de la clase frutas, a eso hace referencia la palabra *return*.

Para que lo tengas más claro, te pongo un ejemplo. Con la misma clase frutas y ya definidos los constructores que tenemos vamos a crear dos objetos de esta clase, uno completamente inicializado y otro sin parámetros.

```
        Frutas Manzana = new Frutas("Manzanita", "Dulce","Redonda","Rojo");
        Frutas fruta1 =  new Frutas();
```
al usar el método getForma() accederemos a los valores que tienen el atributo forma.
```
        System.out.println("La forma de la fruta es : " + Manzana.getForma());
        System.out.println("La forma de la fruta es : " + fruta1.getForma());
```
La salida es:

La forma de la fruta es : Redonda

La forma de la fruta es : null

### Método set()
Este método es el opuesto al get(), con el no vamos a obtener ningún valor, vamos como su nombre lo dice **Fijar** valores a nuestras variables que representan nuestros atributos. 

La estructura es similar

```
    public void setForma(String valorForma){
        this.forma = valorForma;
    }
```
- Enseguida de *public* tenemos la pabra *void* que significa el tipo de dato que *Regresara* al programa que lo mandó a llamar, en este caso *ninguno* pues este método solo se encarga de sobre escribir o modificar los valores del atributo forma y nada más
- setForma() es el nombre de nuestro método.
- (String forma) es porque necesitamos un valor con el cual modificar nuestro atributo y está parte se encarga de recibirla, recibe el tipo de dato y el nombre de la variable.
- La palabras this se refiere a *Esta* instancia, lo cual solo modificara el objeto y no a la clase
