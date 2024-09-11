/*Ejercicio 11 del pdf Practica 0*/

package practica0;

import java.util.ArrayList;
import java.util.List;

public class OperacionesListasEnteros {
    public void rotarLista(List<Integer> list, int e){
        List<Integer> aux = new ArrayList<>(list.subList(e, list.size()));
        aux.addAll(list.subList(0,e));
        list.clear();
        list.addAll(aux);
    }
}