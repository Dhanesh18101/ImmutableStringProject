pipeline {
agent any


stages {

    stage('Checkout') {
        steps {
            git branch: 'master',
                url: 'https://github.com/Dhanesh18101/ImmutableStringProject.git'
        }
    }

    stage('Compile') {
        steps {
            sh 'mvn compile'
        }
    }

    stage('Package') {
        steps {
            sh 'mvn package'
        }
    }

    stage('Run Application') {
        steps {
            sh 'java -cp target/classes com.example.App'
        }
    }
}

post {
    success {
        echo 'Build Successful'
    }

    failure {
        echo 'Build Failed'
    }
}


}

