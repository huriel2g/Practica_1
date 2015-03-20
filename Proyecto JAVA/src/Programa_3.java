import java.util.Scanner;
public class Programa_3 {

		public static void main(String[] args) {
			Scanner dato=new Scanner(System.in);
			int min=0;
			int hora;
			System.out.println("INGRESE LA HORA EN NOTACION DE 24 HORAS");
			System.out.println("Ingrese la hora: ");
			hora=dato.nextInt();
			System.out.println("Ingrese los minutos: ");
			min=dato.nextInt();
			
			if (hora==01) {System.out.println("La hora es: 01:"+min+"am");} 
			else {if (hora==13) {System.out.println("La hora es: 01:"+min+"pm");}}

			if (hora==02) {System.out.println("La hora es: 02:"+min+"am");} 
			else {if (hora==14) {System.out.println("La hora es: 02:"+min+"pm");}}
			
			if (hora==03) {System.out.println("La hora es: 03:"+min+"am");} 
			else {if (hora==15) {System.out.println("La hora es: 03:"+min+"pm");}}
			
			if (hora==04) {System.out.println("La hora es: 04:"+min+"am");} 
			else {if (hora==16) {System.out.println("La hora es: 04:"+min+"pm");}}
			
			if (hora==05) {System.out.println("La hora es: 05:"+min+"am");} 
			else {if (hora==17) {System.out.println("La hora es: 05:"+min+"pm");}}
			
			if (hora==06) {System.out.println("La hora es: 06:"+min+"am");} 
			else {if (hora==18) {System.out.println("La hora es: 06:"+min+"pm");}}
			
			if (hora==07) {System.out.println("La hora es: 07:"+min+"am");} 
			else {if (hora==19) {System.out.println("La hora es: 07:"+min+"pm");}}
			
			if (hora==8) {System.out.println("La hora es: 08:"+min+"am");} 
			else {if (hora==20) {System.out.println("La hora es: 08:"+min+"pm");}}
			
			if (hora==9) {System.out.println("La hora es: 09:"+min+"am");} 
			else {if (hora==21) {System.out.println("La hora es: 09:"+min+"pm");}}
			
			if (hora==10) {System.out.println("La hora es: 10:"+min+"am");} 
			else {if (hora==22) {System.out.println("La hora es: 10:"+min+"pm");}}
			
			if (hora==11) {System.out.println("La hora es: 11:"+min+"am");} 
			else {if (hora==23) {System.out.println("La hora es: 11:"+min+"pm");}}
			
			if (hora==12) {System.out.println("La hora es: 12:"+min+"am");} 
			else {if (hora==24) {System.out.println("La hora es: 12:"+min+"pm");}}
		}		
}
