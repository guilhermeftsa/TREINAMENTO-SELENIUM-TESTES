package treinamento.guilherme.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

		private static WebDriver driver;
		
		private DriverFactory(){}
		
		public static WebDriver getDriver(){
			if(driver == null){
				switch (Propriedades.browsers) {
				case FIREFOX:driver = new FirefoxDriver(); break;
				case CHROME:driver = new ChromeDriver(); break;				
				}				
				driver.manage().window().setSize(new Dimension(1200,785));
			}
			return driver;
		}
		
		public static void KillDriver(){
			if(driver != null){
				driver.quit();
				driver = null;
			}			
		}
}