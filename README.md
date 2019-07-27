# EmailApiMicroservice
An Email micro service API that sends mails using Spring Boot, Docker and MySQL

##Setup
Import the project as a maven project to your IDE. 
You need to enter the details for username and password for sender of email in application.properties. 

Once done run the project by using the following command:

`docker-compose up --build`


##Endpoints for the API

1.Welcome 

`http://192.168.99.100:8080`

2.Sending the email 
`http://192.168.99.100:8080/sendmail`

Sample JSON message:
`
{
	"email_from": "justatestguyishere@gmail.com",
	"email_to": "justatestguyishere@gmail.com",
	"subject": "Another test email",
	"body":"This is just a another test email with db"
	
}
`
