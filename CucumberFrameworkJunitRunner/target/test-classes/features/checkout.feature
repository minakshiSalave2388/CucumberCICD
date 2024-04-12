Feature: place the order with that product

@PlaceOrder
Scenario Outline: place the order with that product

Given User is on GreenCart Landing page
When user searched with shortname <vegName> and extracted actual name of product
And Added <quantity> items of the selected product to cart
Then User proceed to Checkout and validate <vegName> items in checkout page
And verify user has ability to enter promocode and place the order
Examples:
|vegName|quantity|
|Tomato|3|
|Carrot|2|

