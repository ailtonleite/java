import java.util.Scanner;

public class Exercicio2b {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base, altura, area;
		System.out.println("Informe o tamanho da base:");
		base = teclado.nextInt();
		System.out.println("Informe o tamanho da altura:");
		altura = teclado.nextInt();
		area = base*altura;
		System.out.println("A área do retangulo é: "+ area);
	}
}
