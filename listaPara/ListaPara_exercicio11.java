package listaPara;

public class ListaPara_exercicio11 {

	public static void main(String[] args) {
		for (int numero = 1; numero <= 10; numero += 2) {
			  int resultado = 1;
			  for (int i = numero; i > 0; i--) {
			    resultado = resultado * i;
			  }
			  System.out.println(resultado);
			}
	   }
	}

//laborar  um  programa  que  apresente  como  resultado  o  valor  do  fatorial  dos  valores  ímpares situados na faixa numérica de 1 a 10