/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Cris
 */
public class Baraja {

    private Set<Carta> baraja;
    private final int TAMANIO_BARAJA = 48;

    public Baraja() {
        this.baraja = new TreeSet<>();
    }

    //Método el cual rellena la baraja de cartas que no están repetidas.
    public void rellenarBaraja() {
        //creamos una carta con el constructor predeterminado
        Carta carta = new Carta();

        //Con el for nos aseguramos que el set al final acabe teniendo un largo de 48
        for (int i = 0; i < TAMANIO_BARAJA; i++) {

            //generamos la carta de forma aleatoria
            Carta aleatoria = carta.generarCartaAleatoria();

            //Si no se encuentra en el set lon añade
            if (!baraja.contains(aleatoria)) {
                baraja.add(aleatoria);

                //Si no, resta 1 a i y así no se sale del bucle
            } else {
                i--;
            }
        }

    }

}
