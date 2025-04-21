Feature: Login Feature
  Scenario: Verificar login con usuario válido
    Given el usuario está en la página de login
    When ingresa credenciales válidas
    Then el usuario es autenticado y es redirigido a la página principal