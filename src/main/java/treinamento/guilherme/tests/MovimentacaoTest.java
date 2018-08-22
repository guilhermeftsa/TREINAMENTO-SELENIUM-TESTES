package treinamento.guilherme.tests;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import treinamento.guilherme.core.*;
//import treinamento.guilherme.core.BaseTest;
//import treinamento.guilherme.core.Propriedades;
//import treinamento.guilherme.pages.MenuPage;
import treinamento.guilherme.pages.*;
import treinamento.guilherme.utils.DataUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	MovimentacaoPage moviPage = new MovimentacaoPage();
	
	@Test
	public void test1_inserirMovimentacao(){
		menuPage.acessarTelaInserirMovimentacao();
		
		moviPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));
		moviPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));
		moviPage.setDescricao("Movimentação de Teste");
		moviPage.setInteressado("Interessado Qualquer");
		moviPage.setValor("520");
		moviPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		moviPage.setStatusPago();
		moviPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", moviPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_CamposObrigatorios(){
		menuPage.acessarTelaInserirMovimentacao();
		moviPage.salvar();
		List <String> erros = moviPage.obterErros();
//		Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório"));
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório",
				"Descrição é obrigatório",
				"Interessado é obrigatório",
				"Valor é obrigatório",
				"Valor deve ser um número"
				)));
		Assert.assertEquals(6, erros.size());
	}
	
	@Test
	public void test3_InserirMovimentacaoFutura(){
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		moviPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		moviPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		moviPage.setDescricao("Movimentação de Teste");
		moviPage.setInteressado("Interessado Qualquer");
		moviPage.setValor("500");
		moviPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		moviPage.setStatusPago();
		moviPage.salvar();
		
		List <String> erros = moviPage.obterErros();
		Assert.assertTrue(erros.containsAll(Arrays.asList(
		"Data da Movimentação deve ser menor ou igual à data atual")));
		Assert.assertEquals(1, erros.size());
				
	}
}
