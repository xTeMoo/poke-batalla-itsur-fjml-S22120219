/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Giro_Fuego extends MovimientoEspecial {
    public Giro_Fuego()
    {
        this.tipo = Movimiento.TiposDeMovimiento.FUEGO;
        this.potencia = 35;
        this.precision = 85;
        this.puntosPoder = 15; 
    }
}
