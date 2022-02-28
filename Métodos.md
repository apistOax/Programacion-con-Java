# Métodos
*El código en Java se le desde arriba hasta abajo*. Al igual que en otros lenguajes de programación, las variables, métodos, funciones, se declaran antes de usarlas.
En general los métodos en java son bloques de código que se enargaran de realizar tareas repetitivas. Hablando de las clases con las cuales podemos crear objetos,
necesitamos inicializar esos objetos, una tarea sencilla, dónde el procedimiento es el mismo y lo único que cambia son los valores, aquí nos topamos con el constructor.

Para definir un método necesitamos modelar muy bien nuestro problema, conocer las posibles entradas y salidas que pueda necesitar nuestro bloque.

## Parámetros y argumentos
En el siguiente ejemplo ocupamos los parámetros y argumentos para hacer una operación matemática y regresar la suma al programa principal. 



```
public class Principal {
    static int suma(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int num1=10;
        int num2 = 20;
        int num3 = suma(num1, num2);
        System.out.println(num3);
    }
}

```

La salida al final será la suma: 30.

![Untitled Workspace](https://user-images.githubusercontent.com/99680214/156018466-16ee2e55-668b-4656-bb28-5e60ce31f0be.png)




