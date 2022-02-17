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
        //Constructor con parámetros que inicializa un objeto con esos parámetros
        nombre = valorNombre;
        sabor = valorSabor;
        forma = valorForma;
        color = valorColor;
    }//Cierre del constructor
```

