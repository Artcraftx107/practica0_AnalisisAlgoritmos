/*Ejercicio 13 del pdf Practica 0*/
package practica0;

public class Matematicas {
    public static int fibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        } else if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args){
        int ejemplo = 20;
        int resultEjemplo = fibonacci(ejemplo);
        System.out.println("La serie de Fibonacci del numero "+ejemplo+" es "+resultEjemplo);
    }
}