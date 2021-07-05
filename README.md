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
* Instalação do [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-06/R/eclipse-java-2021-06-R-win32-x86_64.zip&mirror_id=576).
* Instalação do [Java SE Development Kit 16](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html);
* Junit 5, nas versão indicada do IDE do Eclipse já está disponível essa versão do JUnit. 


### 🔧 Instalação da 1ª Parte
Após a instalação da IDE do Eclipe, instale ou atualize a versão do Java caso necessário. Na sequência importe o projeto no Eclipse.
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

Foram implentadas na classe calculadoraTest algumas condicionais correspondentes aos valores correspondetes aos pontos de virada, os quais representam o valor que inicia a entrada no próximo ciclo de compartilhamento.
O cálculo de base foi um teste de mesa demonstrando o que deveria acontecer para cada valor estimado, usando investimento de centavo a centavo, considerando o intervalo do valor de investimento de R$0,01 a R$10,00 em moeda brasileira, conforme demonstra a imagem abaixo O teste de mesa foi organizado e devidamente arredondado em uma planilha do Excel, que anexo aqui para apreciação e compreensão da metodologia adotada para chegar aos valores aqui comparados.
As linhas amarelas demonstram os pontos de virada, ou seja, os valores que iniciam o ciclo da próxima etapa. Exceto o valor de R$ 9,57 que demonstra o ponto de virada que seria o momento que se não houvesse a restrição sobre parar na quarta pessoa, a calculadora iniciaria a previsão para um novo compartilhamento, pois segundo os cálculos a partir de 7 cliques haveria um novo compartilhamento.
![image](https://user-images.githubusercontent.com/86390616/124386811-847ce880-dcb2-11eb-817a-1180157163d7.png)
Como observado na imagem anterior os valores de virada são R$2,24, R$3,90 e R$5,47.

Conforme demonstra a tela a seguir foi implementado o Teste Unitário do arquivo calculadoraTest.Java, para esses pontos de virada descritos e também a verificação para o valor base de R$1,00.
![image](https://user-images.githubusercontent.com/86390616/124387917-b8f2a380-dcb6-11eb-81df-c87a4e3126b8.png)

Verificou-se que foram contempladas as realidades apresentadas nos testes.


## 🛠️ Construído com

* [Eclipse IDE](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-06/R/eclipse-java-2021-06-R-win32-x86_64.zip&mirror_id=576)
* [Java SE Development Kit 16](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)

### 🔧 Instalação da 2ª Parte
Subentende-se que foram instalados corretamente os ítens especificados para a 1ª parte, que serão necessário para a 2ª parte também.
Por se tratar de um sistema, precisamos garantir a persistência de dados, para tal, será necessária a instalação do JDBC Driver for MySQL, e do Xampp ou similar para estabelecer a conexão com o Banco de dados. Será necessária também a instalação da biblioteca do [JavaFx](https://gluonhq.com/download/javafx-16-sdk-windows/), para a manipulação dos arquivos .fxml.

Após a instalação do Xampp, verifique se o Apache e o MySQL estão ativos conforme demonstra a imagem a seguir:
![image](https://user-images.githubusercontent.com/86390616/124389499-c19aa800-dcbd-11eb-8199-9ad58491d4b3.png)


Rode a Query que está no arquivo banco.sql que se encontra no pacote banco. Verifique se está tudo ok com o banco, caso esteja, abra a classe Conexao.java que está no pacote banco, verifique os campos do nome do usuário e senha, e caso seu usuário ou senha sejam diferentes, substitua-os, se mantiver o mesmo padrão de usuário "root" e estiver sem senha, basta executar a classe que a conexão com o banco será estabelecida.
![image](https://user-images.githubusercontent.com/86390616/124399937-49e86f80-dcf5-11eb-8fdf-709a5731196f.png)

Edite no Run Configurations... O valor do VM Arguments, com a seguinte instrução: --module-path ".../JavaFX/lib" --add-modules javafx.controls,javafx.fxml, a qual está demonstrada na imagem abaixo.
![image](https://user-images.githubusercontent.com/86390616/124399975-90d66500-dcf5-11eb-9d5e-49150d2e9124.png)


Na sequência execute a classe Main.java. Se todos os passos anteriores foram seguidos corretamente, surgirá a tela a seguir:
![image](https://user-images.githubusercontent.com/86390616/124391744-720da980-dcc8-11eb-8c8f-b20b89b6fe2a.png)


Clique no botão Cadastrar anúncio, na sequência insira os dados solicitados, conforme demonstra a imagem a seguir:
![image](https://user-images.githubusercontent.com/86390616/124391783-923d6880-dcc8-11eb-818b-2a8e6f960347.png)

Se algum dos campos não for preenchido, o anúncio não é salvo.
O sistema retorna os erros.
A imagem a seguir demonstra a validação geral.
![image](https://user-images.githubusercontent.com/86390616/124399217-76e65380-dcf0-11eb-9d6f-b1aea15982e8.png)


A imagem a seguir demonstra um cadastro bem suscedido.
![image](https://user-images.githubusercontent.com/86390616/124399204-59b18500-dcf0-11eb-8852-bb36fa5ad2aa.png)


Na sequência para gerar relatório, clique no botão gerar relatório e aparecerá a tela a seguir.
![image](https://user-images.githubusercontent.com/86390616/124392340-52c44b80-dccb-11eb-8a88-a7ac56c05573.png)


Ao clicar no botão gerar relatório, se os campos estiverem vazios a validação se dará conforme demonstrada na tela abaixo:
![image](https://user-images.githubusercontent.com/86390616/124399343-1acfff00-dcf1-11eb-8e11-90c929b6ca7b.png)


Essa é uma demonstração da pesquisa por nome do cliente. A caixa de confirmação trás os dados do cadastro no banco de dados e os respectivos valores.
![image](https://user-images.githubusercontent.com/86390616/124399603-be6ddf00-dcf2-11eb-8eeb-9e91191fb115.png)


Caso o nome do cliente não esteja atribuído a algum anúncio, o sistema adverte que não encontrou registro para o dado solicitado para relatório, conforme demonstra a tela a seguir:
![image](https://user-images.githubusercontent.com/86390616/124399753-ec9fee80-dcf3-11eb-99c1-0d2ae29d1306.png)

As imagens a seguir demonstram 4 realidades sobre a validação das datas:

![image](https://user-images.githubusercontent.com/86390616/124399838-9da68900-dcf4-11eb-9ad6-64fce2195969.png)

![image](https://user-images.githubusercontent.com/86390616/124399840-a008e300-dcf4-11eb-8ed4-38080637a999.png)

![image](https://user-images.githubusercontent.com/86390616/124399848-a8f9b480-dcf4-11eb-8c89-18fef7e346ad.png)

![image](https://user-images.githubusercontent.com/86390616/124399849-ad25d200-dcf4-11eb-84db-ef0606e6dcb7.png)



## ⚙️ Executando os testes

Foram implementados os testes:
* Para a conexão com o Banco de Dados na classe ConexaoTest.java;
* Para os módulos de cadastro, também consultas de diferença entre datas e consulta de nome de cliente no banco de dados. Os testes encontram-se na classe ControleanuncioTest.java.



## 🛠️ Construído com

* [Eclipse IDE](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe)
* [JDBC Driver for MySQL]()
* [Xampp]()


## ✒️ Autor

[Maressa Vargas de Oliveira](https://www.linkedin.com/in/maressa-vargas-de-oliveira-08a309129/)


## 📄 Licença

Este projeto está sob a licença (sua licença) - veja o arquivo [LICENSE.md](https://github.com/usuario/projeto/licenca) para detalhes.

## 🎁 Expressões de gratidão

* Agradeço à Deus pelo dom da vida e capacitação;
* Agradeço à minha família pelo apoio e dedicação a mim oferecidos;
* Agradeço à Capgemini pela oportunidade de crescimento e aperfeiçoamento;
* Conte a outras pessoas sobre este projeto 📢
