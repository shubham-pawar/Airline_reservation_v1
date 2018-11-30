# Airline_Reservation_v1


                                                   Topic – Airline Reservation
                                                      Domain - Transportation

# Problem Statement 

Today’s most of the airline website are lagging in some areas like some are not providing proper UI which could be user friendly while some are slow in processing pages or are not dynamic. Software must be developed for automating the online reservation system of airline. 

The system should be standalone in nature. It should be designed to provide functionalities like booking of tickets in which a user should be able to apply for tickets of any flight and of any class. A limitation is imposed when the number of tickets for which user apply is greater than available seats or no seats are available. If seats are not available, then put user transaction in the waiting queue. If the tickets are available, then it is issued to the user and it must be updated in the database concurrently. The system generates the receipt for the same. The software takes the current system date and time as the date of issue and calculates the amount to be paid by the user. It also provides the functionality of cancellation of tickets. If the user wants to cancel the tickets, user must enter the details. The system checks the records from the database if it is matched with the user entered details, then it cancels the tickets. The system also calculates the amount to be return to the user after deductions. The system must update the database for the same. The system displays the details of flight of which user enter the name. The information is saved, and the corresponding updating take place in the database. In the enquiry, the system should be able to provide information like the availability of tickets of flight, flight schedule. The corresponding print outs for each entry (issue/cancel) in the system should be generated. The admin can login into system and Add or Delete a particular flight.


# Mandatory Modules:
-	Flight Search - This module will take details from user such as departure airport, destination airport, travelling date span, type of ticket (one way/return), return date (for return ticket), no of passengers. This detail will be compared with the flights database and return the user details of the available flights.

-	Flight select- Here user will select the flight, class type, seat and from the list of available flight provided

-	Registration: Provide registration for individual users to create account for booking tickets. 

-	Login: Inputs username and password to provide access to user to navigate through options for booking, cancellation and payment option.

-	Payment – take payment details from user and check balance and deduct amount.

-	Cancellation- cancel booking by user if needed.

#	Admin Module: 
1.	Admin Login 
2.	Add Flight
3.	Delete Flight
4.	Display Flights

#	User: 
1.	User Login 
2.	USer Register 
3.	Search Flight
4.	Select Flight
5.	Select Seat
6.	Cancellation 
7.	Payment
8.  Forgot Password

----
# Technologies and Tools used:
- Java v1.8 (jre1.8.0_161)
- Spring Framework (5.1.2 RELEASE)
- Maven-archetype-webapp v1.0 
- Eclipse JEE Oxygen
- Apache Tomcat v8.0
- Oracle Database 10g Express Edition
- Windows 10 (64-bit OS and RAM 8GB)






