# Sistema de Cadastro de anúncios

A agência Divulga Tudo necessita de um programa para gerenciamento de anúncios online. Os anúncios que ela deseja fazem parte de uma campanha nas redes sociais. Através desse software ela anseia conseguir gerir e rastrear os anúncios bem como os respectivos resultados dessa campanha.

## 🚀 Começando

Esse projeto foi elaborado no intuito de suprir as necessidades apresentadas pela agência, bem como as regras que ela estabeleceu para o desenvolvimento do software.
A agência Divulga Tudo solicitou a programação dividida em duas etapas que compreendem da seguinte maneira:
- 1ª parte: Uma calculadora de alcance de anúncios necessita ser criada;
- 2ª parte: Um sistema de cadastro de anúncios deve ser feito

Para a execução da 1ª parte não foi solicitado que se desenvolvesse uma tela interativa com diversas funções, apenas deveria ser feito um script de que atendesse aos seguintes requisitos:
- a cada 100 pessoas que visualizassem o anúncio, 12 delas clicariam nele;
- a cada 20 pessoas que clicassem no anúncio 3 delas iriam compartilhar nas redes sociais;
- cada compartilhamento nas redes sociais gerariam  40 novas visualizações;
- o investimento de R$ 1,00 corresponderia a 30 pessoas que visualizariam o anúncio original, ou seja, aquele que não foi compartilhado;
- o mesmo anúncio só poderia ser compartilhado no máximo até 4 vezes em sequência, ou seja, seria estabelecido o ciclo de compartilhamento até a terceira pessoa, porém a quarta não iria compartilhar mais, o que daria a realidade demonstrada a seguir:
*1ª pessoa -> compartilha;
*2ª pessoa -> compartilha;
*3ª pessoa -> compartilha;
*4ª pessoa -> encerrado o ciclo sem novo compartilhamento.
O valor base para os cálculos será o informado pelo usuário na caixa de diálogo, e na sequência o script calcula e devolve o resultado da projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio, considerando a somatória de anúncio original com as novas visualizações que foram obtidas com os novos compartilhamentos.
Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

Para a execução da 2ª parte do projeto foi solicitada criação de um software que permita o cadastro de anúncios, com os respectivos dados listados a seguir:
- nome do anúncio;
- cliente;
- data de início;
- data de término;
- investimento por dia.
O sistema deve também fornecer o relátio de cada anúncio, podendo ser filtrado tanto por intervalo de tempo e cliente. Os ítens a seguir são os específicos que devem aparecer no relatório:
- valor total investido;
- quantidade máxima de visualizações;
- quantidade máxima de cliques;
- quantidade máxima de compartilhamentos;


### 📋 Pré-requisitos



### 🔧 Instalação



## ⚙️ Executando os testes

Na 1ª parte foram implentadas na classe calculadoraTest algumas condicionais correspondentes aos valores que representam o mínimo para ter 30 visualizações, e os valores dos pontos de virada quando entra em cada ciclo.


## 🛠️ Construído com

* [Eclipse IDE](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe)
* [JavaFX Scene Builder 2.0]( https://www.oracle.com/java/technologies/javafxscenebuilder-1x-archive-downloads.html)


## ✒️ Autor

-----


## 📄 Licença

Este projeto está sob a licença (sua licença) - veja o arquivo [LICENSE.md](https://github.com/usuario/projeto/licenca) para detalhes.

## 🎁 Expressões de gratidão

* Conte a outras pessoas sobre este projeto 📢
