/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Destructor;
import mx.edu.itsur.pokebatalla.model.moves.Pistola_Agua;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Hipnosis;


/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Poliwag extends Pokemon implements Serializable{
    
    public Poliwag() {
        this.tipo = "AGUA";
        this.hp = 40;
        this.ataque = 50;
        this.defensa = 40;
        this.nivel = 1;
        this.precision = 3;
        //....
    }    
    
    public enum Movimientos {
        PISTOLA_AGUA,
        HIPNOSIS,
        DESTRUCTOR
    }
    //Constructor alterno 1
    public Poliwag(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Poliwag.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Poliwag.Movimientos movimientoAUtilizar = Poliwag.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case PISTOLA_AGUA: 
                instanciaMovimiento = new Pistola_Agua();
                break;
                case HIPNOSIS: 
                instanciaMovimiento = new Hipnosis();
                break;
                case DESTRUCTOR: 
                instanciaMovimiento = new Destructor();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}

