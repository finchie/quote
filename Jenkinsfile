pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                sh 'mkdir bin'
                sh 'javac -d out -cp src src/uk/gov/snh/quote/Quote.java'
                sh 'cd bin'
                sh 'java uk/gov/snh/quote/Quote'
            }
        }
    }
}