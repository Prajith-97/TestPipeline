pipeline {
    agent any

    environment {
        TRIGGER_SMOKE = "false"
        TRIGGER_REGRESSION = "false"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Detect Deployment Flow') {
            steps {
                script {
                    echo "🔍 BRANCH_NAME: ${env.BRANCH_NAME}"

                    if (env.BRANCH_NAME == "qa") {
                        echo "✅ Code deployed to QA → Trigger Smoke Tests"
                        env.TRIGGER_SMOKE = "true"
                    }

                    if (env.BRANCH_NAME == "master") {
                        echo "✅ Code deployed to PROD → Trigger Smoke + Regression"
                        env.TRIGGER_SMOKE = "true"
                        env.TRIGGER_REGRESSION = "true"
                    }

                    echo "TRIGGER_SMOKE: ${env.TRIGGER_SMOKE}"
                    echo "TRIGGER_REGRESSION: ${env.TRIGGER_REGRESSION}"
                }
            }
        }

        stage('Build & Deploy') {
            steps {
                echo "🏗️ Building application..."
                echo "🚀 Deploying to ${env.BRANCH_NAME} environment..."
            }
        }

        stage('Trigger Smoke Tests') {
            when {
                expression {
                    return env.TRIGGER_SMOKE?.trim() == "true"
                }
            }
            steps {
                echo "🔥 Triggering Smoke Tests..."

                build job: 'QA-Automation-Pipeline/qa',
                      parameters: [
                          string(name: 'TEST_TYPE', value: 'smoke')
                      ],
                      wait: true
            }
        }

        stage('Trigger Regression Tests') {
            when {
                expression {
                    return env.TRIGGER_REGRESSION?.trim() == "true"
                }
            }
            steps {
                echo "🧪 Triggering Regression Tests..."

                build job: 'QA-Automation-Pipeline/qa',
                      parameters: [
                          string(name: 'TEST_TYPE', value: 'regression')
                      ],
                      wait: true
            }
        }
    }

    post {
        success {
            echo "✅ Dev Pipeline completed successfully"
        }
        failure {
            echo "❌ Dev Pipeline failed"
        }
    }
}