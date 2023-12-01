/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Destructor extends MovimientoFisico{
    public Destructor()
    {
        this.tipo = Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 35;  
    }
}
