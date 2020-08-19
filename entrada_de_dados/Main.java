package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade,  imc, sexoimc;
		double altura, peso, calcImc;

		String sexo;

		
		System.out.println("Escreva seu nome");
		nome = sc.next();
		
		System.out.println("Sua idade");
		idade = sc.nextInt();
		
		System.out.println("Sua altura");
		altura = sc.nextDouble();
		
		System.out.println("Qual seu sexo? (obs: inserir M ou F)");
		sexo = sc.next();
		
		System.out.println("Insira seu peso");
		peso = sc.nextDouble();
		
		System.out.println("Seu nome: " + nome + " Sua idade: " + idade + " Altura: " + altura );
		sc.close();
		
		calcImc = peso / (altura * 2);
		
		
		if (sexo.equals("M")) {
			sexoimc = 1;
		}else
			sexoimc = 2;
		
		imc = (int) calcImc;
		System.out.println(imc);
		
		switch(sexoimc) {
			case 1:
				if (imc <= 20) {
					System.out.println("ATENÇÃO " + nome + " seu IMC é de " + imc + " abaixo do normal");
				}else if (imc >= 21 && imc <= 25) {
					System.out.println("PARABÉNS " + nome + " seu IMC é de " + imc + " está ótimo.");
				}else
					System.out.println("ATENÇÃO " + nome + " Seu IMC é de " + imc + " acima do normal");
			break;
			
			case 2:
				if (imc <= 19) {
					System.out.println("ATENÇÃO " + nome + " seu IMC é de " + imc + " abaixo do normal");
				}else if (imc >= 20 && imc <= 24) {
					System.out.println("PARABÉNS " + nome + " seu IMC é de " + imc + " está ótimo.");
				}else
					System.out.println("ATENÇÃO " + nome + " Seu IMC é de " + imc + " acima do normal");
			break;
		}
				
			
	}

}
