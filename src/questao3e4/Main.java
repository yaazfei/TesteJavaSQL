package questao3e4;

public class Main {
	
	public static void main(String [] args) {

		String resultado = new CalculadorString().concatERemove(args[0], args[1], Integer.valueOf(args[2]));	
		System.out.println(resultado);
		
	} 	
	
}
