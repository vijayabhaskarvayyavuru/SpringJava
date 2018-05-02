pipeline {
    agent any
    
    triggers {
        cron('*/15 * * * *')
    }
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
                sh 'java -version'
                sh 'mvn -B clean verify'
            }
            
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
            }
        }
        
    }
}
