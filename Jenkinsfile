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
            //sh 'chmod 777 gradlew'
            //sh './gradlew build'
            sh 'gradle clean -b build.gradle'
          }
        }


    }
}