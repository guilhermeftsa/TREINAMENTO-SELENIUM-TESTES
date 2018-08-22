package treinamento.guilherme.suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import treinamento.guilherme.core.*;
import treinamento.guilherme.pages.*;
import treinamento.guilherme.tests.*;


@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	removerMovimentacaoContaTest.class,
	SaldoTeste.class,
	ResumoTest.class	
})
public class SuiteGeral {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("guilherme2@gmail.com");
		page.setSenha("12345678");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.KillDriver();
	}
	
}
