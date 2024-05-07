package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica{ //Todo es O1
    private double radio;
            
    public Circulo (double radio, String colorFigura, String nombreFigura ){
        super(colorFigura, nombreFigura);
        this.radio = radio;
    }
    
    @Override
    public double obtenerArea (){
        double area = Math.PI * Math.pow(radio,2);        
        return area; 
    }
    
    @Override
    public double obtenerPerimetro (){
       double perimetro = 2*(Math.PI)*radio;  
       return perimetro; 
    }
}
