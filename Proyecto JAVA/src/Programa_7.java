import java.util.Scanner;

public class Programa_7 {

	public static void main(String[] args) {
		int n1=0, t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0;
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("Ingrese un numero entre 0 y 10 : ");
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		
		t10=n1*10;
		t9=n1*9;
		t8=n1*8;
		t7=n1*7;
		t6=n1*6;
		t5=n1*5;
		t4=n1*4;
		t3=n1*3;
		t2=n1*2;
		t1=n1*1;
		
		System.out.println("La tabla de multiplicar de "+n1+" es: ");
		System.out.println(n1+"*10="+t10);
		System.out.println(n1+"*9="+t9);
		System.out.println(n1+"*8="+t8);
		System.out.println(n1+"*7="+t7);
		System.out.println(n1+"*6="+t6);
		System.out.println(n1+"*5="+t5);
		System.out.println(n1+"*4="+t4);
		System.out.println(n1+"*3="+t3);
		System.out.println(n1+"*2="+t2);
		System.out.println(n1+"*1="+t1);

	}

}
