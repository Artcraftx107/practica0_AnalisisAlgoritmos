/*Ejercicio 8 del pdf Practica 0*/

package practica0;

public class Division {
    public static void main(String[] args){
        try{
            double dividendo = Double.parseDouble(args[0]);
            double divisor = Double.parseDouble(args[1]);
            if(divisor==0){
                throw new ArithmeticException("El divisor no puede ser 0");
            }
            double result = dividendo/divisor;
            System.out.println("El resultado de dividir "+dividendo+" entre "+divisor+" es: "+result);
        }catch (NumberFormatException e){
            System.err.println("Uno de los dos argumentos introducidos no es correcto");
        }catch (NullPointerException e){
            System.err.println("El valor del array de argumentos dados es null");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("No hay tantos argumentos en el array");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}