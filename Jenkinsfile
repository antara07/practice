node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/antara07/practice.git'
  }

  stage("Compilation") {
    sh "java -version"
    sh "./mvnw -version"
    sh "./mvnw clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "./mvnw test -Punit"
    }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}
