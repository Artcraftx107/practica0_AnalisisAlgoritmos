/*Ejercicio 9 del pdf Practica 0*/

package practica0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EncuentraComun {
    public static List<String> comunes(String[] array1, String[] array2){
        Set<String> comunes = new HashSet<>();

        Set<String> setArray1 = new HashSet<>();

        for(String elemento : array1){
            setArray1.add(elemento);
        }

        for (String element : array2){
            if(setArray1.contains(element)){
                comunes.add(element);
            }
        }

        return new ArrayList<>(comunes);
    }
    public static void main(String[] args){
        String[] array1 = {"bruh", "xd", "bg3", "jett", "bo6"};
        String[] array2 = {"bruh", "monkey", "banan", "lmao", "bg3", "bo6"};

        List<String> result = comunes(array1, array2);

        System.out.println("Elementos comunes de los arrays dados: "+result);
    }
}