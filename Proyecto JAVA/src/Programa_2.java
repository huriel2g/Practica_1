import java.util.Scanner;
public class Programa_2 {

		public static void main(String[] args) {
			int nota1=0, nota2=0, nota3=0, nota4=0, nota5=0, nota6=0, prom=0;
			Scanner s=new Scanner(System.in);
			System.out.println("INGRESE NOTAS PARA SABER SU PROMEDIO");
			System.out.println("Ingrese 6 notas entre 0 y 100");
			nota1=s.nextInt();
			nota2=s.nextInt();
			nota3=s.nextInt();
			nota4=s.nextInt();
			nota5=s.nextInt();
			nota6=s.nextInt();
			prom=(nota1+nota2+nota3+nota4+nota5+nota6)/6;
			
			System.out.println("Media		Puntuacion");
			System.out.println("90-100			A	");
			System.out.println("80- 89			B	");
			System.out.println("70- 79			C	");
			System.out.println("60- 69			D	");
			System.out.println(" 0- 59			E	");
			
		
			System.out.println("El promedio es: "+prom);
			
			if(prom>=0 && prom<60 ){ 
				System.out.println("Tiene una puntuacion E");
			}
			if(prom>59 && prom<70  ){
				System.out.println("Tiene una puntuacion D");	
			}
			if(prom>69 && prom<80  ){
				System.out.println("Tiene una puntuacion C");	
			}
			if(prom>79 && prom<90  ){
				System.out.println("Tiene una puntuacion B");	
			}
			if(prom>89 && prom<101  ){
				System.out.println("Tiene una puntuacion A");	
			}
	}

}
