import java.util.Scanner;
public class Programa_8 {

			public static void main(String[] args) {
						Scanner aleatorio=new Scanner(System.in);
			            int li,ls;
			            int ale=0;
			            System.out.println("INGRESE UN INTERVALO PARA PODER GENERAR UN NUMERO ALEATORIO");
			            System.out.println("Ingrese el numero del limite inferior");
			    		li=aleatorio.nextInt();
			    		System.out.println("Ingrese el numero del limite superior");
			    		ls=aleatorio.nextInt();
			 
			       		ale=((int)(Math.random()*(ls-li))+li);
			       		System.out.println("El numero aleatorio es: "+ale);
			       		
			       		System.out.println("El numero aleatorio en letras es: ");
			       		
			       		
			       		if (ale>0 && ale<100) {
			       			switch (ale) {
			       			case 0:System.out.println(" Cero ");break;
			    			case 1: System.out.println(" uno ");;break;
			    			case 2: System.out.println(" Dos ");break;
			    			case 3: System.out.println(" Tres ");break;
			    			case 4: System.out.println(" Cuatro ");break;
			    			case 5: System.out.println(" Cinco ");break;
			    			case 6: System.out.println(" Seis ");break;
			    			case 7: System.out.println(" Siete ");;break;
			    			case 8: System.out.println(" Ocho ");break;
			    			case 9: System.out.println(" Nueve ");break;
			    			case 10:System.out.println(" Diez ");break;
			    			case 11: System.out.println(" Once ");;break;
			    			case 12: System.out.println(" Doce ");break;
			    			case 13: System.out.println(" Trece ");break;
			    			case 14: System.out.println(" Catorce ");break;
			    			case 15: System.out.println(" Quince ");break;
			    			case 16: System.out.println(" Diez y Seis ");break;
			    			case 17: System.out.println(" Diez y Siete ");;break;
			    			case 18: System.out.println(" Diez y Ocho ");break;
			    			case 19: System.out.println(" Diez y Nueve ");break;
			    			case 20: System.out.println(" Veinte ");break;
			    			case 21: System.out.println(" Veinti uno ");;break;
			    			case 22: System.out.println(" Veinti dos ");break;
			    			case 23: System.out.println(" Veinti tres ");break;
			    			case 24: System.out.println(" Veinti cuatro ");break;
			    			case 25: System.out.println(" Veinti Cinco ");break;
			    			case 26: System.out.println(" Veinti Seis ");break;
			    			case 27: System.out.println(" Veinti Siete ");;break;
			    			case 28: System.out.println(" Veinti Ocho ");break;
			    			case 29: System.out.println(" Veinti Nueve ");break;
			    			case 30: System.out.println(" Treinta ");break;
			    			case 31: System.out.println(" Treinta y uno ");;break;
			    			case 32: System.out.println(" Treinta y dos ");break;
			    			case 33: System.out.println(" Treinta ytres ");break;
			    			case 34: System.out.println(" Treinta y cuatro ");break;
			    			case 35: System.out.println(" Treinta y Cinco ");break;
			    			case 36: System.out.println(" Treinta y Seis ");break;
			    			case 37: System.out.println(" Treinta y Siete ");;break;
			    			case 38: System.out.println(" Treinta y Ocho ");break;
			    			case 39: System.out.println(" Treinta y Nueve ");break;
			    			case 40: System.out.println(" Cuarenta ");break;
			    			case 41: System.out.println(" Cuarenta y uno ");;break;
			    			case 42: System.out.println(" Cuarenta y dos ");break;
			    			case 43: System.out.println(" Cuarenta y tres ");break;
			    			case 44: System.out.println(" Cuarenta y cuatro ");break;
			    			case 45: System.out.println(" Cuarenta y Cinco ");break;
			    			case 46: System.out.println(" Cuarenta y Seis ");break;
			    			case 47: System.out.println(" Cuarenta y Siete ");;break;
			    			case 48: System.out.println(" Cuarenta y Ocho ");break;
			    			case 49: System.out.println(" Cuarenta y Nueve ");break;
			    			case 50: System.out.println(" Cincuenta ");break;
			    			case 51: System.out.println(" Cincuenta y uno ");;break;
			    			case 52: System.out.println(" Cincuenta y dos ");break;
			    			case 53: System.out.println(" Cincuenta y tres ");break;
			    			case 54: System.out.println(" Cincuenta y cuatro ");break;
			    			case 55: System.out.println(" Cincuenta y Cinco ");break;
			    			case 56: System.out.println(" Cincuenta y Seis ");break;
			    			case 57: System.out.println(" Cincuenta y Siete ");;break;
			    			case 58: System.out.println(" Cincuenta y Ocho ");break;
			    			case 59: System.out.println(" Cincuenta y Nueve ");break;
			    			case 60: System.out.println(" Sesenta ");break;
			    			case 61: System.out.println(" Sesenta y uno ");;break;
			    			case 62: System.out.println(" Sesenta y dos ");break;
			    			case 63: System.out.println(" Sesenta y tres ");break;
			    			case 64: System.out.println(" Sesenta y cuatro ");break;
			    			case 65: System.out.println(" Sesenta y Cinco ");break;
			    			case 66: System.out.println(" Sesenta y Seis ");break;
			    			case 67: System.out.println(" Sesenta y Siete ");;break;
			    			case 68: System.out.println(" Sesenta y Ocho ");break;
			    			case 69: System.out.println(" Sesenta y Nueve ");break;
			    			case 70: System.out.println(" Setenta ");break;
			    			case 71: System.out.println(" Setenta y uno ");;break;
			    			case 72: System.out.println(" Setenta y dos ");break;
			    			case 73: System.out.println(" Setenta y tres ");break;
			    			case 74: System.out.println(" Setenta y cuatro ");break;
			    			case 75: System.out.println(" Setenta y Cinco ");break;
			    			case 76: System.out.println(" Setenta y Seis ");break;
			    			case 77: System.out.println(" Setenta y Siete ");;break;
			    			case 78: System.out.println(" Setenta y Ocho ");break;
			    			case 79: System.out.println(" Setenta y Nueve ");break;
			    			case 80: System.out.println(" Ochenta ");break;
			    			case 81: System.out.println(" Ochenta y uno ");;break;
			    			case 82: System.out.println(" Ochenta y dos ");break;
			    			case 83: System.out.println(" Ochenta y tres ");break;
			    			case 84: System.out.println(" Ochenta y cuatro ");break;
			    			case 85: System.out.println(" Ochenta y Cinco ");break;
			    			case 86: System.out.println(" Ochenta y Seis ");break;
			    			case 87: System.out.println(" Ochenta y Siete ");;break;
			    			case 88: System.out.println(" Ochenta y Ocho ");break;
			    			case 89: System.out.println(" Ochenta y Nueve ");break;
			    			case 90: System.out.println(" Noventa ");break;
			    			case 91: System.out.println(" Noventa y uno ");;break;
			    			case 92: System.out.println(" Noventa y dos ");break;
			    			case 93: System.out.println(" Noventa y tres ");break;
			    			case 94: System.out.println(" Noventa y cuatro ");break;
			    			case 95: System.out.println(" Noventa y Cinco ");break;
			    			case 96: System.out.println(" Noventa y Seis ");break;
			    			case 97: System.out.println(" Noventa y Siete ");;break;
			    			case 98: System.out.println(" Noventa y Ocho ");break;
			    			case 99: System.out.println(" Noventa y Nueve ");break;
			    			case 100:System.out.println(" Cien ");break;
			    			
			    		}					
					}
			                 
			    }
			}
			
