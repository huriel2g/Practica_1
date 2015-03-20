import java.util.Scanner;
public class Programa_12 {

		public static void main(String[] args) {
			Scanner cad=new Scanner(System.in);
			String letras="";
			int car=0;
			System.out.println("CADENA DE ASTERISCOS");
			System.out.println("Ingrese una cadena de texto: ");	
			letras=cad.next ();
			car=letras.length();
			System.out.println("La cadena ingresada fue: "+letras);
			
			for (int i=car; i>0; i--) { 
				System.out.print("*");	
				} 			
	}				
}


