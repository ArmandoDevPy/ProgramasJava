class Main {
  public static void main(String[] args) {
    System.out.println("\nCLIENTE");
    Cliente cliente = new Cliente();
    cliente.edad = 33;
    cliente.nombre = "armando";
    cliente.telefono = 988888888;
    cliente.credito = 2000;
    System.out.println("Edad del cliente: "+cliente.edad);
    System.out.println("Nombre del cliente: "+cliente.nombre);
    System.out.println("Telefono del cliente: "+cliente.telefono);
    System.out.println("Credito del cliente: "+cliente.credito);

    System.out.println("\nTRABAJADOR");
    Trabajador trabajador = new Trabajador();
    trabajador.edad = 25;
    trabajador.nombre = "jackeline";
    trabajador.telefono = 999999999;
    trabajador.salario = 1800;
    System.out.println("Edad del trabajador: "+trabajador.edad);
    System.out.println("Nombre del trabajador: "+trabajador.nombre);
    System.out.println("Telefono del trabajador: "+trabajador.telefono);
    System.out.println("Salario del trabajador: "+trabajador.salario);
  }
}

class Persona{
  int edad;
  String nombre;
  int telefono;
}

class Cliente extends Persona{
  float credito;
}

class Trabajador extends Persona{
  float salario;
}