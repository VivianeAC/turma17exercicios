package Steps;

import java.io.IOException;

import Elementos.ElementosLogin;
import Metodos.metodosTelaLoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class teste {
	
	ElementosLogin el = new ElementosLogin();
	metodosTelaLoginPage met = new metodosTelaLoginPage();
	

@Dado("que esteja no site {string}")
public void que_esteja_no_site(String string) throws InterruptedException {
	met.abrirNavegadoESite(string);
	met.pausar(2000);
  
}

@Quando("clicar para logar")
public void clicar_para_logar() throws InterruptedException {
	met.clicar(el.getBtnLogin());
	met.pausar(4000);
    
}

@Quando("preencher login e senha validos")
public void preencher_login_e_senha_validos() {
	met.preencherTexto(el.getCpLogin(), "testeturma18@gmail.com");
	met.preencherTexto(el.getCpPassword(), "123456789");
	
   
}

@Entao("é logado com sucesso")
public void é_logado_com_sucesso() {
	met.clicar(el.getBtnLogin());
	met.fecharNavegador(); 
}
@Quando("clicar no logo")
public void clicar_no_logo() {

}

@Quando("preencher campo de pesquisa")
public void preencher_campo_de_pesquisa()throws InterruptedException {
	met.preencherTexto(el.getPreenchercamppesquisa(), "t-shirts");
	met.pausar(2000);
}

@Quando("clicar em pesquisar")
public void clicar_em_pesquisar() {
	met.clicar(el.getBtnclicarempesquisar());
}

@Quando("clicar em blouse , escolher a cor branca")
public void clicar_em_blouse_escolher_a_cor_branca() throws InterruptedException, IOException {
	met.clicar(el.getBtnclicaremblouse());
	met.pausar(2000);
	met.clicar(el.getBtnclicarnacorbranca());
	met.pausar(2000);
    met.tirarPrint("meio");
}

@Quando("adicionar ao carrinho , clicarei no theckout")
public void adicionar_ao_carrinho_clicarei_no_theckout() throws InterruptedException, IOException {
	met.pausar(2000);
	met.clicar(el.getBtnclicaraddtocart());
	met.pausar(2000);
	met.scroll(el.getBtnclicarchechkout());
	met.pausar(2000);
	met.clicar(el.getBtnclicarchechkout());
	met.pausar(2000);
	met.clicar(el.getBtnclicarchechkout2());
	met.pausar(2000);
	met.tirarPrint("tela final");

}

@Entao("validara a mensagem shopping-cart summary e levata a tela de compra")
public void validara_a_mensagem_shopping_cart_summary_e_levata_a_tela_de_compra() {

	met.fecharNavegador();
	
}

public ElementosLogin getEl() {
	return el;
}

public metodosTelaLoginPage getMet() {
	return met;
}

}

