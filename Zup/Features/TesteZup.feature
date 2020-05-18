@FeatureTesteZup
Feature: Testes Automatizados Zup
  Desafio Zup - automacao Web
  
  @Scenario
  Scenario Outline: Desafio Zup - automacao Web  - positivo
    Given O usuario acessa o site de comercio online
    When O usuario pesquisa por um item: "<itemPesquisado>"
    And O usuario seleciona o item desejado: "<itemPesquisado>"
    And O usuario adiciona o item "<itemPesquisado>" no carrinho
    Then O usuario valida que o item "<itemPesquisado>" foi adicionado no carrinho
    Examples: 
      | itemPesquisado |
      | Impressora HP DeskJet | 

   @Scenario
  Scenario Outline: Desafio Zup - automacao Web  - negativo
    Given O usuario acessa o site de comercio online
    When O usuario pesquisa por um item: "<itemPesquisado>"
    Then O resultado da pesquisa nao exibe produtos para o item: "<itemPesquisado>"
    Examples: 
      | itemPesquisado |
      | 123testes123abc |