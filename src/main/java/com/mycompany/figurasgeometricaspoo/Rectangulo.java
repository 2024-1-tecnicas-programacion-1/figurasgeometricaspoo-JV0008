package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica{ //Todo es O1
    private double lado1;
    private double lado2; 
            
    public Rectangulo (double lado1, double lado2, String colorFigura, String nombreFigura ){
        super(colorFigura, nombreFigura);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double obtenerArea (){
        double area = lado1 * lado2;
        return area; 
    }
    
    @Override
    public double obtenerPerimetro (){
        double perimetro = 2*(lado1) + 2*(lado2);
        return perimetro; 
    }
}
