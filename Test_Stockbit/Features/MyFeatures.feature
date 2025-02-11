Feature: test for stockbit (https://stockbit.com/)

		@register
			Scenario: Test Login with valid username and password
					Given Open chrome and start application
					When User click sign up
					Then User click button register with email
					Then User fill the form 
					Then User click register button
					Then User create the account successfully
		
		@login1
			Scenario: Test Login with valid username and password
					Given open chrome and start application
					When User enter valid username and valid password
					Then User can login succesfully
		
		@login2
			Scenario: Test Login with valid username and invalid password
					Given open chrome and start application
					When User enter valid username and invalid password
					Then User cannot login succesfully

		@login3
			Scenario: Test Login with invalid username and valid password
					Given open chrome and start application
					When User enter invalid username and valid password
					Then User cannot login succesfully
					
		@login4
			Scenario: Test Login with invalid username and password
					Given open chrome and start application
					When User enter invalid username and invalid password
					Then User cannot login succesfully
		
		@changepassword
			Scenario: Test change password success
					Given open chrome and start application
					When User enter valid username and valid password
					Then User can login succesfully
					Then User click profile tab
					Then User click Edit Profile button
					Then User click password tabs
					Then User input current password
					Then User click submit button
					Then User input new password and confirm new password
					Then User change password succesfully
					
		@search
			Scenario: Test search
					Given open chrome and start application
					When User enter valid username and valid password
					Then User can login succesfully
					Then User input words to search
		
		@forgotpassword1
			Scenario: Test Forgot password
					Given open chrome and start application
					When User click forgot password
					Then User input registered email
					Then User will receive forgot password email
		
		@forgotpassword2
			Scenario: Test Forgot password and input unregistered email
					Given open chrome and start application
					When User click forgot password
					Then User input registered email
					Then User will not receive forgot password email
		
					
					
					
					
				

