package ExamenParcial;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mian1 {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        Personas[] persona = new Personas[10];
	        for (int i = 0; i < 10; i++) {
	            persona[i] = new Personas() {};
	        }
	        int enano = 0;
	        int cabezon = 0;
	        int alcoholico = 0;
	        int calvo = 0;
	        int dedos = 0;
	        int volador = 0;
	        int inteligente = 0;
	        int altura = 0;
	        int feli = 0;
	        System.out.println("ADIVINA ADIVINADOR");

	        List<String> caracteristicasImportantes = Arrays.asList("es Enano", "esta Cabezon", "esta Borracho", "No tiene cabello", "le fatla un dedo", "es un pajaro...?", "es muy inteligente", "parece arbol", "feli como lombriz" );

	        for (Personas personas : persona) {
	            System.out.print(personas.getNombre() + ": ");
	            int contador = 0;
	            for (String caracteristica : caracteristicasImportantes) {
	                switch (caracteristica) {
	                    case "es Enano":
	                        if (personas.getEsEnano()) {
	                            enano++;
	                            System.out.print("mide 1.5, ");
	                            contador++;
	                        }
	                        break;
	                    case "esta Cabezon":
	                        if (personas.getEsCabezon() ) {
	                            cabezon++;
	                            System.out.print("Esta cabezon, ");
	                            contador++;
	                        }
	                        break;
	                    case "esta Borracho":
	                        if (personas.getEsAlcoholico()) {
	                            alcoholico++;
	                            System.out.print("Hay que llevarlo a 3A, ");
	                            contador++;
	                        }
	                        break;
	                    case "No tiene cabello":
	            if (personas.getEsCalvo()) {
	                calvo++;
	                System.out.print("Compre una peluca, ");
	                contador++;
	            }
	            break;
	                    case "le falta un dedo":
	            if (personas.getTiene9dedos()) {
	                dedos++;
	                System.out.print("se accidento, ");
	                contador++;
	            }
	            break;
	                    case "es un pajaro...?":
	            if (personas.getSabeVolar()) {
	                volador++;
	                System.out.print("Es brujo, ");
	                contador++;
	            }
	            break;
	                    case "es muy inteligente":
	            if (personas.getEsInteligente()) {
	                inteligente++;
	                System.out.print("Su IQ es alto, ");
	                contador++;
	            }
	            break;
	                    case "parece arbol":
	            if (personas.getEsAlto()) {
	                altura++;
	                System.out.print("Está Triste, ");
	                contador++;
	            }
	            break;
	                    case "feli como lombriz":
	            if (personas.getEstaFeliz()) {
	                feli++;
	                System.out.print("avientenle una piedrita, ");
	                contador++;
	            }
	            break;
	                }
	                if (contador == 4) {
	                    break;
	                }
	            }
	            System.out.println("");
	        }
	        
	 	    
	        System.out.println();
	        System.out.println("REPETICION DE ATRIBUTOS");
	        System.out.println("SOLO: " + enano + " ESTAN ENANOS");
	        System.out.println(cabezon + " ESTAN CABEZONES");
	        System.out.println("CON ESTOS " + alcoholico + " HAY QUE LLEVARLOS A 3A");
	        System.out.println("ESTOS " + calvo +  " ESTAN CALVOS");
	        System.out.println("ELLOS " + dedos + " SUFRIERON UN ACCIDENTE");
	        System.out.println("QUIEN SABE COMO " + volador + " APRENDIERON A VOLAR");
	        System.out.println("SOLO " + inteligente + " SON SUPER INTELIGENTES");
	        System.out.println( altura + " PERSONAS CRECEN COMO EL PASTO");
	        System.out.println("AVIENTENLES UNA PIEDRITA A ESTOS " + feli + " ESTAN MUY CONTENTOS");
	        System.out.println();
	       
	         
	        System.out.println("QUE COMIENCE EL JUEGO");
	        
	        int personaElegida = new Random().nextInt(10);
	        
	        for (int contadorPreguntas = 0; contadorPreguntas < 3; contadorPreguntas++) {
	            System.out.println("CUAL NO TIENE TU PERSONAJE ");
	            System.out.println("1. ES ENANO??");
	            System.out.println("2. NO LE QUEDAN LAS GORRAS");
	            System.out.println("3. DICE QUE VA A SALIR AUN PLAN TRANQUI PERO NUNCA ES TRANQUI?");
	            System.out.println("4. NO NECESITA SHAMPOO");
	            System.out.println("5. NO PUEDE CANTAR LA CANCION DE HI5");
	            System.out.println("6. ES UN EXPERIMENTO DEL GOBIERNO PORQUE VUELA?");
	            System.out.println("7. ES MUY MAMON PORQUE SABE COSAS");
	            System.out.println("8. LE DIERON MUCHO DANONINO");
	            System.out.println("9. FELI COMO UNA LOMBRIZ");
	            
	            int opcion = sc.nextInt();
	            switch (opcion) {
	                case 1:
	                    for (int i = 0; i < 10; i++) {
	                    	  if (persona[i] != null && !persona[i].getEsEnano()) {
	                              persona[i] = null;
	                          }
	                      }
	                      break;
	                case 2:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsCabezon()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 3:
	                		for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsAlcoholico()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 4:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsCalvo()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 5:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getTiene9dedos()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 6:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getSabeVolar()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 7:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsInteligente()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 8:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsAlto()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 9:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaFeliz()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	}
	            int numeroPersonasElegidas = 0;
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            numeroPersonasElegidas++;
	            }
	            }
	            if (numeroPersonasElegidas == 1) {
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            	System.out.println("TU ENAMORADO ES... " + persona[i].getNombre());
	            	break;
	            	}
	            	}
	            	return;
	            	}
	            System.out.println("SOLO ELLOS CUMPLEN CON EL PERFIL: ");
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            System.out.println((i + 1) + ". " + persona[i].getNombre());
	            }
	            }
	            System.out.println("");
	            }
	        System.out.println("QUIEN SERÁ TU ENAMORADO SECRETO..?:");
	        int eleccionUsuario = sc.nextInt();
	        eleccionUsuario--;

	        if (persona[eleccionUsuario] != null) {
	            System.out.println("¡ES ESEEEEEE! casense " + persona[eleccionUsuario].getNombre());
	        } else {
	            System.out.println("lo siento :c pero parece que no es ");
	        }
	        }

	        }
	            