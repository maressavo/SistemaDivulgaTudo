package testebanco;

import org.junit.jupiter.api.Test;

import banco.Conexao;

class ConexaoTest {

	@Test
	void testConectar() {
		Conexao conexao = new Conexao();
		conexao.Conectar();
	}

}
