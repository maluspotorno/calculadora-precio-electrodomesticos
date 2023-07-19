package Entidades;

import java.util.Scanner;


public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letra, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return consumoEnergetico;
    }

    public void setLetra(char letra) {
        this.consumoEnergetico = letra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char l : letrasValidas) {
            if (Character.toUpperCase(letra) == l) {
                return Character.toUpperCase(letra);
            }
        }
        return 'F';
    }
    
    private String  comprobarColor(String color){
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        String colorValido = color.toLowerCase();
        for (String c : coloresValidos) {
            if (colorValido.equals(c)) {
                return c;
            }
        }
        return "blanco";
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el color del electrodoméstico. Los colores disponibles son: ");
        System.out.println("BLANCO, NEGRO, ROJO, AZUL Y GRIS");
        System.out.println("Si se ingresa un color no disponible, se asignará blanco por defecto.");
        String colorRta = leer.next();
        this.color = comprobarColor(colorRta);
        
        System.out.println("Ingrese el consumo energético del electrodoméstico (letra entre A y F)");
        System.out.println("Si se ingresa una letra no disponible, se asignará F por defecto.");
        char consumoRta = leer.next().charAt(0);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoRta);
        
        System.out.println("Ingrese el peso del electrodoméstico.");
        int pesoRta = leer.nextInt();
        
        this.peso = pesoRta;
    }
    
    public double precioFinal(){
        double precioF = this.precio;
        char letra = this.consumoEnergetico;
        letra = Character.toUpperCase(letra);

        switch (letra) {
            case 'A':
                System.out.println("Categoría A: +1000");
                precioF += 1000;
                break;
            case 'B':
                System.out.println("Categoría B: +800");
                precioF += 800;
                break;
            case 'C':
                System.out.println("Categoría C: +600");
                precioF += 600;
                break;
            case 'D':
                System.out.println("Categoría D: +500");
                precioF += 500;
                break;
            case 'E':
                System.out.println("Categoría E: +300");
                precioF += 300;
                break;
            case 'F':
                System.out.println("Categoría F: +100");
                precioF += 100;
                break;
        }
        
        int p = this.peso;
        
        if (p >= 1 && p <= 19) {
            System.out.println("Peso entre 1kg y 19kg: +100");
            precioF += 100;
        } else if (p >= 20 && p <= 49) {
            System.out.println("Peso entre 20kg y 49kg: +500");
            precioF += 500;
        } else if (p >= 50 && p <= 79) {
            System.out.println("Peso entre 50kg y 79kg: +800");
            precioF += 800;
        } else if (p >= 80) {
            System.out.println("Peso mayor a 80kg: +1000");
            precioF += 1000;
        }
        
        return precioF;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
