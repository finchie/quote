pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                bat 'if not exist bin mkdir bin'
                bat 'javac -d bin -cp src/main src/main/uk/gov/snh/quote/Quote.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java -cp bin uk.gov.snh.quote.Quote'
            }

        }

    }
}