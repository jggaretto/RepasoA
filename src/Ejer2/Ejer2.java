/*
Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package Ejer2;

import java.util.Scanner;


public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name;
        name = leer.nextLine();
        System.out.println("Buenas noches " + name);
        
    }
}
