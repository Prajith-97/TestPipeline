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
                echo "🏗️ Building application..."
                echo "🚀 Deploying to ${env.BRANCH_NAME} environment..."
            }
        }

        stage('Trigger QA Automation') {
            steps {
                script {

                    echo "========================================"
                    echo "🔍 BRANCH DETECTED: ${env.BRANCH_NAME}"
                    echo "========================================"

                    // ✅ QA Branch → Only Smoke
                    if (env.BRANCH_NAME == "qa") {

                        echo "👉 QA branch detected"
                        echo "🔥 Triggering SMOKE tests only..."

                        build job: 'Framework CI/CD/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'smoke')
                              ],
                              wait: true

                        echo "✅ Smoke tests completed"
                    }

                    // ✅ MASTER Branch → Smoke + Regression
                    else if (env.BRANCH_NAME == "master") {

                        echo "👉 MASTER branch detected"
                        echo "🔥 Triggering SMOKE tests..."

                        build job: 'Framework CI/CD/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'smoke')
                              ],
                              wait: true

                        echo "✅ Smoke tests completed"

                        echo "🧪 Triggering REGRESSION tests..."

                        build job: 'Framework CI/CD/master',
                              parameters: [
                                  string(name: 'TEST_TYPE', value: 'regression')
                              ],
                              wait: true

                        echo "✅ Regression tests completed"
                    }

                    // ✅ Other branches → No tests
                    else {
                        echo "⚠️ No QA tests configured for branch: ${env.BRANCH_NAME}"
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