# Android E03: Layouts

Professor: João Eduardo Montandon

## Configuração do Ambiente

Esta lista é composta por vários projetos, onde cada um está em seu branch específico. Para carregar o projeto dessa lista você deverá fazer o clone do seu fork e executar o seguinte comando:
```
$ cd Android-E03-GUI   # Acessar o diretório do projeto
$ git checkout layouts # altera para o branch do exercício
```

Em seguida, você deverá abrir o Android Studio e abrir o projeto através da opção `File > New > Import Project...`.

## Explorando os Layouts

O Android provê uma série de layouts definidos por padrão para criar as mais diversas telas. Cada  layout possui uma série de características que o torna adequado para uso em cada uma das várias situações existentes. 

Esse exercício tem como objetivo compreender os principais layouts existentes através da criação de telas que explorem seus respectivos rescursos. Sua tarefa será criar um aplicativo que demonstre o bom uso de cada um dos principais layouts existentes, conforme instruções abaixo.

### SplashScreen

As SplashScreen são telas que aparecem no momento em que o aplicativo está carregando. Utilize o `FrameLayout` para construir uma tela de carregamento. As telas de carregamento geralmente possuem uma imagem de fundo com um componente de carregamento a frente, conforme este [exemplo](https://dribbble.com/shots/1685679-Vaporware-Splash-Screen-Animation).

### Notícia

Utilize o `RelativeLayout` para criar uma tela de exibição de notícia. A tela deverá conter:

* Título da notícia no topo da tela
* Subtítulo, posicionado embaixo do título
* Nome do autor, posicionado embaixo do subítulo, ancorado a direita
* Corpo da notícia, posicionado embaixo do autor
* Horário de postagem da notícia, embaixo do corpo da notícia, ancorado a direita
* Foto do autor, localizado embaixo do horário de postagem, localizado a esqueda
* Contatos do autor (nome + email), localizado a direita da foto do autor, ocupando o restante da tela 

### Previsão do Tempo

Utilize o `TableLayout` para criar uma tela de exibição da previsão do tempo dos últimos dias. A tela deverá apresentar a previsão diária, onde cada dia ocupará uma linha da tabela. Para cada dia, será necessário exibir o dia, um ícone com o resumo do tempo, e as temperaturas máxima e mínima para aquele dia. Utilize essa [imagem](http://www.inlovewithandroid.com/images/best-android-weather-app-yahoo-weather3.jpg) como referência.

### Formulário

Utilize o `LinearLayout` para criar uma tela de formulário de cadastro de um comentário de um aplicativo de avaliação de produtos. Essa tela deverá permitir ao usuário fornecer as seguintes informações:

* Nome
* E-mail
* Comentário (campo de texto com várias linhas)
* Nota (escala de 1 a 5)
* Botão para submeter o formulário

*OBS: Sua tela deverá organizar os layouts no formato vertical!!*

### Empacotando Tudo

Altere a `MainActivity` do projeto incluindo uma série de botões que, ao serem clicados, redirecione para cada uma das telas criadas anteriormente.
 




