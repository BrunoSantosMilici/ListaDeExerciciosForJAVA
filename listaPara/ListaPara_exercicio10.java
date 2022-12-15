package listaPara;

public class ListaPara_exercicio10 {

	public static void main(String[] args) {
		
		for (float Celsius = 10; Celsius < 110; Celsius+=10) {
			System.out.println("=============================");
			System.out.println("A temperatura em Celsius é de " + Celsius);
			float Fahrenheit = (9 * Celsius + 160) / 5;
			System.out.println("A temperatura convertida é de:" + Fahrenheit);
			System.out.println("==============================");
		}

	}

}
//um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius
