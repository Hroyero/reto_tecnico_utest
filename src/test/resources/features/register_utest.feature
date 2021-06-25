#Autor: Hollmans Royero Mendoza

  @stories
  Feature: Utest,
    As a user, I want to be able to register on the Utest page

  @scenario1
  Scenario Outline: search for registration option in Utest
    Given hollmans wants to register in utest
    When he search for the option to register and fill the registration form
    | strFirstName   | strLastName   | strEmailAddress   | strMonth   | strDay   | strYear   | strCity   | strPostal   | strPassword    | strConfirmPassword |
    | <strFirstName> | <strLastName> | <strEmailAddress> | <strMonth> | <strDay> | <strYear> | <strCity> | <strPostal> | <strPassword> | <strConfirmPassword> |
    Then he registers on the page
    | strRegistered   |
    | <strRegistered> |

    Examples:
      | strFirstName   | strLastName   | strEmailAddress       | strMonth   | strDay    | strYear     | strCity   | strPostal   | strPassword  | strConfirmPassword |  strRegistered   |
      | Hollmans       | Royero        | hroyero1234@gmail.com | number:7   | number:22 | number:1996 | Bogota    | 10001014    | Contr#12345Q | Contr#12345Q       | Complete Setup   |