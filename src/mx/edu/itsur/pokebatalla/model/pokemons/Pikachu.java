/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;

/**
 *
 * @author FJML1983
 */
public class Pikachu  extends Pokemon{

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
        this.movimientos = new ArrayList<>();
        this.movimientos.add(new Impactrueno());
        this.movimientos.add(new AtaqueRapido());
        this.movimientos.add(new Latigo());
//this.habilidades.add("BOLAVOLTIO");
        //....
    }    
    
    //Constructor alterno 1
    public Pikachu(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String movimiento){
        if(movimiento.equals("IMPACTRUENO")){
            //Logica del daño por atacktrueno
            
            //System.out.println("Realizando ATACKTRUENO");
        }else if(movimiento.equals("ATAQUE_RAPIDO")){
            //Logica del daño por ATAQUE_RAPIDO
            System.out.println("Realizando BOLAVOLTIO");            
        }
        //TODO: otras habilidades...
    }
   
}
