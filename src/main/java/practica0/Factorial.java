/*Ejercicio 5 del pdf Practica 0*/

package practica0;

public class Factorial {
     public int calcFactorial(int num){
         if(num<0){
             throw new IllegalArgumentException("El numero al que se le quiere calcular el factorial no puede ser negativo");
         }
         int factFinal = 0;
         for(int i = 0; i<=num; i++){
             factFinal+=i;
         }
         return factFinal;
    }
}