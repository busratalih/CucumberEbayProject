Feature: ebay Product Apple
  Background: Kullanici URL gider
    Given Kullanici url gider
    When Kullanici signin butonuna tiklar
    Given Kullanici "email" girer ve continue tusuna basar
    And Kullanici "password" girer ve continue tiklar

    @Regression
    Scenario: Apple List Product
      Given User comes to Electronics
      And the user clicks Apple in the pop-up window
      And the user clicks on the Apple phones and smartphones tab from the left tab
      And the user clicks on the iphone fourteen promax by swiping the upper part to the right
      And clicks one tb in the Filtering section
      And clicks purple as color
      When User verifies that the number in the result is the same as the number of output products
