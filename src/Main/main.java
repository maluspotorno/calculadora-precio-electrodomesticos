package Main;

import Entidades.Lavadora;
import Entidades.Television;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        do {
            System.out.println("Seleccione un electrodoméstico.");
            System.out.println("1- Lavadora");
            System.out.println("2- Televisión");
            System.out.println("3- Salir");
            int rta = leer.nextInt();
            
            switch(rta) {
                case 1:
                    Lavadora l = new Lavadora();
                    l.crearLavadora();
                    System.out.println("PRECIO FINAL: " + l.getPrecio());
                    break;
                case 2:
                    Television t = new Television();
                    t.crearTelevision();
                    System.out.println("PRECIO FINAL: " + t.getPrecio());
                    break;
                case 3:
                    continuar = false;
                    break;    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (continuar);
    }
}
