/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Gruñido;
import mx.edu.itsur.pokebatalla.model.moves.Hoja_Afilada;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Rayo_Solar;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Bullbasaur extends Pokemon implements Serializable{

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public enum Movimientos{
        GRUÑIDO,
        RAYO_SOLAR,
        HOJA_AFILADA
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Bullbasaur.Movimientos movimientoAUtilizar = Bullbasaur.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case GRUÑIDO: 
                instanciaMovimiento = new Gruñido();
                break;
                case RAYO_SOLAR: 
                instanciaMovimiento = new Rayo_Solar();
                break;
                case HOJA_AFILADA: 
                instanciaMovimiento = new Hoja_Afilada();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
