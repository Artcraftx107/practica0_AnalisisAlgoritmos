/*Ejercicio 3 del pdf Practica 0*/

package practica0;

public class BicicletaDeMonatana extends Bicicleta{
    private int tam;
    public BicicletaDeMonatana(int tam, int frenos){
        super(frenos);
        this.tam=tam;
    }

    public void establecerTamano(int t){
        if(t<=0){
            this.tam=t; 
        }else{
            throw new IllegalArgumentException("El tamaño no puede ser menor o igual a cero");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" y un tamaño de "+tam;
    }
}
