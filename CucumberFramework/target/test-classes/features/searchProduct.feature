Feature: Search product and place the order with that product

@OffersPage
Scenario Outline: Search experience for product both in Home page and Offers page

Given User is on GreenCart Landing page
When user searched with shortname <vegName> and extracted actual name of product
Then user searched for <vegName> in offers page
And product name matches with the landing page and offer page

Examples:
|vegName|
|Tom|
|Beet|

