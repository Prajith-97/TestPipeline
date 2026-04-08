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

                    echo "Source Branch: ${sourceBranch}"
                    echo "Target Branch: ${targetBranch}"

                    // Case 1: dev → qa
                    if (sourceBranch == "dev" && targetBranch == "qa") {
                        env.TRIGGER_SMOKE = "true"
                    }

                    // Case 2: qa → master
                    if (sourceBranch == "qa" && targetBranch == "master") {
                        env.TRIGGER_SMOKE = "true"
                        env.TRIGGER_REGRESSION = "true"
                    }
                }
            }
        }

        stage('Build & Deploy to QA') {
            steps {
                echo "Building application..."
                echo "Deploying to QA environment..."
                // add your real build + deploy commands
            }
        }

        stage('Trigger Smoke Tests') {
            when {
                expression { env.TRIGGER_SMOKE == "true" }
            }
            steps {
                echo "Triggering Smoke Tests..."

                build job: 'QA-Automation-Pipeline',
                parameters: [
                    string(name: 'TEST_TYPE', value: 'smoke')
                ],
                wait: false
            }
        }

        stage('Trigger Regression Tests') {
            when {
                expression { env.TRIGGER_REGRESSION == "true" }
            }
            steps {
                echo "Triggering Regression Tests..."

                build job: 'QA-Automation-Pipeline',
                parameters: [
                    string(name: 'TEST_TYPE', value: 'regression')
                ],
                wait: false
            }
        }
    }
}