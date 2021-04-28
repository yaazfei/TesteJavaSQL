package questao3e4;

public class CalculadorString {

	public String concatERemove(String stringInicial, String stringDesejada, Integer movimentosTotais) {
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
}

//		
//		
//		
//		if (stringDesejada.indexOf(stringInicial) == 0) {
//			movimentosFeitos += stringDesejada.length() - stringInicialTemp.toString().length();
//			resp = "sim";
//
//		} else {
//
//			for (int i = 0; i < stringInicial.length(); i++) {
//				stringInicialTemp.deleteCharAt(stringInicialTemp.length() - 1);
//				movimentosFeitos++;
//				if (stringDesejada.indexOf(stringInicialTemp.toString()) == 0) {
//					if(stringDesejada.length() != stringInicialTemp.length()) {
//						movimentosFeitos = stringDesejada.length() - movimentosFeitos;
//						break;
//					}
//					break;
//				}
//			}
//		}
//
//		Integer movimentosRestantes = movimentosTotais - movimentosFeitos;
//		if (movimentosRestantes > 0) {
//			for (int j = 0; j < movimentosRestantes; j++) {
//				indiceStringDesejada= stringInicialTemp.toString().length();
//				stringInicialTemp.append(stringDesejada.charAt(indiceStringDesejada));
//				if (stringInicialTemp.toString().equals(stringDesejada)) {
//					resp = "sim";
//					break;
//				}
//			}
//		} else {
//			if (stringInicialTemp.toString().equals(stringDesejada) && movimentosRestantes >= 0) {
//				resp = "sim";
//			}
//		}
//		return resp;
//	}
//}
