package Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int carga;
    
    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora.");
        int cargaRta = leer.nextInt();
        this.carga = cargaRta;
        System.out.println("Precio base: 1000");
        this.precio = 1000;
        this.precio = precioFinal();
    }
    
    @Override
    public double precioFinal() {
        double pf = super.precioFinal();

        if (carga >= 30) {
            System.out.println("Carga mayor a 30kg: +500");
            pf += 500;
        }
        return pf;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + getPrecio() +
                ", color='" + getColor() + '\'' +
                ", consumoEnergetico=" + getLetra() +
                ", peso=" + getPeso() +
                ", carga=" + carga +
                '}';
    }
    
}
