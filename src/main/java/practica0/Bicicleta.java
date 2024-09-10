/*Ejercicio 2 del pdf Practica 0*/

package practica0;

public class Bicicleta {
    private int frenos;
    private int velocidad;
    public Bicicleta(int frenos){
        if(frenos>3 || frenos<0){
            throw new IllegalArgumentException("El valor de los frenos debe estar entre 0 y 3, inclusive");
        }
        this.frenos=frenos;
        this.velocidad=0;
    }

    public void frenar(){
        if(velocidad == 0 || velocidad-frenos<0){
            this.velocidad=0;
        }else{
            this.velocidad-=frenos;
        }
    }

    public void acelerar(int v){
        if(v>0){
            this.velocidad+=v;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La bicicleta tiene una capacidad de frenada de ").append(frenos).append(" y una velocidad actual de ").append(velocidad);
        return sb.toString();
    }
}