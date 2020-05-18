$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TesteZup.feature");
formatter.feature({
  "line": 2,
  "name": "Testes Automatizados Zup",
  "description": "Desafio Zup - automacao Web",
  "id": "testes-automatizados-zup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTesteZup"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Desafio Zup - automacao Web  - positivo",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----positivo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "O usuario acessa o site de comercio online",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "O usuario pesquisa por um item: \"\u003citemPesquisado\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "O usuario seleciona o item desejado: \"\u003citemPesquisado\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "O usuario adiciona o item \"\u003citemPesquisado\u003e\" no carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "O usuario valida que o item \"\u003citemPesquisado\u003e\" foi adicionado no carrinho",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----positivo;",
  "rows": [
    {
      "cells": [
        "itemPesquisado"
      ],
      "line": 13,
      "id": "testes-automatizados-zup;desafio-zup---automacao-web----positivo;;1"
    },
    {
      "cells": [
        "Impressora HP DeskJet"
      ],
      "line": 14,
      "id": "testes-automatizados-zup;desafio-zup---automacao-web----positivo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Desafio Zup - automacao Web  - positivo",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----positivo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTesteZup"
    },
    {
      "line": 5,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "O usuario acessa o site de comercio online",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "O usuario pesquisa por um item: \"Impressora HP DeskJet\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "O usuario seleciona o item desejado: \"Impressora HP DeskJet\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "O usuario adiciona o item \"Impressora HP DeskJet\" no carrinho",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "O usuario valida que o item \"Impressora HP DeskJet\" foi adicionado no carrinho",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.abrirNavegadorEacessarOsite()"
});
formatter.result({
  "duration": 20532777902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Impressora HP DeskJet",
      "offset": 33
    }
  ],
  "location": "Steps.usuarioPesquisaPorItem(String)"
});
formatter.result({
  "duration": 12473686889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Impressora HP DeskJet",
      "offset": 38
    }
  ],
  "location": "Steps.usuarioSelecionaOItemDesejado(String)"
});
formatter.result({
  "duration": 6110863644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Impressora HP DeskJet",
      "offset": 27
    }
  ],
  "location": "Steps.usuarioAdicionaOItemNoCarrinho(String)"
});
formatter.result({
  "duration": 12053775318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Impressora HP DeskJet",
      "offset": 29
    }
  ],
  "location": "Steps.usuarioValidaCarrinho(String)"
});
formatter.result({
  "duration": 309304945,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Desafio Zup - automacao Web  - negativo",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----negativo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "O usuario acessa o site de comercio online",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "O usuario pesquisa por um item: \"\u003citemPesquisado\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "O resultado da pesquisa nao exibe produtos para o item: \"\u003citemPesquisado\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----negativo;",
  "rows": [
    {
      "cells": [
        "itemPesquisado"
      ],
      "line": 22,
      "id": "testes-automatizados-zup;desafio-zup---automacao-web----negativo;;1"
    },
    {
      "cells": [
        "123testes123abc"
      ],
      "line": 23,
      "id": "testes-automatizados-zup;desafio-zup---automacao-web----negativo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Desafio Zup - automacao Web  - negativo",
  "description": "",
  "id": "testes-automatizados-zup;desafio-zup---automacao-web----negativo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTesteZup"
    },
    {
      "line": 16,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "O usuario acessa o site de comercio online",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "O usuario pesquisa por um item: \"123testes123abc\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "O resultado da pesquisa nao exibe produtos para o item: \"123testes123abc\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.abrirNavegadorEacessarOsite()"
});
formatter.result({
  "duration": 13955449526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123testes123abc",
      "offset": 33
    }
  ],
  "location": "Steps.usuarioPesquisaPorItem(String)"
});
formatter.result({
  "duration": 11349209852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123testes123abc",
      "offset": 57
    }
  ],
  "location": "Steps.resultadoPesquisaNaoExibeProdutos(String)"
});
formatter.result({
  "duration": 102413273,
  "status": "passed"
});
});