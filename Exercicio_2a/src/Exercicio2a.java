import java.util.Scanner;

public class Exercicio2a {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lado, area;
		System.out.println("Informe o tamanho do lado:");
		lado = teclado.nextInt();
		area = lado*lado;
		System.out.println("A área do quadrado é: "+ area);
	}
}
