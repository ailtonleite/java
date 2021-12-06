import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a nota 1:");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2)/2;
		System.out.println("A média calculada foi: "+ media);
		if(media >= 8 && media <= 10) {
			System.out.println("Aprovado com louvor!");
		} else if(media >= 6 && media < 8) {
			System.out.println("Aprovado!");
		} else if(media >= 5 && media < 6) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Reprovado!");
		}
	}
}
