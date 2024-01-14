# bankaccount
Application for bank account operation
java version : 11
Spring boot 2.6.6

# How to launch
Go to the bankAccount folder  
mvn clean install  
mvn spring-boot:run -pl controller

# URI to retrive userAccount INFO
http://localhost:8080/api/userAccountInfo?firstname=Galou&code=1234


# Api EndPoint user stories 1 and 2
http://localhost:8080/api/operation/do  
with the parameters:  
	firstname=Fred  
	code=1234  
	amount=1345  
	operationType=D  

"code" is the a code composed by 4 number  
"amount" is the amount of money that the user deposit or withdrawal  
"operationType" accept two type of parameter, "W" for withdrawal and "D" for deposit 
  
example:  
http://localhost:8080/api/operation?firstname=Gri&code=1234&amount=600&operationType=W   


# Api EndPoint user storie 3, get operation history
http://localhost:8080/api/history  
with the parameters:  
	firstname=Gri  
	code=1234  
  
example:  
http://localhost:8080/api/history?firstname=Gri&code=1234


# Api EndPoint to create new UserAccount  
http://localhost:8080/api/createAccount  
with the parameters:  
	lastname=RAJ  
	firstname=gru
	code=1234  

example:  
http://localhost:8080/api/createAccount?lastname=RAJ&firstname=tia&code=1234  


# Data in H2 in memory base
we have the users below that we can use  
lastname : Fried  
firstname : Pierre  
code : 1234  

lastname : Grind  
firstname : Galou  
code : 1234  
  
lastname : Bris  
firstname : Fred  
code : 1234  
  
lastname : Galou  
firstname : Gri  
code : 1234  
	
