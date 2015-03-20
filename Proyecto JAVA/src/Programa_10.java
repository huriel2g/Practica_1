import java.util.Scanner;

public class Programa_10 {

	public static void main(String[] args) {
		int piramide=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("PIRAMIDE INVERSA DE NUMEROS");
		System.out.println("Ingrese un numero: ");
		piramide=s.nextInt();
		
		for(int i=piramide; 0<i; i--){
			for(int j=i-1;j>0;j--)
			System.out.print(i);
			System.out.println(+i);
		}
	

	}

}
