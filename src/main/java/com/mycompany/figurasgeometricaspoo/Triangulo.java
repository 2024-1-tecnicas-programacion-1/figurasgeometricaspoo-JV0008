package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{ //Todo es O1
    private double altura;
    private double base; 
            
    public Triangulo (double altura, double base, String colorFigura, String nombreFigura ){
        super(colorFigura, nombreFigura);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double obtenerArea (){
        double area = (altura*base)/2;
       return area; 
    }
    
    @Override
    public double obtenerPerimetro (){
        double x = Math.sqrt(Math.pow(altura,2) + Math.pow(base,2)) ;
        double perimetro = altura + base + x;
       return perimetro; 
    }
}
