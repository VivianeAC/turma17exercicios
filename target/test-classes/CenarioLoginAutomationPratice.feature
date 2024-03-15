#language: pt


@tag
Funcionalidade: Login no site Automation pratice
  @tag1
  Cenário: Logar com sucesso no site Automation Pratice
    Dado que esteja no site "http://www.automationpractice.pl/index.php"
    Quando clicar para logar
    E clicar no logo
    E preencher campo de pesquisa
    E clicar em pesquisar
    E clicar em blouse , escolher a cor branca
    E adicionar ao carrinho , clicarei no theckout
    Entao validara a mensagem shopping-cart summary e levata a tela de compra

 