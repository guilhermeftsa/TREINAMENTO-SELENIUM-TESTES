package treinamento.guilherme.tests;

import org.junit.Assert;
import org.junit.Test;

import treinamento.guilherme.core.*;
import treinamento.guilherme.pages.*;

public class removerMovimentacaoContaTest extends BaseTest {
		MenuPage menuP = new MenuPage();
		ContasPage contasP = new ContasPage();
	
	@Test
	public void ExcluirContaComMovimentacao(){
		menuP.acessarTelaListagem();
		
		contasP.clicarRemoverConta(Propriedades.NOME_CONTA_ALTERADA);
		Assert.assertEquals("Conta em uso na movimentações", contasP.obterMensagemErro());
	}
}
