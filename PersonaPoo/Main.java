class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(25);
    persona.setNombre("josé");
    persona.setTelefono(990000000);

    int edad = persona.getEdad();
    System.out.println("Edad: " + edad);

    String nombre = persona.getNombre();
    System.out.println("Nombre: " + nombre);

    int telefono = persona.getTelefono();
    System.out.println("Telefono: " + telefono);
  }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  // set edad
  public void setEdad(int valor) {
    this.edad = valor;
  }

  // get edad
  public int getEdad() {
    return this.edad;
  }

  // set nombre
  public void setNombre(String valor) {
    this.nombre = valor;
  }

  // get nombre
  public String getNombre() {
    return this.nombre;
  }

  // set telefono
  public void setTelefono(int valor) {
    this.telefono = valor;
  }

  // get telefono
  public int getTelefono() {
    return this.telefono;
  }
}