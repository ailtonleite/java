import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a nota 1:");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2)/2;
		System.out.println("Sua m�dia vale: "+ media);
		if(media >= 6) {
			System.out.println("Parab�ns! voc� foi aprovado!");
		} else {
			System.out.println("Voc� foi reprovado.");
		}
	}
}
