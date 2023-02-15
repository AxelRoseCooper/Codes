package mx.generation;

import java.util.Scanner;
/* importamos scanner
*/

public class Codigo4 {
	
	
	public static void main(String[] args) {
	
		/*agregamos system in*/
		
	    Scanner s = new Scanner(System.in);
	    
	    
	    
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();

	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    /*borramos el segundo scanner con uno es suficiente*/
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) { /* quitamos == y agergamos equals*/
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":/* agregamos breaks a los cases*/
	          if (j2.equals("tijeras")) { /* quitamos == y agergamos equals*/
	            g = 1;
	          }
	          break;

	        case "papel":
	          if (j2.equals("piedra")) { /* quitamos == y agergamos equals*/
	            g = 1;
	          }
	          break;
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    
	  
	    }
	}
}



