package questao3e4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculadorStringTeste {

	private CalculadorString calculador;
	
	    @BeforeEach                                         
	    public void setUp() throws Exception {
	    	calculador = new CalculadorString();
	    }

	    @Test                                               
	    @DisplayName("Teste de Argumentos")   
	    public void testeArgumentos() {
	      assertEquals("não", calculador.concatERemove("ashley", "ash", 2),      
	    	        "Deve funcionar.");
	      assertEquals("sim", calculador.concatERemove("thomas", "tho", 3),      
	    	        "Deve funcionar."); 
	      assertEquals("sim", calculador.concatERemove("blablablabla", "blablabcde", 8),      
	    	        "Deve funcionar."); 
	      assertEquals("sim", calculador.concatERemove("aba", "aba", 7),      
	    	        "Deve funcionar."); 
	      assertEquals("não", calculador.concatERemove("blufblufbluf", "bluftruf", 3),      
	    	        "Deve funcionar."); 
	      assertEquals("não", calculador.concatERemove("tomas", "tomahawk", 3),      
	    	        "Deve funcionar.");   
	    }
	           
	    @RepeatedTest(5)                                    
	    @DisplayName("Teste de Argumentos")
	    public void testeRepetido() {
		      assertEquals("não", calculador.concatERemove("blufblufbluf", "bluf", 3),      
		    	        "Deve funcionar."); 
	    }
}
