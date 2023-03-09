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
}
        post{
            always{
                script {
                allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
            }
        }
    }
    
}