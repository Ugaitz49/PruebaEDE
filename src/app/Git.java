package app;

import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int num1;
		int num2;
		int suma, resta;
		int opcion = 0;
		
		
		do {
			System.out.println("1-sumar\n2-restar\n3-salir");
			opcion=cs.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Introduce un numero:");
					num1=cs.nextInt();
				System.out.println("Introduce otro numero:");
					num2=cs.nextInt();
						suma=num1+num2;
				System.out.println("La suma de los dos son: " + suma);
				break;
			}
			case 2: {
			System.out.println("Introduce un numero:");
				num1=cs.nextInt();
			System.out.println("Introduce otro numero:");
				num2=cs.nextInt();	
					resta=num1+num2;
			System.out.println("La suma de los dos son: " + resta);
				break;
			}
			case 3: {
				System.out.println("Has salido del programa.");
				break;
			}
			default:
				System.out.println("Pon un numero valido.");
			}
		}while(opcion != 3);
	}

}
