package questao3e4;

public class CalculadorString {

	
	public String concatERemove(String stringInicial, String stringDesejada, Integer movimentosTotais) {
		String resp = "não";
		StringBuilder stringInicialTemp = new StringBuilder(stringInicial);
		Integer movimentosFeitos = 0;
		int indiceStringDesejada = 0;
		
		for (int i = 0; i < stringInicial.length(); i++) {
			stringInicialTemp.deleteCharAt(stringInicialTemp.length() - 1);
			movimentosFeitos++;
			
			if(stringInicialTemp.toString().contains(stringDesejada)) {
				indiceStringDesejada=stringDesejada.indexOf(stringInicialTemp.toString());
				movimentosFeitos += stringDesejada.length() - stringInicialTemp.toString().length();
				break;
			}
		}
	
		Integer movimentosRestantes = movimentosTotais - movimentosFeitos; 
		for (int i = 0; i < movimentosRestantes; i++) {
			stringInicialTemp.append(stringDesejada.charAt(i));
		}
		if(stringInicialTemp.toString().equals(stringDesejada)) {
			resp = "sim";
		}
		
		return resp;
	}
	
}
