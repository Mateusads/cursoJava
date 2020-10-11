package aula2;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();

	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();

	}

	@Override
	public void run() {
		System.out.println(this.nome + " iniciada");

		int soma = calc.somaArray(this.nums);

		System.out.println("Resultado da soma" + this.nome + " é:" + soma);

		System.out.println(this.nome + " terminada");
	}
}