/*Ejercicio 7 del pdf Practica 0*/

package practica0;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int aux = scanner.nextInt();

        switch (aux){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.err.println("El numero introducido ("+aux+") no esta entre 1 y 7");
        }

        /*Tambien se puede hacer quitando lo de arriba, y usando el propio array args tal que:
        try{
            int aux = Integer.parseInt(args[0]);
            switch (aux){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.err.println("El numero introducido ("+aux+") no esta entre 1 y 7");
            }
        }catch(NumberFormatException e){
            System.err.println("No se ha podido convertir el argumento dado a numero entero");
        }
         */
    }
}