package treinamento.guilherme.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import treinamento.guilherme.pages.LoginPage;


public class BaseTest {
	
	private LoginPage page = new LoginPage();
	
	@Rule
	public TestName testname = new TestName();
	
	
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target"+ File.separator +"screenshot"
				+ File.separator + testname.getMethodName()+ ".jpg"));		
				
		if(Propriedades.FECHAR_BROWSER){
			DriverFactory.KillDriver();
		}
	}
}
