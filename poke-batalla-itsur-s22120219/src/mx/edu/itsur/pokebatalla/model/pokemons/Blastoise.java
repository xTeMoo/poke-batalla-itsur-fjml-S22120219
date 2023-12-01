/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Hidrobomba;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Blastoise extends Pokemon implements Serializable{
    
    
    public Blastoise() {
        this.tipo = "AGUA";
        this.hp = 89;
        this.ataque = 83;
        this.defensa = 100;
        this.nivel = 36;
        this.precision = 3;
    }    
    
    public enum Movimientos {
        PLACAJE,
        HIDROBOMBA,
        LATIGO
    }
    //Constructor alterno 1
    public Blastoise(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Blastoise.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Blastoise.Movimientos movimientoAUtilizar = Blastoise.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case PLACAJE: 
                instanciaMovimiento = new Placaje();
                break;
                case HIDROBOMBA: 
                instanciaMovimiento = new Hidrobomba();
                break;
                case LATIGO: 
                instanciaMovimiento = new Latigo();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
