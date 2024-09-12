/*Ejercicio 13 del pdf Practica 0*/
package practica0;

import java.util.ArrayList;
import java.util.List;

public class Matematicas {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*Ejercicio 14 del pdf Practica 0*/
    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Ninguno de los dos numeros puede ser negativo");
        } else if (m > 3) {
            throw new IllegalArgumentException("El valor de m es demasiado grande, puede causar un desbordamiento de pila.");
        }
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    /*Ejercicio 15 del pdf Practica 0*/
    public static int mcd(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Ninguno de los dos numeros puede ser negativo");
        }
        if (m < n) {
            int aux = 0;
            aux = n;
            n = m;
            m = aux;
        }
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    /*Ejercicio 16 del pdf Practica 0*/
    public static void mostrarLista(List<Integer> lista, int i){
        if(i>lista.size()){
            return;
        }
        mostrarLista(lista, i+1);
        System.out.println(lista.get(i-1));
    }
    public static void main(String[] args) {
        /*Testeo para ej13*/
        int ejemplo = 20;
        int resultEjemplo = fibonacci(ejemplo);
        System.out.println("La serie de Fibonacci del numero " + ejemplo + " es " + resultEjemplo+"\n");

        /*Testeo ej14*/
        int ejemploM = 3;
        int ejemploN = 3;
        int resultEj14 = ackermann(ejemploM, ejemploN);
        System.out.println("La serie de Ackermann para los numeros M (" + ejemploM + ") y N (" + ejemploN + ") da como resultado: " + resultEj14+"\n");

        /*Testeo ej15*/
        int exampN = 10;
        int exampM = 5;
        int resultMCD = mcd(exampM, exampM);
        System.out.println("El resultado del mcd de los numeros " + exampM + " y " + exampN + " es " + resultMCD+"\n");

        /*Testeo ej16*/
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            nums.add(10*i);
        }
        int inicio = 5;
        System.out.println("Mostrando la lista dada en orden inverso: ");
        mostrarLista(nums, inicio);
    }
}