package juego;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
//Definición de la clase.
public class Carta {
    //Atributos de la clase.
    private Palos palo;
    private int numero;
    
    //Constructor por defecto.
    public Carta(){
    }
    
    //Constructor parametrizado.
    public Carta(Palos palo, int numero) {
        if(numero <= 12){
            this.numero = numero;
        }
        this.palo = palo;
    }
    
    //Getters y setters.
    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.palo);
        hash = 29 * hash + this.numero;
        return hash;
    }

    //equals().
    //Una carta será igual a otra si son iguales en PALO y NÚMERO.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return true;
    }

    //toString().
    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }
    
}
