package variablesDouble;

import java.util.Scanner;
public class varDouble {
	
	public static void main(String args[]) {
		Scanner introducir=new Scanner(System.in);
		double num1,num2,multiplicasion = 0;
		System.out.println("operaciones con numeros double");
		System.out.println("dame un numero con decimales");
		num1=introducir.nextDouble();
		System.out.println("ahora dame otro numero decimal");
		num2=introducir.nextDouble();
		multiplicasion=num1*num2;
		System.out.println("la multiplicasion de ["+ num1 +"]"+" * ["+num2 +"]");
		System.out.println("es " + multiplicasion);
		
	}

}
