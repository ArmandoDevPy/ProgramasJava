import java.io.IOException;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            menu();

            opcion = pedirOpcion();

            if(opcion != 5){
                System.out.print("Ingrese el primer numero: ");
                int numero1 = scanner.nextInt();

                int numero2;

                do {

                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = scanner.nextInt();

                    if (numero2 == 0){
                        System.out.println("EL DIVISOR NO PUEDE SER 0");
                    }

                }while(numero2 == 0);

                menuSwitch(opcion, numero1, numero2);
            }else{
                System.out.println("PROGRAMA FINALIZO");
            }

        }while(opcion != 5);
    }



    public static int pedirOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean seguir = false;

        do{
            System.out.print("Ingrese opcion: ");
            try{
                opcion = scanner.nextInt();

                if (opcion < 1 || opcion > 5){
                    System.out.println("INGRESE UN NUMERO EN EL RANGO DE 1 Y 5");
                }else {
                    seguir = true;
                }
            } catch (Exception e){
                System.out.println("INGRESE UN VALOR NUMERICO:  " + e.getMessage());
                scanner.nextLine();
            }

        }while(!seguir);

        return opcion;
    }

    public static void menu(){
        System.out.println("**** APLICACION CALCULADORA ****");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. SALIR");
    }

    public static void menuSwitch(int opcion, int num1, int num2){
        switch (opcion){
            case 1 -> System.out.println("La suma es: " + suma(num1, num2));

            case 2 -> System.out.println("La resta es: " + resta(num1, num2));

            case 3 -> System.out.println("La multiplicación es: " + multiplicacion(num1, num2));

            case 4 -> {
                if (num1 % num2 == 0) {
                    int resultadoEntero = (int) division(num1, num2);
                    System.out.println("la divisón es: " + resultadoEntero);
                } else {
                    double resultadoDecimal = (double) division(num1, num2);
                    System.out.println("La división es: " + resultadoDecimal);
                }
            }
        }
    }

    public static int suma(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    public static int resta(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }

    public static int multiplicacion(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public static double division(int numero1, int numero2){
        double division = numero1 / numero2;
        return division;
    }
}