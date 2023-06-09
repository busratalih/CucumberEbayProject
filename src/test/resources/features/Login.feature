Feature: ebay login islemleri
  Background: Kullanici URL gider
    Given Kullanici url gider
    When Kullanici signin butonuna tiklar
  @Smoke
  @Regression
  Scenario: Kullanici login olur
    Given Kullanici "email" girer ve continue tusuna basar
    And Kullanici "password" girer ve continue tiklar
    Then Kullanici login oldugunu dogrular
  @Smoke
    @Regression
  Scenario Outline: : Kullanici login olamamalidir
    Given Kayitli olmayan "<emails>" ile giris yapamaz
    Then Kullanici login olmadigini dogrular
    Examples:
      |emails           |
      |negativeEmail1   |
      |negativeEmail2   |
      |negativeEmail3   |

