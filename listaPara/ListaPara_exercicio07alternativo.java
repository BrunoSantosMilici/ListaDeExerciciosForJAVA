package listaPara;

import java.util.Scanner;

public class ListaPara_exercicio07alternativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int resultado = 0;
			System.out.println("Digite um número:");
			int numero = sc.nextInt();
			
			for (int i = 0; i < 16; i++) {
				resultado *= numero;
				if (resultado == 0) {
					resultado += 1;
					}
					System.out.println(resultado);
				}
			}
	}

