package listaPara;

import java.util.Scanner;

public class ListaPara_exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int resultado = 1;
		
		System.out.println("Digite a base");
		int base = sc.nextInt();
		System.out.println("Digite o expoente");
		int expoente = sc.nextInt();
		
		
		for (i = 0; i < expoente; i++) {
			resultado = base * resultado;
			if (expoente == 0 ) {
				resultado = 1;
			}
		}
		System.out.println("O resultado é " + resultado);
	}

}
//um  programa  que  apresente  como  resultado  o  valor  de  uma  potência  de  uma  base qualquer elevada a um expoente qualquer