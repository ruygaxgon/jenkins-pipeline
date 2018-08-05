pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/ruygaxgon/jenkins-pipeline.git'
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
        	steps {
        		sh "./gradlew test"
        	}
    }
}