import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final HashMap<Integer, Persona> personasMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            menu();

            opcion = opcion();

            menuSwitch(opcion);

        }while(opcion != 3);

        if(opcion == 3){
            System.out.println("PROGRAMA FINALIZO");
        }
    }

    public static void menu(){
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Salir");
    }

    public static void menuSwitch(int opcion){

        switch (opcion){
            case 1 -> agregar();
            case 2 -> listar();
        }
    }

    public static int opcion(){
        System.out.print("Ingrese una opcion: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void agregar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese el telefono: ");
        String telefono = scanner.next();

        System.out.print("Ingrese el email: ");
        String email = scanner.next();

        GestorUsuarios.agregarUsuario(nombre, telefono, email);
    }

    public static void listar() {
        GestorUsuarios.listarUsuarios();
    }
}
