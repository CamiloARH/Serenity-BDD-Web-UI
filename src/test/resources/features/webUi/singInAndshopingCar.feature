Feature:realizar un Sing in
  Como usuario me quiero registrar al sistema
  quiero crear una cuenta
  para poder comprar


  Scenario: inscribirse en la pagina con todos los datos
    Given el usuario debe incribirse en la pagina
    When el usuario entra a Sign In
    Then el usuario completa la incripcion y debera ver su nombre

  Scenario: inscribirse en la pagina solo con casi todos los datos
    Given el usuario debe incribirse en la pagina para comprar
    When el usuario entra a Sign In para incribirse
    Then el usuario realiza la incripcion y debera ver su nombre
