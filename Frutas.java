public class Frutas {
    //Atributos de las clase: Las caracteristícas
    String nombre;
    String sabor;
    String forma;
    String color;

    //tipo de Constructores

    public Frutas(){
        //Constructor sin parámetros (constructor por defecto)
    }//Cierre del constructor

    public Frutas(String valorNombre){
        nombre = valorNombre;
    }

    public Frutas(String valorNombre,String valorSabor,String valorForma,String valorColor){
        //Constructor con parámetros que inicializa un objeto con esos parámetros
        nombre = valorNombre;
        sabor = valorSabor;
        forma = valorForma;
        color = valorColor;
    }//Cierre del constructor

    //Métodos de la clase
    public String getNombre(){
        //Método que regresa el nombre de la fruta
        return nombre;
    }

    public String getSabor(){
        //método que regresa el sabor de la fruta
        return sabor;
    }

    public String getForma(){
        //método que regresa la forma de la fruta
        return forma;
    }

    public String getColor(){
        //Método que regresa el color de la fruta
        return color;
    }

    public void miJugo(String nombre){
        System.out.println("¡Hice jugo de " + nombre+"¡");
    }

}
