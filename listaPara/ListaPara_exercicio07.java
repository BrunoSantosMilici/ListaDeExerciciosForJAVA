package listaPara;

public class ListaPara_exercicio07 {

	public static void main(String[] args) {
	int resultado = 0;
	
	for (int i = 0; i < 16; i++) {
		resultado *= 3;
		if (resultado == 0) {
			resultado += 1;
			}
			System.out.println(resultado);
		}

	}

}
