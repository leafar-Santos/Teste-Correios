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
        stage('Obtendo Dados'){
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
    post{
        always{
            stage('Gerar Report') {
            steps {
                script {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
            ])
        }
    }
}
        }
    }

}