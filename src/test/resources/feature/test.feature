@test
  Feature: Prueba de la pagina web de AngularJS

    Background: Despligue de la aplicación web
      Given que Saul cargo la pagina

    @Case1
    Scenario: Agregar una palabra clave

      When agrego la palabra clave 'otra'
      Then verifico que la palabra 'otra' haya sido agregada


