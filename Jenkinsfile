pipeline {
  agent any
  tools {
       maven 'Maven'
   }
  stages {
       stage('Build') {
           steps {
              snDevOpsStep()
              sh 'mvn -B -DskipTests clean compile'
              echo 'Deploying the change....'
                    snDevOpsChange()

           }
       }
 }
}