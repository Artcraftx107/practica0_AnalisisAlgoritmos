/*Ejercicio 1 del pdf Practica 0*/

package practica0;

import java.util.Random;

public class SumaAleatoria {
    private static final int SUMANDOS = 20;
    public static void main(String[] args){
        Random random = new Random();
        double totalSum = 0;
        if(args.length==0){
            for(int i = 0; i<SUMANDOS; i++){
                totalSum+= random.nextDouble();
            }
            System.out.println("La suma total de los numeros generados es: "+totalSum);
        }else{
            try{
                int in = Integer.parseInt(args[0]);
                for(int i = 0; i<in; i++){
                    totalSum+= random.nextDouble();;
                }
                System.out.println("La suma total de los "+in+" numeros generados es: "+totalSum);
            }catch (NumberFormatException e){
                System.err.println("El argumento introducido no es un numero exacto");
            }
        }
    }
}
