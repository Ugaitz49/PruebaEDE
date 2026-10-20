package app;

import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int num1;
		int num2;
		int suma;
		
		System.out.println("Introduce un numero:");
		num1=cs.nextInt();
		System.out.println("Introduce otro numero:");
		num2=cs.nextInt();
		
		suma=num1+num2;
		System.out.println("La suma de los dos son: " + suma);

	}

}
