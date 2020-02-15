Feature: Test Logic Invoice Scenario and point of sale application
    
      Scenario: Test Login with Valid Credential for Logic Invoice 
      Given Open Logic Invoice Application
      When I enter username "admin" and password "admin123" for Logic Invoice
      Then User should be login successfully in Logic Invoice
     
  
    
      Scenario: Test Login with Valid Credential for POS
      Given Open POS Application
      When I enter username "admin" and password "pointofsale" for POS
      Then User should be login successfully in POS
      And Browser Closed    