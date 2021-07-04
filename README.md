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
1ª pessoa -> compartilha;
2ª pessoa -> compartilha;
3ª pessoa -> compartilha;
4ª pessoa -> encerrado o ciclo sem novo compartilhamento.
O valor base para os cálculos será o informado pelo usuário na caixa de diálogo, e na sequência o script calcula e devolve o resultado da projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio, considerando a somatória de anúncio original com as novas visualizações que foram obtidas com os novos compartilhamentos.

Para a execução da 2ª parte do projeto foi solicitada criação de um software que permita o cadastro de anúncios, com os respectivos dados listados a seguir:
- nome do anúncio;
- cliente;
- data de início;
- data de término;
- investimento por dia.
O sistema deve também fornecer o relatório de cada anúncio, podendo ser filtrado tanto por intervalo de tempo e cliente. Os ítens a seguir são os específicos que devem aparecer no relatório:
- valor total investido;
- quantidade máxima de visualizações;
- quantidade máxima de cliques;
- quantidade máxima de compartilhamentos;


### 📋 Pré-requisitos globais (para ambas as partes)
* Instalação do [Eclipse IDE for Java Developers] (https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-06/R/eclipse-java-2021-06-R-win32-x86_64.zip&mirror_id=576), link para download na descrição construído com na sequência abaixo;
* Instalação do [Java SE Development Kit 16] (https://www.oracle.com/java/technologies/javase-jdk16-downloads.html);
* Junit 5, nas versão indicada do IDE do Eclipse já está disponível essa versão do JUnit. 


### 🔧 Instalação da 1ª Parte
Após a instalação da IDE do Eclipe, e atualização da versão do Java importe o projeto no Eclipse.
Abra a calculadora na 1ª Parte, especificamente o arquivo calculadora.java).
Se tudo tiver corrigo bem você verá a tela dessa maneira
![image](https://user-images.githubusercontent.com/86390616/124385827-d2dbb880-dcad-11eb-9f72-847366d0216d.png)
Execute o script de acordo com o valor desejado para cálculo.
Duas janelas de diálogo deverão aparecer para você, a primeira pedindo um valor para calcular a estimativa de visualizações, a segunda informando a estimativa para o valor que você informar.

Primeira janela de diálogo
![image](https://user-images.githubusercontent.com/86390616/124385995-7f1d9f00-dcae-11eb-9932-e10e2f8d45ef.png)


Janela com o valor informado
![image](https://user-images.githubusercontent.com/86390616/124386012-92c90580-dcae-11eb-9512-c82d2c4a0e33.png)


Segunda janela de diálogo com retorno da estimativa
![image](https://user-images.githubusercontent.com/86390616/124386035-aa07f300-dcae-11eb-957a-81e3bc0e9244.png)



## ⚙️ Executando os testes na 1ª Parte

Foram implentadas na classe calculadoraTest algumas condicionais correspondentes aos valores que representam o mínimo para ter 30 visualizações, e os valores dos pontos de virada quando entra em cada ciclo.
O cálculo de base foi um teste de mesa demonstrando o que deveria acontecer para cada valor estimado, usando investimento de centavo a centavo, considerando o intervalo do valor de investimento de R$0,01 a R$10,00 em moeda brasileira, conforme demonstra a imagem abaixo O teste de mesa foi organizado e devidamente arredondado em uma planilha do Excel, que anexo aqui para apreciação e compreensão da metodologia adotada para chegar aos valores aqui comparados.
As linhas amarelas demonstram os pontos de virada, ou seja, os valores que iniciam o ciclo da próxima etapa. Exceto o valor de R$ 9,57 que demonstra o ponto de virada que seria o momento que se não houvesse a restrição sobre parar na quarta pessoa, a calculadora iniciaria a previsão para um novo compartilhamento, pois segundo os cálculos a partir de 7 cliques haveria um novo compartilhamento.
![image](https://user-images.githubusercontent.com/86390616/124386811-847ce880-dcb2-11eb-817a-1180157163d7.png)
Como observado na imagem anterior os valores de virada são R$2,24, R$3,90 e R$5,47.

Conforme demonstra a tela a seguir foi implementado o Teste Unitário do arquivo calculadoraTest.Java, para esses pontos de virada descritos e também a verificação para o valor base de R$1,00.
![image](https://user-images.githubusercontent.com/86390616/124387917-b8f2a380-dcb6-11eb-81df-c87a4e3126b8.png)

Verificou-se que foram contempladas as realidades apresentadas nos testes.


## 🛠️ Construído com

* [Eclipse IDE](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-06/R/eclipse-java-2021-06-R-win32-x86_64.zip&mirror_id=576)
* [Java SE 16] (https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)


### 🔧 Instalação da 2ª Parte
Subentende-se que foram instalados corretamente os ítens especificados para a 1ª parte, que serão necessário para a 2ª parte também.
Por se tratar de um sistema, precisamos garantir a persistência de dados, para tal, será necessária a instalação do JDBC Driver for MySQL, da biblioteca do [JavaFx](https://gluonhq.com/download/javafx-16-sdk-windows/), do Modelador JavaFC Scene Builder

## ⚙️ Executando os testes

Na 1ª parte foram implentadas na classe calculadoraTest algumas condicionais correspondentes aos valores que representam o mínimo para ter 30 visualizações, e os valores dos pontos de virada quando entra em cada ciclo.


## 🛠️ Construído com

* [Eclipse IDE](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe)
* [MySQL]()


## ✒️ Autor

-----


## 📄 Licença

Este projeto está sob a licença (sua licença) - veja o arquivo [LICENSE.md](https://github.com/usuario/projeto/licenca) para detalhes.

## 🎁 Expressões de gratidão

* Conte a outras pessoas sobre este projeto 📢
