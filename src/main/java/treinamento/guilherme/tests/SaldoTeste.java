package treinamento.guilherme.tests;

import org.junit.Assert;
import org.junit.Test;

import treinamento.guilherme.core.*;
import treinamento.guilherme.pages.*;


public class SaldoTeste extends BaseTest {
	HomePage homePage = new HomePage();
	MenuPage menuP = new MenuPage();
	
	@Test
	public void testSaldoContas(){
		 menuP.acessarTelaPrincipal();
		Assert.assertEquals("520.00", homePage.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}
}
