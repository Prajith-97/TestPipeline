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

                    // ✅ When code is in QA branch → trigger smoke
                    if (env.BRANCH_NAME == "qa") {
                        echo "✅ Code deployed to QA → Trigger Smoke Tests"
                        env.TRIGGER_SMOKE = "true"
                    }

                    //✅ When code is in master → trigger full regression
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
                // Add actual build & deployment commands here
            }
        }

        stage('Trigger Smoke Tests') {
            when {
                expression { env.TRIGGER_SMOKE == "true" }
            }
            steps {
                script {
                    echo "🔥 Triggering Smoke Tests..."

                    build job: 'QA-Automation-Pipeline/qa',   // multibranch job
                          parameters: [
                              string(name: 'TEST_TYPE', value: 'smoke')
                          ],
                          wait: true
                }
            }
        }

        stage('Trigger Regression Tests') {
            when {
                expression { env.TRIGGER_REGRESSION == "true" }
            }
            steps {
                script {
                    echo "🧪 Triggering Regression Tests..."

                    build job: 'QA-Automation-Pipeline/qa',   // same QA branch
                          parameters: [
                              string(name: 'TEST_TYPE', value: 'regression')
                          ],
                          wait: true
                }
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