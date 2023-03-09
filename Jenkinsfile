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
        
        stage('Fim'){
            steps{
                sleep(5)
                sh 'echo Fim'
            }
        }
    }
    post{
        always{
                script {
                allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
            }
        }
    }
}