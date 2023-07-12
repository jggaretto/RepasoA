
import java.util.Scanner;

/*Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
mostrando por consola la suma de los mismos
package guia2_ejer1;
*/
public class Guia2_Ejer1 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int a, b;
        System.out.println("Ingrese dos numeros a sumar");
        a = leer.nextInt();
        b = leer.nextInt();
        int total;
        total = a + b;
        System.out.println("Resultado de la suma: " + total);
        
    }
    
}
