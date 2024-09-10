/*Ejercicio 6 del pdf Practica 0*/

package practica0;

public class MayorDe3 {
    public int mayorSentenciado(int a, int b, int c){
        if(a>b&&a>c){
            return a;
        } else if (b>a&&b>c) {
            return b;
        }else
            return c;
    }

    public int mayorTernario(int a, int b, int c){
        int mayor = (a<b) ? b:a;
        return (mayor<c)? c:mayor;
    }
}