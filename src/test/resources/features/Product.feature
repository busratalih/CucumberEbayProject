Feature: Apple Samsung Xiaomi urunlerinin sepete eklenmesi
  Background: Kullanici URL gider
    Given Kullanici url gider
    When Kullanici signin butonuna tiklar
    Given Kullanici "email" girer ve continue tusuna basar
    And Kullanici "password" girer ve continue tiklar

    @Regression
    Scenario Outline: Adding different brands of phones to cart
      Given User types "<brand>" in the searchbox and searches
      And the user selects one hundred and twenty-eight gb from storage capacity in the left tabs
      And User selects color black from left tab
      And User sets the price range from ten dollars to two thousand dollars
      And User selects thousand miles from item location in radius section
      And User adds the first product to the watchlist and leaves
      Then User confirms that the product is on the watchlist
      Examples:
        | brand         |
        | apple phone   |
        | samsung phone |
        | xiaomi phone  |

