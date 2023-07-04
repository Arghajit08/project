# eHospital Lab Report Validating API
The Lab Report Validating API is a web service that allows you to validate data from lab report by checking it in existing patient's database and to show error messages as response output.If patients data is showing high,low or normal result,the API will also reflect respective response. 

## Create Database
To create Postgres database in CLI, follow these steps:

1.Start Postgresql Service:

   `psql `

2.Create Database:

   `CREATE DATABASE test `

## Build and Run
To build and run the Lab Report Validating API, follow these steps:

1. Clone the repository from GitHub:
   
   `git clone `
   
2. Navigate to the project directory:
   
   `cd project`
   
3. Build the project using Maven:
   
   `mvn clean package`
   
4. Run the application:
   
   `java -jar target/project-0.0.1-SNAPSHOT.jar`
   
## INSERT DATA INTO TABLE
To create Postgres database in CLI, follow these steps:

1.Insert Data:

   `INSERT INTO test(id,name,agefrom,ageto,gender,minresult,maxresult,unit) VALUES (1,'hemoglobin',13,50,'M',12,16,'g/dl'); `

2.Follow above step to insert more data by changing respective values.

The API will be accessible at `http://localhost:8080`.

## Description
### Validating Report Data
**Endpoint:** `/task/reportvalidity`

**Method:** POST

**Description:** Checks Report Data and validate it using existing database and return respective Response message.

**Request Parameters:**

| Parameter   |      Type      |           Description          |
|-------------|:--------------:|-------------------------------:|
|  test_id    |     integer    |      Particular test id number |
|  result     |     float      |      Particular Test Result    |
|  unit       |     string     |      Particular Test Unit      |
|  gender     |     string     |      Particular Test Gender    |
|  age        |     integer    |      Particular Test Age       |

<center>
<img src="" alt="thunderclient-header">
</center>


**Success Response:**

1. Result Exceeding Upper Limit
- *Status Code:* 200 OK
- *Body:* `High->(test_name)`

2. Result Below Lower Limit
- *Status Code:* 200 OK
- *Body:* `Low->(test_name)`

3.1. Result In Range
- *Status Code:* 200 OK
- *Body:* `Normal->(test_name)`



**Failure Response:**

1. Patient Age Not In Range
- *Status Code:* 400 Bad Request
- *Body:* `Age Not In Range`

2. Particular Test_ID Doesnot Exist
- *Status Code:* 400 Bad Request
- *Body:* `Invalid Report`




## Libraries and Tools Used

The following libraries and tools are used in this API:
- Language : <img src="./assets/images/icons8-java-48.png" height=25> Java (JDK 20) 
- Framework: <img src="./assets/images/icons8-spring-boot-48.png" height=25> SpringBoot (3.1.2 Snapshot) 

## Dependencies
Maven Dependencies used:
- spring-boot-starter-data-jpa:
- spring-boot-starter-jdbc:
- Postgresql Driver: 
- spring-boot-starter-web: Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container


## License
This API is open source and licensed under the MIT License.


## Contributions
Contributions to this project are welcome. If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request on the project's repository or mail me at arghajitbhowmik08@gmail.com
