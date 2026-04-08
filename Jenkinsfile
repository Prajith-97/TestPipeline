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

        stage('Detect Merge Flow') {
            steps {
                script {
                    def sourceBranch = env.CHANGE_BRANCH ?: env.BRANCH_NAME
                    def targetBranch = env.CHANGE_TARGET ?: ""

                    echo "🔍 Source Branch: ${sourceBranch}"
                    echo "🎯 Target Branch: ${targetBranch}"

                    // Case 1: dev → qa
                    if (sourceBranch == "dev" && targetBranch == "qa") {
                        echo "✅ Detected dev → qa merge (Smoke required)"
                        env.TRIGGER_SMOKE = "true"
                    }

                    // Case 2: qa → master
                    if (sourceBranch == "qa" && targetBranch == "master") {
                        echo "✅ Detected qa → master merge (Smoke + Regression required)"
                        env.TRIGGER_SMOKE = "true"
                        env.TRIGGER_REGRESSION = "true"
                    }
                }
            }
        }

        stage('Build & Deploy to QA') {
            steps {
                echo "🏗️ Building application..."
                echo "🚀 Deploying to QA environment..."
                // Add actual build + deployment commands here
            }
        }

        stage('Trigger Smoke Tests') {
            when {
                expression { env.TRIGGER_SMOKE == "true" }
            }
            steps {
                script {
                    echo "🔥 Triggering Smoke Tests..."

                    build job: 'QA-Automation-Pipeline/master',
                          parameters: [
                              string(name: 'TEST_TYPE', value: 'smoke')
                          ],
                          wait: true   // 👈 IMPORTANT (visibility)
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

                    build job: 'QA-Automation-Pipeline/qa',
                          parameters: [
                              string(name: 'TEST_TYPE', value: 'regression')
                          ],
                          wait: true   // 👈 IMPORTANT
                }
            }
        }
    }

    post {
        success {
            echo "✅ Dev Pipeline completed successfully"
        }
        failure {
            echo "❌ Dev Pipeline failed (check triggered QA jobs)"
        }
    }
}