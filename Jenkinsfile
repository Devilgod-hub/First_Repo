@Library("hello_lib") _
pipeline {
    agent {label "NK"}
    
    stages {
        stage("Hi"){
            steps{
                script{
                    hello()
                }
            }
        }
        stage("Clone") {
            steps{
                script{
                    clone("https://github.com/nischal-devz/First_Repo.git", "master")   
                }
            }
        }
        stage("Build") {
            steps {
                script{
                    build("automated", "latest", "nischal1200")
                }
            }
        }
        stage("Push to DockerHub") {
            steps{
                script{
                    docker_push("automated", "latest")
                }
            }
        }
        stage('Deploy') {
            steps{
                deploy("automated", "latest")
            }
        }
    }
}
