package testebanco;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import banco.Controleanuncio;

class ControleanuncioTest {

	@Test
	void testInserirdados() {//testando script do cadastro de anúncio
		Controleanuncio controle = new Controleanuncio();
		if(controle.inserirdados("Bombril mil e uma utilidades", "Bombril",
				Date.valueOf("2021-06-25"), Date.valueOf("2021-08-01"), 2)) {
			System.out.println("Dados inseridos com sucesso.");
		}else {
			System.out.println("Falha na inserção.");
		}
		if(controle.inserirdados("Bombril mil e uma utilidades", "Bombril",
				Date.valueOf("2021-06-25"), Date.valueOf("2021-08-01"), 2.51)) {
			System.out.println("Dados inseridos com sucesso.");
		}else {
			System.out.println("Falha na inserção.");
		}
	}

	@Test
	void testConsultanome() {//testando consulta de clientes no bando de dados
		Controleanuncio controle = new Controleanuncio();
		if(controle.consultanome("Bombril")!=null) {
			System.out.println("Cliente encontrado com sucesso.");
		}else {
			System.out.println("Não foram encontrados anúncios com esse critério.");
		}
	}
	
	@Test
	void testConsultadata() {//testando a consulta de datas
		Controleanuncio controle = new Controleanuncio();
		if(controle.consultadata(Date.valueOf("2021-06-25"),Date.valueOf("2021-08-01"))!=null) {
			System.out.println("Cliente encontrado com sucesso para o intervalo de datas.");
		}else {
			System.out.println("Não foram encontrados anúncios com esse critério.");
		}//
	}
}
