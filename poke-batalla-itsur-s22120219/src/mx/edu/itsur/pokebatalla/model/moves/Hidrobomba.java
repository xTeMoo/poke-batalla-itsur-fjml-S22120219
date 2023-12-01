/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Hidrobomba extends MovimientoEspecial{
    public Hidrobomba()
    {
        this.tipo = Movimiento.TiposDeMovimiento.AGUA;
        this.potencia = 185;
        this.precision = 80;
        this.puntosPoder = 5;  
    }
}
