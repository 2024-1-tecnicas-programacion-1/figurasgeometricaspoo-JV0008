package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Rectangulo llamadaRectangulo = new Rectangulo();
        Triangulo llamadaTriangulo = new Triangulo();
        Circulo llamadaCirculo = new Circulo();
        Scanner lect = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura:");
        String nombreFigura = lect.nextLine();
        System.out.println("Ingrese el color de la figura:");
        String colorFigura = lect.nextLine();
        System.out.println("Ingrese el tipo de figura:");
        System.out.println("1: Círculo n/ 2: Réctangulo n/ 3: Triángulo");
        int valor = Integer.parseInt(lect.nextLine());
        
        
        switch (valor) {
            case 1:
                
                System.out.println("Ingrese el radio del Círculo");
                double radio = lect.nextDouble();
                llamadaCirculo.obtenerArea(radio);
                
                break;
            case 2:
                
                System.out.println("Ingrese el lado 1 del réctangulo");
                double lado1 = lect.nextDouble();
                System.out.println("Ingrese el lado 2 del réctangulo");
                double lado2 = lect.nextDouble();
                
                break;
            case 3:
                
                System.out.println("Ingrese la base del triángulo");
                double base = lect.nextDouble();
                System.out.println("Ingrese la altura del triángulo");
                double altura = lect.nextDouble();
                
                break;
            case 4:
                
                break;
            default:
                throw new AssertionError();
        }
    }

}
