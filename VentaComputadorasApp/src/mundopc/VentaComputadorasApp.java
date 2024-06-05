package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
    //crear objeto
        Raton ratonLenovo = new Raton("bluetooth","Lenovo");
        //System.out.println(ratonLenovo);

        Teclado tecladoLenvo = new Teclado("bluetooth","Lenovo");
        //System.out.println(tecladoLenvo);

        Monitor monitorLenovo = new Monitor("Lenovo", 27);
       // System.out.println(monitorLenovo);

        //creamos un objeto de tipo computadora

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo,tecladoLenvo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        // objeto computadora

        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creamos una orden

        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        //Computadora Mac

        Monitor monitorMac = new Monitor("Mac",27);
        Teclado tecladoMac = new Teclado("bluetooth","Mac");
        Raton ratonMac = new Raton("bluetooth","Mac");
        Computadora computadoraImac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraImac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostrarOrden();
    }
}

