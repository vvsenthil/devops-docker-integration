pipeline {
    agent any
    tools{
        maven '3.8.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vvsenthil/devops-docker-integration']]])
                bat 'mvn clean install'
            }
            
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t vvsenthil/devops-docker-integration .'
                }
            }
        }
        stage('Push Image to Docker Hub'){
            steps{
                script{
                   //withCredentials([string(credentialsId: 'my-secret', variable: 'SECRET')]) {
                   //withCredentials([string(credentialsId: 'dockerhub-password', variable: 'dockerhub-password')]) {
                   withCredentials([string(credentialsId: 'dockerhub-secret', variable: 'SECRET')]) {
                    bat 'docker login -u vvsenthil -p July@2021'
                    bat 'docker push vvsenthil/devops-docker-integration'
                    }
                    
                }
            }
        }
    }
}