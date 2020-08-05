# Desafio Refatorando Formas de Pagamento

<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/my-study-area/desafio-aceleradev-java-refatorando-formas-pagamento">
    <a href="https://github.com/my-study-area">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/my-study-area/desafio-aceleradev-java-refatorando-formas-pagamento">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/my-study-area/desafio-aceleradev-java-refatorando-formas-pagamento">
    </a>
</p>

O Aceleradev é um treinamento da Codenation com duração de 10 semanas de imersão em programação, no meu caso Java online. Esse é o desafio do oitavo módulo que tem como conteúdos:

- Clean code
- S.O.L.I.D.
- TDD - Test Driven Development

## Desafio (Refatorando Formas de Pagamento)
Em um sistema utilizado no caixa de uma loja, há uma funcionalidade de pagamento.
A loja tem uma política de desconto de acordo com a forma de pagamento e o sistema já executa o comportamento conforme o esperado.

No entanto, o time de desenvolvimento do software notou que a complexidade dessas regras de descontos iria aumentar consideravelmente, o que fez o time perceber que a funcionalidade precisaria ser refatorada para aumentar a flexibilidade do sistema e evitar que uma mesma classe crescesse mais do que deveria, o que poderia ocasionar vários problemas - dentre eles, o aumento no esforço de manutenção e no surgimento de bugs.

A tarefa de refatoração foi dada a você. Por isso, levando em consideração princípios SOLID, como, por exemplo, o SRP (Single Responsibility Principle) e o OCP (Open Closed Principle), você deve refatorar o código da classe **BillingProcessor** de acordo com as instruções abaixo.

A classe **BillingProcessor** contém  um método com a seguinte assinatura:

**Double calculate(Order order)**

Esse método já está funcionando conforme o esperado, aplicando descontos de acordo com a forma de pagamento. Sua tarefa consiste em refatorar esse método atendendo os seguintes requisitos:
- A lógica de desconto de cada forma de pagamento deve ser encapsulada em uma classe diferente(Strategy Pattern)
    - Essas classes devem ser implementações da interface **PriceStrategy**
- Cada implementação da classe **PriceStrategy** deve ser vinculada ao enum PaymentMethod correspondente (Esse enum já possui um atributo chamado priceStrategy, utilize-o)
- Nenhuma nomenclatura de classe, atributo ou assinatura de método existente deve ser alterada.

**Observações**:

Para fins de testes, a nomenclatura das implementações da interface **PriceStrategy** devem conter o nome do Enumeration correspondente em CamelCase e sem _ (underline).
As implementações devem estar no mesmo pacote da interface **PriceStrategy** 

 

## Tópicos

Neste desafio, você utilizará:

- Strategy Pattern
- SOLID
- Enumerations

## Requisitos
Para este desafio, você precisará:

- Java 8++

Para instalar no MacOS, usando o HomeBrew, basta executar:

    brew cask install java

Para instalar no Linux e no Windows, confira os links na seção de conteúdo.

## Testes
Para executar os testes execute o comando abaixo:
```bash
./gradlew test --fail-fast -i #no Linux
