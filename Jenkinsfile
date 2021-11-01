def artifactname = "sunildevopspipeline-0.0.1-SNAPSHOT.jar"
def repoName = "sunildevopspipeline"
def pipelineName = "SunilDevOps-Multibranch-Project"
def semanticVersion = "${env.BUILD_NUMBER}.0.0"
def packageName = "sunildevopspipeline-package_${env.BUILD_NUMBER}"
def version = "${env.BUILD_NUMBER}.0"
def pkgName = "sunildevopspipeline-package"

pipeline {
  agent any
  tools {
       maven 'Maven'
   }
  stages {
       stage('Build') {
           steps {
              
              sh 'mvn -B -DskipTests clean compile'

           }
       }
       stage('Test') {
           steps {
              
              sh 'mvn test'
           }
           post {
             always {
                junit "**/target/surefire-reports/*.xml"
             }
           }
       }
      stage('Deploy') {
                 steps {
                    
                    echo 'Deploying the change....'
                  //  snDevOpsChange()
                    
                  //  snDevOpsArtifact(artifactsPayload: """{"artifacts": [{"name": "${artifactname}", "version": "1.${env.BUILD_NUMBER}","semanticVersion": "1.${env.BUILD_NUMBER}.0","repositoryName": "${repoName}"}],"branchName":"master"}""")
              //  snDevOpsPackage(name: "${pkgName}-${env.BUILD_NUMBER}", artifactsPayload: """{"artifacts":[{"name": "${artifactname}", "version": "1.${env.BUILD_NUMBER}", "repositoryName": "${repoName}"}], "branchName":"master"}""")
                    
                    
                 }
      }


 }
 
}
