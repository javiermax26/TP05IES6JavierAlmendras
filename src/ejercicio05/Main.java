package ejercicio05;

import ejercicio05.model.Persona;

public class Main{
    public static void main(String[] args) throws Exception {
        int numeroA = 5;
        double numeroB = 3;
        // resolver una suma
        sumar(numeroA, numeroB);
        System.out.println(restar(numeroA, numeroB));
        construitTablaDelNumeroIndicado(numeroA);

        // llamar a la clase
        Persona Unpersona = new Persona();
        Unpersona.setNombre("gustavo");
        Unpersona.setApellido("sosa");
        Unpersona.setEdad(25);
        System.out.println("Persona: "+Unpersona.getApellido()+" tiene "+Unpersona.getEdad());
        
    }

        public static void sumar(int a, double b){
            double suma = a + b;
            System.out.println(suma);
    }
        public static double restar(int c, double d){
            double resta = c - d;
            return resta;
    }

        public static void construitTablaDelNumeroIndicado(int e){
           System.out.println("Tabla de multiplicar por "+e);
            for(int i = 1; i <= 10; i++){
            System.out.println(e*i);
        }
    }

}
