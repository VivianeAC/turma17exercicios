package Elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	
	private By preenchercamppesquisa = By.id("search_query_top");
	private By btnclicarempesquisar = By.name("submit_search");
	private By btnclicaremblouse = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a");
	private By btnclicarnacorbranca = By.id("color_8");
	private By btnclicaraddtocart = By.id("add_to_cart");
	private By btnclicarchechkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	private By btnclicarchechkout2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span/i");
	
	public By getPreenchercamppesquisa() {
		return preenchercamppesquisa;
	}

	public By getBtnclicarempesquisar() {
		return btnclicarempesquisar;
	}

	public By getBtnclicaremblouse() {
		return btnclicaremblouse;
	}

	public By getBtnclicarnacorbranca() {
		return btnclicarnacorbranca;
	}

	public By getBtnclicaraddtocart() {
		return btnclicaraddtocart;
	}

	public By getBtnclicarchechkout() {
		return btnclicarchechkout;
	}

	public By getBtnclicarchechkout2() {
		return btnclicarchechkout2;
	}

	public By getBtnLogin() {
		
		return null;
	}

	public By getCpPassword() {
	
		return null;
	}

	public By getCpLogin() {
	
		return null;
	}
}
	
	