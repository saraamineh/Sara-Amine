Feature: Search functionality
@Smoke
Scenario Outline: User could search using product name
Given user is at home page
When user searches using product name "<productName>"
Then page moves to search page
And  Search shows relevant results
  Examples:
    | productName |
    |   camera    |

 Scenario Outline: User could search for product using sku
 Given user is at home page
 When user searches using product sku "<sku>"
 Then page moves to search page
 And  User clicks on the product in search result
 Then Sku shown in this page contains the sku that you are using in search

   Examples:
     | sku       |
     | M8_HTC_5L |