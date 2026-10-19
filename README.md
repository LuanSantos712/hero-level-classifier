# Classificador de Nível de Herói — Java

## Descrição do Projeto

Projeto desenvolvido como parte do desafio prático de lógica de programação da DIO, com o objetivo de classificar heróis de acordo com sua quantidade de pontos de experiência (XP), utilizando a linguagem Java.

## Objetivo

Implementar um algoritmo que determine o nível de um herói com base em intervalos de XP predefinidos e exiba uma mensagem contendo seu nome e o nível alcançado.

## Conceitos Aplicados

- **Variáveis e tipos de dados:** utilização de `String` para armazenar textos e `int` para representar a experiência do herói.
- **Operadores relacionais:** aplicação dos operadores `<` e `<=` para avaliar os intervalos de XP.
- **Estruturas condicionais:** utilização de `if`, `else if` e `else` para determinar o nível correspondente.
- **Laços de repetição:** utilização de `while` para demonstrar o controle de fluxo com base em uma condição.
- **Comparação de strings:** utilização do método `equals()` para verificar o conteúdo da variável de controle do laço.
- **Formatação de strings:** utilização de `String.format()` e do especificador `%s` para construir a mensagem de saída de maneira legível.
- **Saída no console:** utilização de `System.out.println()` para apresentar o resultado.

## Funcionamento

O programa inicializa as variáveis com o nome e a quantidade de XP do herói. Em seguida, avalia os intervalos de experiência por meio de estruturas condicionais, atribuindo o nível correspondente à variável `nivel`.

Após a classificação, utiliza `String.format()` para construir a mensagem final e `System.out.println()` para exibi-la no console.

A estrutura `while` demonstra o funcionamento de um laço de repetição condicionado ao valor da variável `continuar`. Na implementação atual, o laço executa apenas uma iteração, pois a variável recebe o valor `"não"` ao final da execução.

## Exemplo de Saída

`O Herói de nome Luan está no nível de Platina`

## Tecnologias

- Java
- Git e GitHub

## Aprendizados

O projeto reforça os fundamentos da lógica de programação e sua aplicação em Java, incluindo declaração de variáveis, operadores relacionais, estruturas condicionais, laços de repetição e formatação de strings. Também contribui para a compreensão das diferenças sintáticas entre JavaScript e Java.

## Observações Técnicas e Melhorias Futuras

A implementação atual utiliza valores predefinidos para o nome e a quantidade de experiência (XP) do herói. O laço `while` foi incorporado para demonstrar o controle de fluxo por meio de estruturas de repetição, sendo encerrado após uma única iteração pela alteração da variável de controle `continuar`.

Como potenciais melhorias futuras, propõe-se:

- **Entrada dinâmica de dados:** utilizar a classe `Scanner` para permitir que o usuário informe o nome e a quantidade de XP do herói durante a execução.
- **Iteração de múltiplos registros:** adaptar o laço `while` para possibilitar a classificação de vários heróis em uma única execução.
- **Controle de encerramento:** implementar uma condição de saída interativa, permitindo ao usuário decidir quando finalizar o programa.
- **Validação de entradas:** verificar se a quantidade de XP informada é válida e tratar entradas incompatíveis com o tipo de dado esperado.
- **Organização e reutilização do código:** encapsular a lógica de classificação em um método específico, favorecendo a legibilidade, a manutenção e a reutilização da implementação.
