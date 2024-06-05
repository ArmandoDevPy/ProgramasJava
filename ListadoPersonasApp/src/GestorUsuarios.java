import java.util.HashMap;

public class GestorUsuarios {
    private static final HashMap<Integer, Persona> personasMap = new HashMap<>();
    private static int numPersonas = 0;

    public static void agregarUsuario(String nombre, String telefono, String email) {
        Persona nuevaPersona = new Persona(++numPersonas, nombre, telefono, email);
        personasMap.put(nuevaPersona.getId(), nuevaPersona);
    }

    public static void listarUsuarios() {
        System.out.println("Datos de Usuario");
        for (Persona persona : personasMap.values()) {
            System.out.println(persona);
        }
    }
}
