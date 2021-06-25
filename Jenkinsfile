pipeline {
  agent any
  tools {
    maven "Maven"
  }
  stages {
      stage("build") {
          steps {
            echo 'build..'
            sleep 2
           snDevOpsArtifact(artifactsPayload:"""{"artifacts": [{"name": "devops_dev_artifact.jar","version": "1.${BUILD_NUMBER}","semanticVersion": "1.${BUILD_NUMBER}.0","repositoryName": "devops_dev_repo"}],"stageName": "build"}""")
              //sh 'mvn clean install'
            snDevOpsChange()
          }
      }
      stage("test") {
           steps {
             echo 'test.'
             snDevOpsArtifact(artifactsPayload:"""{"artifacts": [{"name": "devops_test_artifact.jar","version": "1.${BUILD_NUMBER}","semanticVersion": "1.${BUILD_NUMBER}.0","repositoryName": "devops_test_repo"}],"stageName": "test"}""")
             sleep 2
                sh 'mvn clean test -Dtest="devopsunittests.*" -Dpublish'
                junit '**/target/surefire-reports/*.xml'
           }
       }
      stage("deploy") {
          steps {
            echo 'Deploying..'            
          	snDevOpsPackage(name: "devops_demo_package.${BUILD_NUMBER}", artifactsPayload: """{"artifacts": [{"name": "devops_dev_artifact.jar","version": "1.${BUILD_NUMBER}","semanticVersion": "1.${BUILD_NUMBER}.0","repositoryName": "devops_dev_repo"},{"name": "devops_test_artifact.jar","version": "1.${BUILD_NUMBER}","semanticVersion": "1.${BUILD_NUMBER}.0","repositoryName": "devops_test_repo"}]}""")            
            sleep 5
           snDevOpsChange()
          }
      }
  }
}