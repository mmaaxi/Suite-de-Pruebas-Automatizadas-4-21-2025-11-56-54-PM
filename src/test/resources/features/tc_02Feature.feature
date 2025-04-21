Feature: Verificar login con usuario inválido

  Scenario: Ingresar credenciales inválidas en la pantalla de login
    Given el usuario está en la página de login
    When el usuario ingresa credenciales inválidas
    Then el sistema muestra un mensaje de error