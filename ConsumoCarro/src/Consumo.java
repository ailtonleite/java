import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double distancia, consumo, media;
		System.out.println("Informe a distancia percorrida:");
		distancia = teclado.nextDouble();
		System.out.println("Informe o consumo total:");
		consumo = teclado.nextDouble();
		
		media = distancia/consumo;
		System.out.println("O consumo médio é: "+ media);
		
		
	}
}
