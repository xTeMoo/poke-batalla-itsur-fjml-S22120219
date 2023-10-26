/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PsycoRayo;

/**
 *
 * @author FJML1983
 */
public class Psyduck extends Pokemon {

    public enum Movimientos {
        PSICORAYO
    }

    public void atacar(Pokemon oponente, Psyduck.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case PSICORAYO:
                instanciaMovimiento = new PsycoRayo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        atacar(oponente, instanciaMovimiento);
    }

    @Override
    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }
}