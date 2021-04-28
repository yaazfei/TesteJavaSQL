package questao3e4;

//questao3
public class CalculadorString {

	public String concatERemove(String stringInicial, String stringDesejada, Integer movimentosTotais) {
		validaTamanhoText(stringInicial);
		validaTamanhoText(stringDesejada);
		validaTamanhoNumero(movimentosTotais);
	
		String resp = "não";
		StringBuilder stringInicialTemp = new StringBuilder(stringInicial);
		Integer movimentosFeitos = 0;
		int indiceStringDesejada = 0;
		
		if (stringDesejada.indexOf(stringInicial) != 0) {
			for (int i = 0; i < stringInicial.length(); i++) {
				stringInicialTemp.deleteCharAt(stringInicialTemp.length() - 1);
				movimentosFeitos++;
				if (stringDesejada.indexOf(stringInicialTemp.toString()) == 0) {
					if(stringDesejada.length() > stringInicialTemp.length()) {
						movimentosFeitos = stringDesejada.length() - movimentosFeitos;
						break;
					}
					break;
				}
			}
			Integer movimentosRestantes = movimentosTotais - movimentosFeitos;
			if (movimentosRestantes > 0) {
				for (int j = 0; j < movimentosRestantes; j++) {
					indiceStringDesejada= stringInicialTemp.toString().length();
					stringInicialTemp.append(stringDesejada.charAt(indiceStringDesejada));
					if (stringInicialTemp.toString().equals(stringDesejada)) {
						resp = "sim";
						break;
					}
				}
			} else {
				if (stringInicialTemp.toString().equals(stringDesejada) && movimentosRestantes >= 0) {
					resp = "sim";
				}
			}
		} else {
				resp = "sim";
		}
		return resp;
	}
	
	
	public Boolean validaTamanhoText(String texto) {

        if(texto.length() < 1 || texto.length() > 100) {
            throw new RuntimeException("Tamanho do texto diferente do permitido");
        }
        return true;
    }
	
	
	public Boolean validaTamanhoNumero (int num) {

        if(num < 1 || num > 100) {
            throw new RuntimeException("Tamanho do número diferente do permitido");
        }
        return true;
    }
	
	
	
	
	
}
