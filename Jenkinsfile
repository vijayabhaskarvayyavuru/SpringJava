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
                sh 'javac ./src/main/java/com/ocatnner/controller/Excution.java'
                sh 'java ./src/main/java/com/ocatnner/controller/Excution'
                
            }
        }
        stage('No-op') {
            steps {
                sh 'ls'
            }
        }
        stage('Build') {
            steps {
                echo 'Building'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
        
    }
    
     post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
        changed {
            echo 'Things were different before...'
        }
    }
}
