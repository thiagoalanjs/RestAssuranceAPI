![image](https://github.com/user-attachments/assets/8f41c291-ff3c-4f74-9d02-a21c0fc571f2)


# Automação Selenium Webdriver - Java

Esse projeto é um exemplo de teste automatizado com RestAssurance, Java, Junit5 e Cucumber rodando com maven.

API para os testes - https://fakestoreapi.com

## Instalação & Configuração


Java - https://www.oracle.com/br/java/technologies/downloads/

Maven - https://maven.apache.org/install.html

Junit5 - https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api

IDE - Intellij - https://www.jetbrains.com/help/idea/installation-guide.html

RestAssurance - https://rest-assured.io/

## Instalação das dependências no pom.xml
```bash
 <dependencies>
        <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.5.0</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.19.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.11.1</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.18.0</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.19.0</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.maven/maven-core -->
        <dependency>
            <groupId>org.apache.maven</groupId>
            <artifactId>maven-core</artifactId>
            <version>4.0.0-beta-4</version>
        </dependency>

    </dependencies>
```

## Comando mvn

```bash
"mvn clean install" - Instalação das dependências
"mvn test" -  Roda todos os testes que estão no pacote Tests
```
