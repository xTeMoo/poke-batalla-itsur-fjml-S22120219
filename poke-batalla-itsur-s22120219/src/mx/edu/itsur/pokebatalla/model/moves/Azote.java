/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 *  @author Angel Cuauhtemoc Torres Duran
 */
public class Azote extends MovimientoFisico{
    public Azote()
    {
        this.tipo = Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 15;  
    }
}
