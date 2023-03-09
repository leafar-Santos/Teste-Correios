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
                step{
                    sh mvn clean test
                }
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