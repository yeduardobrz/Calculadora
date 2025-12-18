package exercicios;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir");
		int calc = sc.nextInt();
		
		double soma,sub,mult,div;
		
		double n1,n2;
		System.out.println("agora digite 2 numeros para a operacao");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		switch (calc) {
		case 1:
			System.out.println(soma = n1 + n2); 
			break;
		case 2:
			System.out.println(sub = n1 - n2); 
			break;
		case 3:
			System.out.println(mult = n1 * n2); 
			break;
		case 4: 
			System.out.println(div = n1 / n2); 
			break;
		}
		
			
		
		
		
		sc.close();
	}
}
