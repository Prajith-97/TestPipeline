pipeline {

    agent any

    stages {

        // ============================================================
        // 1. CHECKOUT
        // ============================================================
        stage('Checkout') {
            steps {
                echo "📥 Checking out code..."
                checkout scm
            }
        }


        // ============================================================
        // 2. BUILD & DEPLOY
        // ============================================================
        stage('Build & Deploy') {
            steps {
                script {

                    echo "🏗️ Building application..."

                    echo "Branch Name  : ${env.BRANCH_NAME}"
                    echo "PR ID        : ${env.CHANGE_ID}"
                    echo "PR Source    : ${env.CHANGE_BRANCH}"
                    echo "PR Target    : ${env.CHANGE_TARGET}"

                    echo "🚀 Deploying to ${env.BRANCH_NAME} environment..."
                }
            }
        }


        // ============================================================
        // 3. TRIGGER AUTOMATION
        // ============================================================
        stage('Trigger QA Automation') {

            steps {

                script {

                    echo "========================================"
                    echo "BRANCH NAME   : ${env.BRANCH_NAME}"
                    echo "PR ID         : ${env.CHANGE_ID}"
                    echo "PR SOURCE     : ${env.CHANGE_BRANCH}"
                    echo "PR TARGET     : ${env.CHANGE_TARGET}"
                    echo "========================================"


                    // ====================================================
                    // PULL REQUEST EXECUTION
                    // ====================================================

                    if (env.CHANGE_ID) {

                        echo "🔀 PULL REQUEST DETECTED"
                        echo "PR ID     : ${env.CHANGE_ID}"
                        echo "Source    : ${env.CHANGE_BRANCH}"
                        echo "Target    : ${env.CHANGE_TARGET}"


                        // ------------------------------------------------
                        // PR TARGET = DEV
                        // ------------------------------------------------

                        if (env.CHANGE_TARGET == "dev") {

                            echo "👉 Pull Request targeting DEV"
                            echo "🔥 Triggering SMOKE tests..."

                            build job: 'Multibranch Pipeline/master',
                            parameters: [
                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),
                                string(
                                    name: 'ENV',
                                    value: 'dev'
                                )
                            ],
                            wait: true

                            echo "✅ DEV PR Smoke tests completed"
                        }


                        // ------------------------------------------------
                        // PR TARGET = QA
                        // ------------------------------------------------

                        else if (env.CHANGE_TARGET == "qa") {

                            echo "👉 Pull Request targeting QA"
                            echo "🔥 Triggering SMOKE tests..."

                            build job: 'Multibranch Pipeline/master',
                            parameters: [
                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),
                                string(
                                    name: 'ENV',
                                    value: 'qa'
                                )
                            ],
                            wait: true

                            echo "✅ QA PR Smoke tests completed"
                        }


                        // ------------------------------------------------
                        // PR TARGET = MASTER
                        // ------------------------------------------------

                        else if (env.CHANGE_TARGET == "master") {

                            echo "👉 Pull Request targeting MASTER"
                            echo "🔥 Triggering SMOKE tests..."

                            build job: 'Multibranch Pipeline/master',
                            parameters: [
                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),
                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                )
                            ],
                            wait: true

                            echo "✅ MASTER PR Smoke tests completed"
                        }


                        else {

                            echo "⚠️ No automation configured for PR target:"
                            echo "${env.CHANGE_TARGET}"
                        }
                    }


                    // ====================================================
                    // NORMAL BRANCH EXECUTION
                    // ====================================================

                    else {

                        echo "🌿 NORMAL BRANCH BUILD DETECTED"


                        // ------------------------------------------------
                        // DEV BRANCH
                        // ------------------------------------------------

                        if (env.BRANCH_NAME == "dev") {

                            echo "👉 DEV branch detected"
                            echo "ℹ️ No automation configured after merge to DEV"
                        }


                        // ------------------------------------------------
                        // QA BRANCH
                        // ------------------------------------------------

                        else if (env.BRANCH_NAME == "qa") {

                            echo "👉 QA branch detected"

                            echo "ℹ️ No automation configured after merge to QA"

                            /*
                             * IMPORTANT:
                             *
                             * We intentionally DO NOT trigger automation
                             * here.
                             *
                             * Smoke testing happens during the PR validation
                             * using CHANGE_TARGET == "qa".
                             */
                        }


                        // ------------------------------------------------
                        // MASTER BRANCH
                        // ------------------------------------------------

                        else if (env.BRANCH_NAME == "master") {

                            echo "👉 MASTER branch detected"

                            // ============================================
                            // SMOKE
                            // ============================================

                            echo "🔥 Triggering SMOKE tests..."

                            build job: 'Multibranch Pipeline/master',
                            parameters: [
                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),
                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                )
                            ],
                            wait: true

                            echo "✅ Smoke tests completed"


                            // ============================================
                            // REGRESSION
                            // ============================================

                            echo "🧪 Triggering REGRESSION tests..."

                            build job: 'Multibranch Pipeline/master',
                            parameters: [
                                string(
                                    name: 'TEST_TYPE',
                                    value: 'regression'
                                ),
                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                )
                            ],
                            wait: true

                            echo "✅ Regression tests completed"
                        }


                        else {

                            echo "⚠️ No automation configured for branch:"
                            echo "${env.BRANCH_NAME}"
                        }
                    }
                }
            }
        }
    }


    // ================================================================
    // POST EXECUTION
    // ================================================================

    post {

        success {

            echo "🎉 PIPELINE SUCCESS"
        }

        failure {

            echo "❌ PIPELINE FAILED"
        }

        always {

            echo "📊 Pipeline execution completed"

            echo "Branch : ${env.BRANCH_NAME}"
            echo "PR ID  : ${env.CHANGE_ID}"
        }
    }
}