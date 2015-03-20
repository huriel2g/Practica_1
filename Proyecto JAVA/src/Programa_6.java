
import java.util.Scanner;
	public class Programa_6 {

		public static void main(String[] args) {
			   
			Scanner dato=new Scanner(System.in);
				int num1=0, num2=0;
				int suma=0, resta=0, multi=0, div=0;
				String letra="";
				System.out.println("CALCULADORA");
		       System.out.println("ingrese 2 numeros");
				       num1=dato.nextInt();
				       num2=dato.nextInt();
				       
			   System.out.println("ingrese la letra s para sumar, r para restar, d para dividir y m para multiplicar los numeros :");
				  	letra= dato.next ();
				       
				if (letra.equals("s")) {
				    	   suma= num1+num2;
				    	   System.out.println(+suma); 
				}
				if ((letra.equals("r"))) {
							resta= num1-num2;
					System.out.println("La resta de los numeros es: "+resta);
				}
				if (letra.equals("m")) {
			    	   multi= num1*num2;
			    	   System.out.println("La multiplicacion de los numeros es: "+multi); 
				}
				if (letra.equals("d")) {
			    	   div= num1/num2;
			    	   System.out.println("La division de los numeros es: "+div); 
				}
						
			}
	}
