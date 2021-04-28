package questao7;

public class CalculadorString {

	
	public int getLength(String str) {
		int tamanho = 0;
		char[] arrayStringChar = str.toCharArray();
		for (char caracter : arrayStringChar) {
			tamanho++;
		}
		return tamanho;
	}
	
}
