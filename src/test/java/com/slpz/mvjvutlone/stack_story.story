Scenario: I push an orange onto the stack
Given I have an empty stack
When  I push an item 'orange'
Then  I should count 1

Scenario: I push an apple
Given I have an empty stack
When  I push an item 'apple'
Then  I should count 1
