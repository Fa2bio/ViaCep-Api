<h1>ViaCep-Api</h1>

> Status: Finished ✔️

## Contents
  
* [What is it?](#what-is-it)
* [Requirements](#requirements)
* [Technologies Used](#technologies)
* [Installation](#installation)
* [Run Application](#run-application)

## <a name="what-is-it"></a>What is it?

- This api generates an address (in Brazil) from a zip code entere;
- The base url that this api consumes is https://viacep.com.br/ws/{cep}/json

## <a name="requirements"></a>Requirements

- Java 11+
- Spring Boot
- Lombok

## <a name="technologies"></a>Technologies Used

- Java
- Spring Boot (version 2.7.7)
- Spring Cloud
- Lombok
- Model Mapper

## <a name="installation"></a>Installation
- Clone the repository for your device;
- Import it as a MAVEN project.

## <a name="run-application"></a>Run Application
- After meeting the requirements and installation, run the main method in IsbnApplication.java at a spring boot app;
- Make a HTTP GET request at http://localhost:8080/cep/{cep};
- You'll get the ensuring Json return:
###
```xml
{
  "cep":"24020-125",
  "logradouro":"Rua Quinze de Novembro",
  "complemento":"",
  "bairro":"Centro",
  "localidade":"Niterói",
  "uf":"RJ"
}
```
