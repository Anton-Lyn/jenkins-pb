pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat 'gradlew.bat clean build'
            }
        }
    }
}
