
package com.mycompany.parcial_1;


public class Parcial_1 {
    
    public static void main(String[] args) {
        int dividendo = 6; 
        int divisor = 4;
        
        int cociente = 0;
        int residuo = dividendo;
        
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        
        System.out.println("Resultado: " + cociente);
        if (residuo == 0) {
            System.out.println("Tipo de división: Exacta");
        } else {
            System.out.println("Tipo de división: Inexacta");
            System.out.println("Residuo: " + residuo);
        }
    }
}

        
        
