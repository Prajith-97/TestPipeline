pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "📥 Checking out code..."
                checkout scm
            }
        }

        stage('Build & Deploy') {
            steps {
                script {
                    echo "🏗️ Building application..."
                    echo "🚀 Deploying to ${env.BRANCH_NAME} environment..."
                }
            }
        }

        stage('Trigger QA Automation') {
            steps {
                script {

                    echo "========================================"
                    echo "🔍 BRANCH DETECTED: ${env.BRANCH_NAME}"
                    echo "========================================"

                    // DEV Branch
                    if (env.BRANCH_NAME == "dev") {

                        echo "👉 DEV branch detected"
                        echo "⚠️ Skipping automation tests"

                    }

                    // QA Branch
                    else if (env.BRANCH_NAME == "qa") {

                        echo "👉 QA branch detected"
                        echo "🔥 Triggering SMOKE tests..."

                        build job: 'Multibranch Pipeline/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'smoke'),
                                  string(name: 'ENV', value: 'qa')
                              ],
                              wait: true

                        echo "✅ Smoke tests completed"
                    }

                    // MASTER Branch
                    else if (env.BRANCH_NAME == "master") {

                        echo "👉 MASTER branch detected"

                        echo "🔥 Triggering SMOKE tests..."

                        build job: 'Multibranch Pipeline/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'smoke'),
                                  string(name: 'ENV', value: 'prod')
                              ],
                              wait: true

                        echo "✅ Smoke tests completed"

                        echo "🧪 Triggering REGRESSION tests..."

                        build job: 'Multibranch Pipeline/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'regression'),
                                  string(name: 'ENV', value: 'prod')
                              ],
                              wait: true

                        echo "✅ Regression tests completed"
                    }

                    else {
                        echo "⚠️ No automation configured for branch: ${env.BRANCH_NAME}"
                    }
                }
            }
        }
    }

    post {

        success {
            echo "🎉 PIPELINE SUCCESS"
        }

        failure {
            echo "❌ PIPELINE FAILED"
        }

        always {
            echo "📊 Pipeline execution completed for branch: ${env.BRANCH_NAME}"
        }
    }
}