/*
 Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.
 */
package Ejer3;

import java.util.Scanner;


public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;       
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        String frase2= frase.toUpperCase();
        String frase3= frase.toLowerCase();
        System.out.println("Mayuscula: " + frase.toUpperCase());
         System.out.println("Miniscula: " + frase.toLowerCase());
     
        
    }

    
}
