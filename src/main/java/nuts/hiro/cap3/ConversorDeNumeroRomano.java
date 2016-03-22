package nuts.hiro.cap3;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
		{

			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public int converte(String numeroEmRomano) {
		int acumulador = 0;
		int ultimoVIzinhoDaDireita = 0;
		for (int i = numeroEmRomano.length() - 1; i >= 0; i--) {

			// pega o inteiro referente ao simbolo atual
			int atual = tabela.get(numeroEmRomano.charAt(i));

			// se o da direita for menor, o multiplicaremos
			// por -1 para torna-lo negativo
			int multiplicador = 1;

			if (atual < ultimoVIzinhoDaDireita)
				multiplicador = -1;

			acumulador += atual * multiplicador;

			// atualiza o vizinho da direita
			ultimoVIzinhoDaDireita = atual;

		}
		return acumulador;

	}

}
