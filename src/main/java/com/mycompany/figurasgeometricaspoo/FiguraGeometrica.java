package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class FiguraGeometrica { // Todo es O1
    
    private String nombreFigura;
    private String colorFigura;
    
    public FiguraGeometrica(String nombreFigura, String colorFigura) {
        this.nombreFigura = nombreFigura;
        this.colorFigura = colorFigura;
    }
    
    public String getNombre() {
        return nombreFigura;
    }
    
    public void setNombre(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    public String getColor() {
        return colorFigura;
    }
    
    public void setColor(String colorFigura) {
        this.colorFigura = colorFigura;
    }
    
    public double obtenerArea() {
        return 0.0;
    }
    
    public double obtenerPerimetro() {
        return 0.0;
    }
    
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la figura:");
        String nombreFigura = lect.nextLine();
        System.out.print("Ingrese el color de la figura:");
        String colorFigura = lect.nextLine();
        System.out.println("Ingrese el tipo de figura:");
        System.out.println("1: Círculo n/ 2: Réctangulo n/ 3: Triángulo");
        int valor = Integer.parseInt(lect.nextLine());
        
        FiguraGeometrica figura = null;
        
        switch (valor) {
            case 1:
                
                System.out.print("Ingrese el radio del Círculo:");
                double radio = lect.nextDouble();
                figura = new Circulo(radio, colorFigura, nombreFigura);
                
                break;
            case 2:
                
                System.out.print("Ingrese el lado 1 del réctangulo:");
                double lado1 = lect.nextDouble();
                System.out.print("Ingrese el lado 2 del réctangulo:");
                double lado2 = lect.nextDouble();
                figura = new Rectangulo(lado1, lado2, colorFigura, nombreFigura);
                
                break;
            case 3:
                
                System.out.print("Ingrese la base del triángulo:");
                double base = lect.nextDouble();
                System.out.print("Ingrese la altura del triángulo:");
                double altura = lect.nextDouble();
                figura = new Triangulo(altura, base, colorFigura, nombreFigura);
                
                break;
            default:
                 System.out.println("Opción no válida.");
                         
        }
        if (figura != null) {
        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }
        
    }
    }