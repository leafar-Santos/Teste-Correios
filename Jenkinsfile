pipeline{
    agent any
    stages{
        stage('Inicio'){
            steps{
                sh 'echo inicio'
            }
        }
        stage('Meio'){
            steps{
                sh 'mvn clean install'
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