package mx.generation;

import java.util.HashMap; //importamos
import java.util.Scanner; //importamos scanner

public class codigo7 {
	 
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in); //agregar system.in

	HashMap<String, String> capitales = new HashMap<>();
    capitales.put("Canadá", "Ottawa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "Ciudad de México");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa Rica", "San José");
    capitales.put("El Salvador", "San Salvador");
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Ciudad de Panamá");

    String c = ""; //faltaba r

    do {
        System.out.print("Escribe el nombre de un país y te diré su capital (o 'salir' para terminar): ");
        c = s.nextLine();
	      
	      if (!c.equals("salir")) { //faltaba la s
	    	   if (capitales.containsKey(c)) {
                   System.out.println("La capital de " + c + " es " + capitales.get(c)); //uní los dos syso
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir")); //faltaba h y ")"
	  }
}

