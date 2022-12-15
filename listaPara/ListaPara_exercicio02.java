package listaPara;

import java.util.Scanner;

public class ListaPara_exercicio02 {

	public static void main(String[] args) {
		int multiplicador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ver a sua tabuada");
		int numero = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			 multiplicador = i * numero;
			 System.out.println(i + " X " + numero + " = " + multiplicador);
		}

	}

}
