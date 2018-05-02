pipeline {
    agent any
    
    triggers {
        cron('*/2 * * * *')
    }
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
                sh 'java -version'
                sh 'mvn -B clean install'
            }
        }
        
    }
}
