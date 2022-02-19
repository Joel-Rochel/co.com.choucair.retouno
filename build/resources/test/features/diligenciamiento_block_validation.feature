#Autor: Joel Rochel

@Stories
Feature: Colorlib
  As a user, I want to verify the completion of the Block Validation screen
  @scenario1
  Scenario:Verify the completion of the Block Validation screen
    Given Joel logs in to the colorlib page
      |strUsuario|strClave|
      |demo      |demo    |
    When Enter Block Validation Functionality
    And Enter all the required information
      |strRequired|strEmail       |strPassword|strCPassword|strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|12345@JDRH |12345@JDRH  |24081998|https://www.hola2.com|123      |7       |
    Then Check Answer
      |strTextValidation|
      |                 |

  @scenario2
  Scenario:Check message when sending the empty form
    Given validate the fields
      |strUsuario|strClave|
      |demo      |demo    |
    When save the form without filling in the fields
    Then check the field validation message
      |strCampoRequerido      |
      |This field is required.|

  @scenario3
  Scenario:Check the format of the email field
    Given Joel want to verify that the email field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong email in the field
      |strRequired|strEmail |strPassword|strCPassword|strDate |strUrl               |strDigits|strRange|
      |Joel       |gamil.com|12345@JDRH |12345@JDRH  |24081998|https://www.hola2.com|123      |7       |
    Then check the validation message in the email field
      |strEmailInvalido                   |
      |Please enter a valid email address.|

  @scenario4
  Scenario:Check the format of the password field
    Given Joel want to verify that the password field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong password in the field
      |strRequired|strEmail       |strPassword|strCPassword|strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|123        |123         |24081998|https://www.hola2.com|123      |7       |
    Then check the validation message in the password field
      |strPasswordInvalida                |strCPasswordInvalida               |
      |Please enter at least 5 characters.|Please enter at least 5 characters.|

  @scenario5
  Scenario:Check the format of the confirm password field
    Given Joel want to verify that the confirm password field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong confirm password in the field
      |strRequired|strEmail       |strPassword|strCPassword |strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|12345@JDRH |12345@JDRH@  |24081998|https://www.hola2.com|123      |7       |
    Then check the validation message in the confirm password field
      |strCPasswordInvalida              |
      |Please enter the same value again.|

  @scenario6
  Scenario:Check the format of the url field
    Given Joel want to verify that the url field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong url in the field
      |strRequired|strEmail       |strPassword|strCPassword |strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|12345@JDRH |12345@JDRH   |24081998|hola2.com            |123      |7       |
    Then check the validation message in the url field
      |strUrlInvalido           |
      |Please enter a valid URL.|

  @scenario7
  Scenario:Check the format of the only digits field
    Given Joel want to verify that the only digits field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong only digits in the field
      |strRequired|strEmail       |strPassword|strCPassword |strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|12345@JDRH |12345@JDRH   |24081998|https://www.hola2.com|ghg      |7       |
    Then check the validation message in the only digits field
      |strDigitsInvalido        |
      |Please enter only digits.|

  @scenario8
  Scenario:Check the format of the range field
    Given Joel want to verify that the range field is valid
      |strUsuario|strClave|
      |demo      |demo    |
    When enter a wrong only range in the field
      |strRequired|strEmail       |strPassword|strCPassword |strDate |strUrl               |strDigits|strRange|
      |Joel       |joel1@gamil.com|12345@JDRH |12345@JDRH   |24081998|https://www.hola2.com|123      |1       |
    Then check the validation message in the range field
      |strRangeInvalido                      |
      |Please enter a value between 5 and 16.|