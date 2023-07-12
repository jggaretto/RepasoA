/*
Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().
 */
package Ejer5;

import java.util.Scanner;

public class Ejer5 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num;
         int raiz;
         int doble;
         int triple;
        System.out.println("Ingrese un numero");
         num = leer.nextInt();
         doble = (int) (Math.abs(num)* 2);
         triple = (int) (Math.abs(num)* 3);
         raiz = (int) (Math.sqrt(num));
         System.out.println("Doble: " + doble);
         System.out.println("Triple: " + triple);
         System.out.println("Raiz cuadrada: " + raiz);
    }
}

/* Segunda opcion hecha por ChatGPT:
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }

*/