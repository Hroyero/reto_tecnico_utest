#Autor: Hollmans Royero Mendoza

  @stories
  Feature: Academy Choucair
    As a user, I want to lear how to automate om scremplay at the choucair
    Academy with the automation course
  @scenario1
  Scenario Outline: Searcn for automation course
    Given than hollmans wants to lear automation at the academy choucair
    When he search for the course introduction to utest on the choucair academy Platform
      | strUser   | strPassword   |
      | <strUser>  | <strPassword> |
    Then he finds the course called Welcome to uTest

    Examples:
      | strUser                   | strPassword   |
      | mundoalterno07@gmail.com  | Generalnos227 |