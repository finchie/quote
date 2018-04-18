pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                bat 'if not exist bin mkdir bin'
                bat 'javac -d bin -cp src src/uk/gov/snh/quote/Quote.java'
                bat 'java -cp bin uk.gov.snh.quote.Quote'
            }
        }
    }
}