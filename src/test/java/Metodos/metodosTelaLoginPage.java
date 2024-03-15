package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosTelaLoginPage {
	
	
	WebDriver navegador;
	
	
	public void abrirNavegadoESite(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    navegador = new ChromeDriver();
	    navegador.manage().window().maximize();
	    navegador.get(url);
	}
	
	public void clicar(By elemento) {
		navegador.findElement(elemento).click();
	}
	
	public void preencherTexto(By elemento , String texto) {
		navegador.findElement(elemento).sendKeys(texto);
	}
	
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador() {
		navegador.quit();
	}
	public void vadidarTexo(By elemento , String texto) {
		String mensagem =navegador.findElement(elemento).getText();
		assertEquals(texto,mensagem);
   }
	
	public void scroll(By elemento) {
		WebElement element =navegador.findElement(elemento);
		((JavascriptExecutor)navegador).executeScript("arguments[0].scrollIntoView(true);",element);
	}

	public void tirarPrint(String string) {
	
		
	}
}

	
	


