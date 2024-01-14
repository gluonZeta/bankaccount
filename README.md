# bankaccount
Application for bank account operation

# How to launch
mvn clean install  
mvn spring-boot:run -pl controller

# URI to retrive userAccount INFO
http://localhost:8080/api/userAccountInfo?firstname=Galou&code=1234


# Api EndPoint
for user storie 1 and 2, we create the api  
http://localhost:8080/api/operation/do  
with the parameters:  
	firstname=Fred  
	code=1234  
	amount=1345  
	operation=D  

"code" is the a code composed by 4 number  
"amount" is the amount of money that the user deposit or withdrawal  
"operation" accept two type of parameter, "W" for withdrawal and "D" for deposit  



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
	
