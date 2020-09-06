Feature: Verificar onde posso realizar saques com o meu Cartão SuperGet?

  Scenario Outline: Como me informar onde posso realizar saques com o meu Cartão SuperGet?
    Given estou na pagina inicial
    When clico no icone de pesquisa
    And digito '<campoBusca>' e clicar em procurar
    When o sistema apresenta os resultados 
    And clico no link '<linkDuvida>'
    Then Verifico se o titulo da modal apresenta a frase '<linkDuvida>'

    Examples: 
      | campoBusca | linkDuvida                                               	  |
      | superget   | Como acesso a minha conta SuperGet?                          |
      | superget   | Consigo visualizar minhas vendas no meu aplicativo SuperGet? |