package Entidades;

import java.util.Scanner;


public class Television extends Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int pulgadas;
    private boolean sintonizadorTdt;

    public Television() {
    }

    public Television(int pulgadas, boolean sintonizadorTdt) {
        this.pulgadas = pulgadas;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Television(int pulgadas, boolean sintonizadorTdt, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    public void crearTelevision(){
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor.");
        int pulgadasRta = leer.nextInt();
        this.pulgadas = pulgadasRta;
        System.out.println("Tiene sintonizador TDT? S/N");
        String sintonizadorRta = leer.next();
        if (sintonizadorRta.equalsIgnoreCase("s")) {
            this.sintonizadorTdt = true;
        } else if (sintonizadorRta.equalsIgnoreCase("n")) {
            this.sintonizadorTdt = false;
        }
        System.out.println("Precio base: 1000");
        this.precio = 1000;
        this.precio = precioFinal();
    }
    
    @Override
    public double precioFinal() {
        double pf = super.precioFinal();

        if (pulgadas >= 40) {
            System.out.println("Pulgadas mayor a 40: +30%");
            pf = pf * 1.3;
        }
        if (sintonizadorTdt == true) {
            System.out.println("Tiene sintetizador TDT: +500");
            pf += 500;
        }
        return pf;
    }
    
    @Override
    public String toString() {
        return "Television{" +
                "precio=" + getPrecio() +
                ", color='" + getColor() + '\'' +
                ", consumoEnergetico=" + getLetra() +
                ", peso=" + getPeso() +
                "pulgadas=" + pulgadas +
                ", sintonizadorTdt=" + sintonizadorTdt;
    }
    
}
