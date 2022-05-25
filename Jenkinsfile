pipeline {
    agent any
    triggers {
            cron('H 0 * * ? * *')
        }
    stages {
        stage('Build') {
            steps {
                bat 'gradlew.bat clean build'
            }
        }
        stage('Test') {
         steps {
             input message : "Continue?"
                bat 'gradlew.bat test'
            }
        }
    }
}
