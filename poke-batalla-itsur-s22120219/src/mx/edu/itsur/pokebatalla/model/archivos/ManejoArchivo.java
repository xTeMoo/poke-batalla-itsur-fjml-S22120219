package mx.edu.itsur.pokebatalla.model.archivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */

public class ManejoArchivo {

    public static final String NOMBRE_PARTIDA = "pokemon.itsur";

    // Método para guardar una partida
    public static void guardarPartida(Batalla x) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(NOMBRE_PARTIDA))) {
            // Verifica si el objeto a guardar no es nulo
            if (x != null) {
                // Escribe el objeto en el archivo
                escritorDeObjetos.writeObject(x);
                System.out.println("Partida guardada correctamente.");
            } else {
                System.out.println("No se puede guardar una partida nula.");
            }
        } catch (IOException ex) {
            // Captura y muestra mensajes de error si ocurren problemas al guardar
            System.err.println("Error al guardar la partida: " + ex.getMessage());
        }
    }

    // Método para cargar una partida
    public static Batalla cargarPartida() {
        Batalla x = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(NOMBRE_PARTIDA))) {
            // Intenta leer el objeto desde el archivo
            x = (Batalla) lectorDeObjetos.readObject();
            System.out.println("Partida cargada correctamente.");
        } catch (EOFException e) {
            System.err.println("Fin de archivo alcanzado.");
        } catch (IOException | ClassNotFoundException ex) {
            // Captura y muestra mensajes de error si ocurren problemas al cargar
            System.err.println("Error al cargar la partida: " + ex.getMessage());
        }
        return x;
    }
    
    public static void eliminarPartida() {
        File file = new File(NOMBRE_PARTIDA);
        if (file.exists()) {
            file.delete();
            System.out.println("La partida ha sido eliminada");
        } else {
            System.out.println("No se encontró ninguna partida guardada.");
        }
    }
}