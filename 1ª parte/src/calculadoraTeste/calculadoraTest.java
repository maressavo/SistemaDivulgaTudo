package calculadoraTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.calculadora;

class calculadoraTest {

	@Test
	void testCalcular() {
		calculadora calculadora=new calculadora();
		if(calculadora.Calcular(5.57)==407) {
			System.out.println("O método retornou o resultado esperado:");
		}
		else {
			System.out.println("O método não retornou o resultado esperado:");
		}
		if(calculadora.Calcular(1.0)==30) {
			System.out.println("O método retornou o resultado esperado:");
		}
		else {
			System.out.println("O método não retornou o resultado esperado:");
		}
		
		
	}
	}


