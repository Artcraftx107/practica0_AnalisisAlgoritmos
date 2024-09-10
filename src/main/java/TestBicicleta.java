/*Ejercicio 4 del pdf Practica 0*/

import practica0.*;
public class TestBicicleta {
    public static void main(String[] args){
        Bicicleta bicicleta = new Bicicleta(2);
        BicicletaDeMonatana bicicletaDeMonatana = new BicicletaDeMonatana(4, 3);

        bicicleta.acelerar(13);
        bicicleta.frenar();
        System.out.println("Bici Normal: "+bicicleta);

        bicicletaDeMonatana.acelerar(20);
        bicicletaDeMonatana.frenar();
        System.out.println("Bici de Monatana: "+bicicletaDeMonatana);
    }
}
