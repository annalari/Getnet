Feature: Verificar onde posso realizar saques com o meu Cartão SuperGet?

  Scenario Outline: Como me informar onde posso realizar saques com o meu Cartão SuperGet?
    Given estou na pagina inicial
    When clico no icone de pesquisa
    And digito '<campoBusca>' 
    And clicar em procurar
    When o sistema apresenta os resultados '<campoBusca>'
    And clico no link '<linkDuvida>'
    Then Verifico se o titulo da modal apresenta a frase '<linkDuvida>'

    Examples: 
      | campoBusca | linkDuvida                                               	  |
      | superget   | Onde posso realizar saques com o meu Cartão SuperGet?				|