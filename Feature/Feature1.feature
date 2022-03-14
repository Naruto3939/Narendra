Feature: Launch functionality of  my Application12

Scenario Outline: User should land on login page sucessfully12

Given open the chrome 

When enter username and password "<Username>" and "<Password>"

Then    it should land on the login page 

Examples: 
|Username|Password|
|Narendra|Powar|
|Suyash|Powar|




