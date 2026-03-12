package ejercicio01;

public class Main {
    public static void main(String[] args) throws Exception {

    // linea de comentario
    // datos primitivos
    // declarar variables e inicianilizar

    int numeroA = 3; 
    double numeroB = 5.2;
    boolean bandera = true;
    char caracter = '$';

    // variable de tipo clase

    String mensaje01 = "las variables son: ";
    String mensaje02 = " que es un numero entero: ";
    double longitudDeLaCadena = mensaje01.length();

    System.out.println(mensaje01+numeroA+mensaje02+" y el tamaño del mensaje es:"+longitudDeLaCadena);
    }
}
