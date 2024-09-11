/*Ejercicio 10 del pdf Practica 0*/

package practica0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PartirLista {
    public static void main(String[] args){
        List<Integer> ej10 = new ArrayList<>();
        Random random = new Random();
        int tam = random.nextInt(1, 10);

        for(int i =0; i<tam; i++){
            ej10.add(random.nextInt(100));
        }

        List<Integer> part1 = new ArrayList<>(ej10.subList(0, tam/2));
        List<Integer> part2 = new ArrayList<>(ej10.subList(tam/2, tam));

        System.out.println("Lista original: "+ej10+"\n");
        System.out.println("Primera mitad: "+part1+"\n");
        System.out.println("Segunda mitad: "+part2+"\n");
    }
}