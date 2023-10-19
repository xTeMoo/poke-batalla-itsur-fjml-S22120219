/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author FJML1983
 */
public class Impactrueno extends MovimientoEspecial {

    public Impactrueno() {
        this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;

    }

    //Métodos
    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; //this.getPoder();
        int defensaObjetivo = objetivo.getDefensa();
        
        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; // Modificador base (sin modificaciones)       
        //if ()... POR HACER
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio);
                      
    }
    
    
}
