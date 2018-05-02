pipeline {
    agent any
    tools {
        maven 'apache-maven-3.0.1' 
    }
    triggers {
        cron('0 0/15 * 1/1 * ? *')
    }
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
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
