/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Proteccion;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Colmillo_Igneo;
import mx.edu.itsur.pokebatalla.model.moves.Giro_Fuego;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Charmander extends Pokemon implements Serializable{
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }
    
    //Constructor alterno 1
    public Charmander(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public enum Movimientos
    {
        PROTECCION,
        COLMILLO_IGNEO,
        GIRO_FUEGO
    }
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case PROTECCION: 
                instanciaMovimiento = new Proteccion();
                break;
                case GIRO_FUEGO: 
                instanciaMovimiento = new Giro_Fuego();
                break;
                case COLMILLO_IGNEO: 
                instanciaMovimiento = new Colmillo_Igneo();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
