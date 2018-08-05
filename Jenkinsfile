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
        stage("Package") {
        	steps {
        		sh "./gradlew build"
        	}
        }
        // Using docker
        //stage("Docker build") {
        	//steps {
        		//sh "docker build -t testpipeline ."
        	//}
        //}
        // push to registry
        //stage("Docker push") {
        	//steps {
        		//sh "docker push testpipeline"
        	//}
        //}
        //stage("Deploy container") {
        	//steps {
        		//sh "docker run -d --rm -p 8090:8090 --name testpipeline testpipeline"
        	//}
        //}
        stage("Aceptance test") {
        	steps {
        		sleep 30
        		sh "./tests.sh"
        	}
        }
        //post {
        //	always {
        	//	sh "docker stop testpipeline"
        	//}
        //}
        stage("Deploy container") {
        	steps {
        		sh "docker-compose up -d"
        	}
        }
        post {
        	always {
        		sh "docker-compose down"
        	}
        }
    }
}