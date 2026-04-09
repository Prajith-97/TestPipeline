pipeline {
    agent any

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

                    // ✅ Use normal variables (NOT env)
                    smokeTrigger = false
                    regressionTrigger = false

                    if (env.BRANCH_NAME == "qa") {
                        echo "✅ Code deployed to QA → Trigger Smoke Tests"
                        smokeTrigger = true
                    }

                    if (env.BRANCH_NAME == "master") {
                        echo "✅ Code deployed to PROD → Trigger Smoke + Regression"
                        smokeTrigger = true
                        regressionTrigger = true
                    }

                    // ✅ Store in current build context
                    currentBuild.description = "SMOKE=${smokeTrigger}, REG=${regressionTrigger}"

                    // ✅ Save globally using Groovy binding
                    binding.setVariable("SMOKE_TRIGGER", smokeTrigger)
                    binding.setVariable("REG_TRIGGER", regressionTrigger)

                    echo "SMOKE_TRIGGER: ${SMOKE_TRIGGER}"
                    echo "REG_TRIGGER: ${REG_TRIGGER}"
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
                expression { return SMOKE_TRIGGER == true }
            }
            steps {
                script {
                    echo "🔥 Triggering Smoke Tests..."

                    build job: 'QA-Automation-Pipeline/qa',
                          parameters: [
                              string(name: 'TEST_TYPE', value: 'smoke')
                          ],
                          wait: true
                }
            }
        }

        stage('Trigger Regression Tests') {
            when {
                expression { return REG_TRIGGER == true }
            }
            steps {
                script {
                    echo "🧪 Triggering Regression Tests..."

                    build job: 'QA-Automation-Pipeline/qa',
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