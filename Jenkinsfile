pipeline {
    agent any
    //  tools {
    //     maven "3.8.4"
    // }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Compile and Clean') { 
            steps {
                // Run Maven on a Unix agent.
              
                sh "mvn clean compile"
            }
    }
        // stage('Test') { 
        //     steps {
              // Run Maven on a Unix agent.
              
        //         sh "mvn test"
        //     }
  //  }
         stage('deploy') { 
            
            steps {
                sh "mvn package"
            }
        }
         stage('Build Docker image'){
          
            steps {
                echo "Welcome to Innovative_Interior mien abhi hoon"
                sh 'ls'
                sh 'docker build -t  abhishekabhi1596/Innovative_Interior-last:${BUILD_NUMBER} .'
            }
        }
         stage('Docker Login'){
            
            steps {
                    sh "docker login -u abhishekabhi1596 -p docker123"
                }
            }                
          stage('Docker Push'){
            steps {
                sh 'docker push abhishekabhi1596/Innovative_Interior-last:${BUILD_NUMBER}'
            }
        }
        stage('Docker deploy'){
            steps {
               
                sh 'docker run -itd -p  8281:80 abhishekabhi1596/Innovative_Interior-last:${BUILD_NUMBER}'
            }
        }
        stage('Archving') { 
            steps {
                 archiveArtifacts '**/target/*.jar'
            }
        }
    }
}


        

