# Projeto de testes Web Selenium, Java 21, Junit 5, com Integraçao com git Actions e com Allure Reports.

<p>Veja como usar implementar os testes e o Allure nos passos após as imagens.</p>

<figure>
  <img src="src/img/allure_01.png"/>
</figure>

<figure>
  <img src="src/img/allure_02.png"/>
  <figcaption>Gráficos para análises</figcaption>
</figure>

<strong>Apache Maven 3.6.3</strong>
Instalar maven no linux:

sudo apt install maven

<strong>NPM 8.5.1</strong>

<strong>Instalar npm no linux</strong>

sudo apt-get install npm

<strong>Instalar allure no linux:</strong>

Allure 2.21.1

<strong>Allure requires Java 8 or higher</strong>

npm install -g allure-commandline --save-dev

<strong>Propriedades necessárias para configuração do projeto, inserir no properties.</strong>

<aspectj.version>1.9.4</aspectj.version>


<strong>Bibliotecas necessárias para a execução  do projeto</strong>

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

<strong>Para executar o projeto, no terminal digite:</strong>

mvn clean test

<strong>Para visualizar report, no terminal digite:</strong>

allure generate

<strong>Em seguida digite:</strong>

allure open
			
