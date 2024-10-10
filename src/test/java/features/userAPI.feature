Feature: Testar API de Usuários

  Scenario: Criar, listar, atualizar e deletar um usuário
    Given que eu crio um novo usuário
    When eu obtenho o usuário pelo ID
    Then o status de resposta deve ser 200
    And o nome do usuário deve ser "Thiago Alan"

    When eu atualizo o nome do usuário
    Then o nome atualizado deve ser "Andrezza Fronza"

    When eu deleto o usuário
    Then o status de deleção deve ser 200