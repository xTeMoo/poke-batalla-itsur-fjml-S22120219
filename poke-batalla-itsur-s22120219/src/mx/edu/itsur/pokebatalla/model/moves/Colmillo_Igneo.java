/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Colmillo_Igneo extends MovimientoFisico{
    public Colmillo_Igneo()
    {
        this.tipo = Movimiento.TiposDeMovimiento.FUEGO;
        this.potencia = 65;
        this.precision = 95;
        this.puntosPoder = 15; 
    }
}
