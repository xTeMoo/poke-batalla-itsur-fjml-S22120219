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
        //POR HACER..
        int nivelUsuario;  //N
        int ataqueUsuario;  //A
        int potenciaMovimiento; //P 
        int defensaObjetivo; //D
        
        /*
        B = Bonificación. Si el Pokémon no está teracristalizado: si el ataque es del mismo tipo que el Pokémon que lo lanza toma un valor de 1.5; si el ataque es de un tipo diferente al del Pokémon que lo lanza toma un valor de 1. Si el Pokémon está teracristalizado: si tanto su tipo original como su teratipo coinciden con el del movimiento, la bonificación será de 2; si sólo coincide su tipo original o su teratipo, será de 1.5; si no coincide ninguno, será de 1.
            Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
            Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
        */
        
        int bonificacion; //B
        int efectividadMovimiento; //E
        
                
        
    }
    
    
}
