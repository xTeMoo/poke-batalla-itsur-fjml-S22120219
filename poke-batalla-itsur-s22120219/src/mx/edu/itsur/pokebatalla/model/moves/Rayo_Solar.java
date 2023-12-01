/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Rayo_Solar extends MovimientoEspecial {
    public Rayo_Solar()
    {
        this.tipo = Movimiento.TiposDeMovimiento.PLANTA;
        this.potencia = 120;
        this.precision = 100;
        this.puntosPoder = 10;  
    }
}
