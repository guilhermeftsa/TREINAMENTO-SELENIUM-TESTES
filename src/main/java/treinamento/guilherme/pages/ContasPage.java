package treinamento.guilherme.pages;

import org.openqa.selenium.By;

import treinamento.guilherme.core.BasePage;


public class ContasPage extends BasePage {
	
	public void setNome(String nome){
		escrever("nome", nome);
	}
	
	public void salvar(){
		clicarBotaoPorTexto("Salvar");
	}
	
	public String obterMensagemErro(){
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	
	
	public String obterMensagemSucesso(){
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	public void clicarAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	public void clicarRemoverConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
	
}
