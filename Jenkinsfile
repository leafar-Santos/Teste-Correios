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
        
        stage('Gerando Relatório'){
            post{
            always{
                script {
                allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
            }
        }
    }
        }
     stage('Fim da execução'){
            steps{
                sh 'mvn clean test'
            }
        }

    }
    
}