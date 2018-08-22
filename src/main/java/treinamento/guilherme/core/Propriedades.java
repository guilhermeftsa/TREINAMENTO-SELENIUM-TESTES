package treinamento.guilherme.core;

public class Propriedades {
	public static boolean  FECHAR_BROWSER = false;
	
	public static Browsers browsers = Browsers.CHROME;
	
	public static String NOME_CONTA_ALTERADA = "Conta alterada" + System.nanoTime();
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}
}
