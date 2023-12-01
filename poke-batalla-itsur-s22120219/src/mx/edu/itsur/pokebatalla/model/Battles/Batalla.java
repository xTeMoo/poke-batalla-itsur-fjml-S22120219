package mx.edu.itsur.pokebatalla.model.Battles;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;
import mx.edu.itsur.pokebatalla.model.archivos.ManejoArchivo;

/**
 *
 * @author Angel Cuauhtemoc Torres Duran
 */
public class Batalla implements Serializable{

    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }
    // Método para guardar el progreso de la batalla
    public void salvarProgreso() {
        ManejoArchivo.guardarPartida(this);
    }
    // Método que simula el desarrollo de la batalla
    public void desarrollarBatalla() {
        System.out.println(" --------------------- LA BATALLA HA EMPEZADO---------------------");
        System.out.println("QUIENES PELEARAN SON: ");
        System.out.println(entrenador1.getNombre() + "-------VS--------" + entrenador2.getNombre());

        System.out.println("");

         do {
            try {
                eligirPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Elige a uno de tus pokemones" + "[" + entrenador1.getPokemonsCapturados().size() + "]" );
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligirPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Elige a uno de tus pokemones" + "["+ entrenador2.getPokemonsCapturados().size() + "]");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println(" Turno del entrenador: " + entrenadorEnTurno.getNombre());

            
            if (oponente.getPokemonActual() == null) {
                System.out.println("Elige a un pokemon antes de pelear");
                return;
            }

            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);

                
                while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("Para continuar la batalla cambia de pokemon");
                    cambiarPokemon(entrenadorEnTurno);
                }
            }

            if (oponente.estaDerrotado()) {
                System.out.println("El entrenador " + oponente.getNombre() + " ha sido derrotado");
                System.out.println(" La batalla ha terminado");
                batallaFinalizada = true;
            } else {
                salvarProgreso();
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }
    // Método para que un entrenador elija un Pokémon de su lista de capturados
    private void eligirPokemon(Entrenador EnTn) {
         System.out.println("Elige un  pokemon " + EnTn.getNombre());
        int idx = 1;
        System.out.println("----------------------");
        for (Pokemon pokemon : EnTn.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
             System.out.println("-----------------");
        }
        System.out.println("");
       

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            // Manejo de excepciones
        }

        Pokemon pokemonSeleccionado = EnTn.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        EnTn.setPokemonActual(pokemonSeleccionado);
    }

   // Método para que un entrenador seleccione un ataque para su Pokémon
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("--------------------");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");
        System.out.println("--------------------");
        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("--------------------");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Ingresa algun numero valido mostrado en pantalla.");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("La opción de ataque no es valida.");
            return;
        }

       
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    // Método para que un entrenador cambie su Pokémon actual
    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("Quieres cambiar de pokemon ? (S/N)");

        char respuesta = 'N';

        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokemones disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }
            System.out.println("Elige un Pokemon:");
            char auxLectura = '0';
            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
            }
            
            Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(Character.getNumericValue(auxLectura) - 1);
            entrenador.setPokemonActual(nuevoPokemon);

            System.out.println("Has elegido a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            
        }
    }
}