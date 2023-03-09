pipeline{
    agent any
    stages{
        stage('Inicio'){
            steps{
                sh 'echo inicio'
            }
        }
        stage('Testes Funcionais Sellenium'){
            steps{
                sh 'mvn clean test'
            }
        }
        stage('Criando Relatório'){
            steps{
                sh 'cp -r allure-report/history/ allure-results'
            }
        }

        stage('Fim'){
            steps{
                sleep(5)
                sh 'echo Fim'
            }
        }
    }
}