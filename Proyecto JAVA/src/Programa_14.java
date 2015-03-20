import java.util.Scanner;
public class Programa_14 {

	public static void main(String[] args) {
		int a=0;
		Scanner cuadro= new Scanner(System.in);
	
		System.out.println("CUADRO DE ASTERISCOS CON 'N' LADOS");
		System.out.println("Ingrese el numero de asteriscos que desea por lado: ");
		a= cuadro.nextInt();
	
		System.out.println("Cuador de "+a+" asteriscos por lado");
		for (int i = 0; i < a; i++) {
			for (int j = i/a; j<a-1; j++) {
				System.out.print("* ");
			}			
			System.out.println("*");
		}
	}

}
