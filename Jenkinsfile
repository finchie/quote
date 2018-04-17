pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                sh 'mkdir bin'
                sh '\'/c/Program Files (x86)/Java/jdk1.8.0_111/bin/javac\' -d out -cp src src/uk/gov/snh/quote/Quote.java'
                sh 'cd bin'
                sh 'java uk/gov/snh/quote/Quote'
            }
        }
    }
}