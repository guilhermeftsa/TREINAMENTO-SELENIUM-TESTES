package treinamento.guilherme.pages;

import treinamento.guilherme.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta(){
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListagem(){
			clicarLink("Contas");
			clicarLink("Listar");
	}
	
	public void acessarTelaInserirMovimentacao(){
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumo(){
		clicarLink("Resumo Mensal");
	}
	
	public void acessarTelaPrincipal(){
		clicarLink("Home");
	}
	
}
