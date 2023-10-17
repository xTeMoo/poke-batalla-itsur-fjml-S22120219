/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Latigo;

/**
 *
 * @author FJML1983
 */
public class Bullbasaur extends Pokemon {

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
        this.movimientos.add(new Latigo());
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
        
    }
    
    
    
}
