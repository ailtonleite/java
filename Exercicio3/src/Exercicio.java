import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, unidade, consumo, reais, desconto;
		System.out.println("Quanto vale o salario?");
		salario = teclado.nextDouble();
		System.out.println("Qual a quantidade de KW consumido?");
		consumo = teclado.nextDouble();
		unidade = salario / 700;
		reais = unidade * consumo;
		desconto = reais * 0.9;
		
		System.out.println("Valor de cada KW: "+ unidade);
		System.out.println("Valor em reais: "+ reais);
		System.out.println("Valor com o desconto: "+ desconto);
	}
}
