/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Azote;
import mx.edu.itsur.pokebatalla.model.moves.Salpicadura;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Burbuja;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Magikarp extends Pokemon implements Serializable{
    
    public Magikarp() {
        this.tipo = "AGUA";
        this.hp = 20;
        this.ataque = 10;
        this.defensa = 55;
        this.nivel = 1;
        this.precision = 3;
        //....
    }    
    public enum Movimientos {
        AZOTE,
        SALPICADURA,
        BURBUJA
    }
    //Constructor alterno 1
    public Magikarp(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Magikarp.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Magikarp.Movimientos movimientoAUtilizar = Magikarp.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case AZOTE: 
                instanciaMovimiento = new Azote();
                break;
                case SALPICADURA: 
                instanciaMovimiento = new Salpicadura();
                break;
                case BURBUJA: 
                instanciaMovimiento = new Burbuja();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
