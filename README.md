# Projeto de testes com Integraçao com Jenkins e Allure Reports

#Apache Maven 3.6.3

Instalar maven no linux:

sudo apt install maven

#NPM 8.5.1

Instalar npm no linux

sudo apt-get install npm

#Allure 2.21.1

Instalar allure no linux:

Allure requires Java 8 or higher

npm install -g allure-commandline --save-dev


#Propriedades necessárias para configuração do projeto, inserir no properties.

 <aspectj.version>1.9.4</aspectj.version>

 
#Bibliotecas necessárias para a execução  do projeto

      <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-junit5</artifactId>
            <version>2.21.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.2</version>
        </dependency>


        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest</artifactId>
            <version>2.2</version>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <version>5.9.2</version>
        </dependency>


        <!-- Dependencias JUnit para criar suites de testes -->
        <dependency>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
            <version>5.9.2</version>
        </dependency>

        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-runner</artifactId>
            <version>1.9.2</version>
        </dependency>
				
#Para executar o projeto, no terminal digite: 
mvn clean test

#Para visualizar report, no terminal digite:

allure generate

Em seguida digite:

allure open
			
