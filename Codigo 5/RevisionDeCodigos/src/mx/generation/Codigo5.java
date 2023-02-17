
/* este programa te dice si tu numero es afortunado o no*/
package mx.generation;

import java.util.Scanner;

public class Codigo5 {
	 //agregar public static void main 
	public static void main(String[] args) {
		
	//importar scanner y system.in
	Scanner s = new Scanner(System.in);
	//comillas dobles y simple juntas
	    System.out.println("Introduzca un numero: ");
	    String ni = s.nextLine();
	   // convertir un string a entero
	    int c =Integer.parseInt(ni);
	    int a =c;
	    
	    int afo = 0;
	    int noAfo = 0;
	    //cambiar ni por c
	    while (c > 0) {
		  int digito = c % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
		  
		  c /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.print("El " + a + " es un numero afortunado.");
	    } else {
	      System.out.println("El " + a + " no es un numero afortunado.");
	    }
	    
	  }
}
