package treinamento.guilherme.pages;

import org.openqa.selenium.By;

import treinamento.guilherme.core.BasePage;


public class HomePage extends BasePage {
	
	public String obterSaldoConta(String nome){	
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
			
}
