# Offer_Listing_Creation_API

Requirements:  
Tomcat ^8.5  
Postman(or alternative)  
Note* Postman is required for requests such as POST and DELETE as browsers are not equipped to handle these types of requests.  

Once Tomcat runtime environment is set up and running, execute Postman to run the API requests.  

There are three available http requests:  

#GET  
http://localhost:8080/Offers/rest/view  
This request will return all available Offers that have been created on the current session.  


#POST  
http://localhost:8080/Offers/rest/create/Name/Description/Currency/Price/Minutes_Available  
This request will allow the user to create a post, to their preference.  

Example  
http://localhost:8080/Offers/rest/create/table/sturdy/USD/1.99/0.01  

Note* To set the time, the input must be in the form of a double with decimals before the point representing hours(24 hr) and decimals after the point representing minutes. Expiration status of the offer will be set to true on creation by default but will set to false after specified time has passed.  

#DELETE  
http://localhost:8080/Offers/rest/delete/0  
This request will allow the user to delete an offer from memory. An input value is required to choose the offer to delete. The index starts from 0, with new offers(elements) being inserted after the previous.


