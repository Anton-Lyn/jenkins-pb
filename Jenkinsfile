pipeline {
    agent any
    triggers {
            cron('H/1 * * * *')
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
