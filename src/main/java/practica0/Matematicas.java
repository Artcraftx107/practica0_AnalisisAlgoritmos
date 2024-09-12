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

    /*Ejercicio 14 del pdf Practica 0*/
    public static int ackermann(int m, int n){
        if(m<0||n<0){
            throw new IllegalArgumentException("Ninguno de los dos numeros puede ser negativo");
        } else if (m > 3) {
            throw new IllegalArgumentException("El valor de m es demasiado grande, puede causar un desbordamiento de pila.");
        }
        if(m==0){
            return n+1; 
        } else if (n==0) {
            return ackermann(m-1, 1);
        }else {
            return ackermann(m-1, ackermann(m, n-1));
        }
    }
    public static void main(String[] args){
        /*Testeo para ej13*/
        int ejemplo = 20;
        int resultEjemplo = fibonacci(ejemplo);
        System.out.println("La serie de Fibonacci del numero "+ejemplo+" es "+resultEjemplo);

        /*Testeo ej14*/
        int ejemploM = 3;
        int ejemploN = 3;
        int resultEj14=ackermann(ejemploM, ejemploN);
        System.out.println("La serie de Ackermann para los numeros M ("+ejemploM+") y N ("+ejemploN+") da como resultado: "+resultEj14);
    }
}