pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                bat 'mkdir bin'
                bat 'javac -d bin -cp src src/uk/gov/snh/quote/Quote.java'
                bat 'cd bin'
                bat 'java uk/gov/snh/quote/Quote'
            }
        }
    }
}