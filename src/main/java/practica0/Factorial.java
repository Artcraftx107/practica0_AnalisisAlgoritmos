/*Ejercicio 5 del pdf Practica 0*/

package practica0;

public class Factorial {

    // Método para calcular el factorial de un número usando un bucle
    public int calcFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        int factFinal = 1;  // El factorial de 0 es 1, y comenzamos multiplicando
        for (int i = 1; i <= num; i++) {
            factFinal *= i;
        }
        return factFinal;
    }

    /*Ejercicio 12 del pdf Practica 0*/
    // Método para calcular el factorial usando recursión
    public int calcFactorialRecursivo(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (num == 0 || num == 1) { // Caso base
            return 1;
        }
        return num * calcFactorialRecursivo(num - 1);  // Paso recursivo
    }
}