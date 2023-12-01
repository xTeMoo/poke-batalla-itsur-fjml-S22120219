/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import java.io.IOException;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;
import mx.edu.itsur.pokebatalla.model.Battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.archivos.ManejoArchivo;
import mx.edu.itsur.pokebatalla.model.pokemons.Blastoise;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Magikarp;
import mx.edu.itsur.pokebatalla.model.pokemons.Poliwag;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Main {

    public static void main(String[] args) {
        // Instanciar los nuevos Pokémon y Entrenadores
        Magikarp m = new Magikarp("Sebas");
        Blastoise b = new Blastoise("Pepe");
        Poliwag po = new Poliwag("Julian");
        Pikachu pi = new Pikachu("Rayito");
        Bullbasaur bu = new Bullbasaur("Paco");
        Charmander c = new Charmander("Lolo");

        Entrenador en1 = new Entrenador("Temo");
        en1.capturarPokemon(b);
        en1.capturarPokemon(pi);
        en1.capturarPokemon(c);

        Entrenador en2 = new Entrenador("Pardo");
        en2.capturarPokemon(m);
        en2.capturarPokemon(po);
        en2.capturarPokemon(bu);

        // Verificar si hay una partida guardada (siguiendo la lógica anterior)
        System.out.println("¿Deseas cargar una partida guardada? (S/N)");
        char respuestaCargar = obtenerRespuestaUsuario();

        Batalla n1;
        if (respuestaCargar == 'S' || respuestaCargar == 's') {
            n1 = ManejoArchivo.cargarPartida();
            if (n1 == null) {
                n1 = new Batalla(en1, en2);
            }
        } else {
            n1 = new Batalla(en1, en2);
        }

        // Iniciar o cargar la batalla
        n1.desarrollarBatalla();
        System.out.println("¿Deseas eliminar la partida guardada? (S/N)");
        char respuestaEliminar = obtenerRespuestaUsuario();
        if (respuestaEliminar == 'S' || respuestaEliminar == 's') {
            ManejoArchivo.eliminarPartida();
        }//Pregunta si quiere eliminar la partida
    }

    private static char obtenerRespuestaUsuario() {
        try {
            char respuesta = (char) System.in.read();
            System.in.read(new byte[System.in.available()]); // Limpiar buffer
            return respuesta;
        } catch (IOException ex) {
            ex.printStackTrace();
            return 'N';
        }
    }
}

