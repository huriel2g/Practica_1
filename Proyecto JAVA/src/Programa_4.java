import java.util.Scanner;
public class Programa_4 {
	
		public static void main(String[] args) {
			Scanner areas=new Scanner(System.in);
			double x=0;
			double rc=0, pc=0, ac=0;
			double acu=0, pcu=0;
			double at=0, pt=0, ht=0;
			double pi=3.1416;
			String l="";
			System.out.println("INGRESE UN NUMERO PARA SABER DATOS DE UN CIRCULO, CUADRADO O TRIANGULO5");
	       System.out.println("ingrese un numero");
			       x=areas.nextDouble();
	       System.out.println("ingrese una letra entre c (circulo), u (cuadrado) o t (triangulo)");
			       l=areas.next ();
			       
			    if(l.equals("c")){
			    	rc=x/2;
			    	pc=(2*rc*pi);
			    	ac=rc*rc*pi;
			    	System.out.println("El radio del circulo es: "+rc+", con perimetro de: "+pc+", y area de: "+ac);
			    }

			    if(l.equals("u")){
			    	pcu=4*x;
			    	acu=x*x;
			    	System.out.println("El perimetro del cuadrado es: "+pcu+" y con area de: "+acu);
			    }

			    if(l.equals("t")){
			    	ht=(1.7321*x)/2;
			    	at=0.5*x*ht;
			    	pt=(3*x);
			    	
			    	System.out.println("La altura de triangulo es: "+ht+", con perimetro de: "+pt+", y area de: "+at);
			    }

		}
	}