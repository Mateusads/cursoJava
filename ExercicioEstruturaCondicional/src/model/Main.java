package model;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		
		System.out.println("Insira o numero do Exercicio ");
		System.out.println(" 01 - Valor positivo ou negativo ");
		System.out.println(" 02 - Valores são multiplos ");
		System.out.println(" 03 - Calculo de IR em Lisarb(País imaginario) ");
		
		int op = sc.nextInt();
		
		switch(op) {
			case 01:
				positivoNegativo();
				break;
			case 02:
				multiplos();
				break;
			case 03:
				irLisarb();
				break;
		}
	}

	private static void positivoNegativo() {
		
		System.out.println("Insira um valor negativo ou positivo");
		
		int numero = sc.nextInt();
		
		if(numero <  0) {
			System.out.println("Esse numero é Negativo " + numero);
		}else {
			System.out.println("Esse numero é Positivo " + numero);			
		}
		main(null);
		
	}
	
	
	private static void multiplos() {
		// TODO Auto-generated method stub
		System.out.println("Insira o primeiro valor ");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Insira o segundo valor ");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 % numero2;
				
				
		if(resultado == 0) {
			System.out.println("Esses numeros são Multiplos " + numero1 + " " + numero2 + " porque o seu resto é " + resultado);
		}else {
			System.out.println("Esses numeros não são Multiplos " + numero1 + " " + numero2 + " porque o seu resto é " + resultado);			
		}
		main(null);
		
	}
	
	private static void irLisarb() {
		// TODO Auto-generated method stub
		System.out.println("TABELA DE IR DE LISARB ");
		System.out.println("de 0 a 2000 Isento ");
		System.out.println("de 2001 a 3000 8% ");
		System.out.println("de 3001 a 4500 18% ");
		System.out.println("acima de 4500 28% ");
		System.out.println(" ");
		System.out.println("Insira o salário ");
		
		double salario = sc.nextDouble();
		
		if(salario <= 2000.0) {
			System.out.println("Este salário é Isento de IR em Lisarb ");
		}else if(salario <= 3000.) {
			double salarioIR = (salario - 2000.0)*0.08;

			System.out.println("Valor de IR para esse salario é de " + salarioIR + " ");
		}else if(salario <= 4500) {
			double salarioIR = (salario - 3000) * 0.018 + 1000.0 * 0.08;

			System.out.println("Valor de IR para esse salario é de " + salarioIR + " ");
		}else {
			double salarioIR = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.println("Valor de IR para esse salario é de " + salarioIR + " ");
		}
		main(null);
		
		
	}



}
