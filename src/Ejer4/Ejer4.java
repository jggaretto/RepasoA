/*
Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejer4;

import java.util.Scanner;


public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradosCelsius;
        gradosCelsius = leer.nextDouble();
        double gradosFahrenheit = convertirCelsiusAFahrenheit(gradosCelsius);
        System.out.println(gradosCelsius + " grados Celsius equivalen a " + gradosFahrenheit + " grados Fahrenheit.");
    }

    public static double convertirCelsiusAFahrenheit(double gradosCelsius) {
        double gradosFahrenheit = 32 + (9 * gradosCelsius / 5);
        return gradosFahrenheit;
    }
}
