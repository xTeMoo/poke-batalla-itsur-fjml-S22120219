/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;
import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Maquinacion;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Pikachu  extends Pokemon implements Serializable{

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
        //....
    }    
    
    //Constructor alterno 1
    public Pikachu(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public enum Movimientos
    {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        MAQUINACION
    }
    @Override
    public Enum[] getMovimientos() {
        return Pikachu.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println(nombre+" esta muriendo y no puede atacar mas.");
            return;
        }
        Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case IMPACTRUENO: 
                instanciaMovimiento = new Impactrueno();
                break;
                case ATAQUE_RAPIDO: 
                instanciaMovimiento = new AtaqueRapido();
                break;
                case MAQUINACION: 
                instanciaMovimiento = new Maquinacion();
                break;
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
   
}
