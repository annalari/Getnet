Feature: Verificar onde posso realizar saques com o meu Cart�o SuperGet?

  Scenario Outline: Como me informar onde posso realizar saques com o meu Cart�o SuperGet?
    Given estou na pagina inicial
    When clico no icone de pesquisa
    And digito '<campoBusca>' 
    And clicar em procurar
    When o sistema apresenta os resultados 
    And clico no link '<linkDuvida>'
    Then Verifico se o titulo da modal apresenta a frase '<linkDuvida>'

    Examples: 
      | campoBusca | linkDuvida                                               	  |
      | superget   | Como acesso a minha conta SuperGet?                          |
      | superget   | Onde posso realizar saques com o meu Cart�o SuperGet?				|