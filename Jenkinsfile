pipeline {
    agent any
    stages {
        stage('Git Progress') {
          steps {
            git credentialsId: 'jenkinsgit',
            url: 'https://github.com/joongsa/new-customer-server'
          }
        }


        stage('Gradle Build') {
          steps {
            sh 'gradle clean build -x test -b build-server.gradle'
          }
        }


    }
}