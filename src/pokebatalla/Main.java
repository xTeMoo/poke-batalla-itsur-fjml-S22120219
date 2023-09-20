/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu p1 = new Pikachu();        
        p1.tipo = "ELECTRICO";
        p1.hp = 35;
        p1.ataque = 55;
        p1.defensa = 30;
        p1.nivel = 1;
        p1.precision = 4;
        
        Charmander cha1 = new Charmander();        
        cha1.tipo = "FUEGO";
        cha1.hp = 39;
        cha1.ataque = 52;
        cha1.defensa = 43;
        cha1.nivel = 1;
        cha1.precision = 4;
        
        Bullbasaur b1 = new Bullbasaur();
        b1.tipo = "PLANTA/VENENO";
        b1.hp = 45;
        b1.ataque = 49;
        b1.defensa = 49;
        b1.nivel = 1;
        b1.precision = 4;
        
    }
    
}
