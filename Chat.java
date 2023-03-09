package ExamenParcial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chat {
    public static void main(String[] args) {
        List<String> atributos = Arrays.asList("Inteligente", "Amable", "Gracioso", "Atento", "Honesto", "Leal", "Cariñoso", "Sociable", "Ambicioso", "Creativo");
        List<Persona> personas = new ArrayList<>();
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Lucía");
        nombres.add("Sofía");
        nombres.add("Federico");
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Carla");
        nombres.add("Ana");
        List<String> nombresSeleccionados = new ArrayList<>();
        Random random = new Random();
        while (nombresSeleccionados.size() < 10) {
            int indiceAleatorio = random.nextInt(nombres.size());
            String nombreAleatorio = nombres.get(indiceAleatorio);
            if (!nombresSeleccionados.contains(nombreAleatorio)) {
                nombresSeleccionados.add(nombreAleatorio);
            }
        }
        
        for (String nombre : nombresSeleccionados) {
            System.out.println(nombre);
        }

        for (int i = 0; i < nombres.size(); i++) {
			String nombre = nombres.get(i);
            String atributo1 = atributos.get(new Random().nextInt(atributos.size()));
            String atributo2 = atributos.get(new Random().nextInt(atributos.size()));
            String atributo3 = atributos.get(new Random().nextInt(atributos.size()));
            String atributo4 = atributos.get(new Random().nextInt(atributos.size()));

            
            if (i == 2 || i == 5) {
                atributo1 = "Inteligente";
            }
            
        }

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ": " + persona.getAtributo1() + ", " + persona.getAtributo2() + ", " + persona.getAtributo3()+ ", " + persona.getAtributo4());
        }
    }
}


