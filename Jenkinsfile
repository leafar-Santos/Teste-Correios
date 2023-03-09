pipeline{
    agent any
    stages{
        stage('Inicio'){
            steps{
                sh 'echo inicio'
            }
        }
        stage('Verifica Java_Home'){
            steps{
                sh '${JAVA_HOME}/usr/lib/jvm/default-java/bin'
            }
        }
        stage('Meio'){
            steps{
                sh mvn clean test
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