package treinamento.guilherme.pages;

import org.openqa.selenium.By;

import treinamento.guilherme.core.BasePage;
import treinamento.guilherme.core.DriverFactory;



public class LoginPage extends BasePage {
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("https://srbarriga.herokuapp.com");
	}
	
	public void setEmail(String email){
		escrever("email", email);
	}
	
	public void setSenha(String senha){
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Entrar");
	}
}
