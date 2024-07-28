pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }

        stage ('Executando testes Selenium') {
            steps {
                bat 'mvn clean install'

            }
            post {
                always {
                     allure([
                     includeProperties: false,
                     jdk: '',
                     properties: [],
                     reportBuildPolicy: 'ALWAYS',
                     results: [[path: 'allure-results']]
                     ])
                }
            }
        }
    }
}
