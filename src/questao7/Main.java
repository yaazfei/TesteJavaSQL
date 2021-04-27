package questao7;

public class Main {

	public static void main(String args[]) {

		String msg = "Timeless Spirit";
		System.out.println("Tamanho da String:" + getLength(msg));
	}

	public static int getLength(String str) {
		int tamanho = 0;
		char[] arrayStringChar = str.toCharArray();
		for (char caracter : arrayStringChar) {
			tamanho++;
		}
		return tamanho;
	}

}
