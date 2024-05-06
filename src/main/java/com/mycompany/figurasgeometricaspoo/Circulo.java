package com.mycompany.figurasgeometricaspoo;

public class Circulo {
    public Circulo (){
         
    }
    
    public double obtenerArea (double radio){
        double area = Math.PI * (radio * radio);
        
       return area; 
    }
    
    public double obtenerPerimetro (double radio){
       double perimetro = Math.pow(Math.PI,2)*radio; 
       return perimetro; 
    }
}
