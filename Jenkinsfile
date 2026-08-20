pipeline {

    agent any


    // ================================================================
    // GLOBAL CONFIGURATION
    // ================================================================

    environment {

        // ============================================================
        // EMAIL CONFIGURATION
        // Change this only in ONE place
        // ============================================================

        TEST_RESULT_EMAIL = 'your-email@company.com'


        // ============================================================
        // AUTOMATION JOB
        // ============================================================

        AUTOMATION_JOB = 'QA-Automation'


        // ============================================================
        // DEFAULT BROWSER
        // ============================================================

        DEFAULT_BROWSER = 'chrome'
    }


    stages {


        // ============================================================
        // 1. CHECKOUT
        // ============================================================

        stage('Checkout') {

            steps {

                echo "========================================"
                echo "📥 CHECKOUT"
                echo "========================================"

                checkout scm
            }
        }


        // ============================================================
        // 2. BUILD & DEPLOY
        // ============================================================

        stage('Build & Deploy') {

            steps {

                script {

                    echo "========================================"
                    echo "🏗️ BUILD & DEPLOY"
                    echo "========================================"

                    echo "Branch Name : ${env.BRANCH_NAME}"
                    echo "PR ID       : ${env.CHANGE_ID}"
                    echo "PR Source   : ${env.CHANGE_BRANCH}"
                    echo "PR Target   : ${env.CHANGE_TARGET}"

                    echo "Build / Deploy completed"
                }
            }
        }


        // ============================================================
        // 3. TRIGGER QA AUTOMATION
        // ============================================================

        stage('Trigger QA Automation') {

            steps {

                script {

                    echo "========================================"
                    echo "🧪 QA AUTOMATION"
                    echo "========================================"

                    echo "Branch      : ${env.BRANCH_NAME}"
                    echo "PR ID       : ${env.CHANGE_ID}"
                    echo "PR Source   : ${env.CHANGE_BRANCH}"
                    echo "PR Target   : ${env.CHANGE_TARGET}"

                    echo "Email       : ${env.TEST_RESULT_EMAIL}"
                    echo "Browser     : ${env.DEFAULT_BROWSER}"


                    // ==================================================
                    // PULL REQUEST EXECUTION
                    // ==================================================

                    if (env.CHANGE_ID) {

                        echo "========================================"
                        echo "🔀 PULL REQUEST DETECTED"
                        echo "========================================"

                        echo "PR ID     : ${env.CHANGE_ID}"
                        echo "Source    : ${env.CHANGE_BRANCH}"
                        echo "Target    : ${env.CHANGE_TARGET}"


                        // ==================================================
                        // PR → DEV
                        // ==================================================

                        if (env.CHANGE_TARGET == "dev") {

                            echo "========================================"
                            echo "🔥 PR → DEV → SMOKE"
                            echo "========================================"

                            build job: env.AUTOMATION_JOB,

                            parameters: [

                                string(
                                    name: 'ENV',
                                    value: 'dev'
                                ),

                                string(
                                    name: 'BROWSER',
                                    value: env.DEFAULT_BROWSER
                                ),

                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),

                                string(
                                    name: 'TAGS',
                                    value: '@smoke'
                                ),

                                string(
                                    name: 'EMAIL',
                                    value: env.TEST_RESULT_EMAIL
                                )
                            ],

                            wait: true

                            echo "✅ DEV PR Smoke tests completed"
                        }


                        // ==================================================
                        // PR → QA
                        // ==================================================

                        else if (env.CHANGE_TARGET == "qa") {

                            echo "========================================"
                            echo "🔥 PR → QA → SMOKE"
                            echo "========================================"

                            build job: env.AUTOMATION_JOB,

                            parameters: [

                                string(
                                    name: 'ENV',
                                    value: 'qa'
                                ),

                                string(
                                    name: 'BROWSER',
                                    value: env.DEFAULT_BROWSER
                                ),

                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),

                                string(
                                    name: 'TAGS',
                                    value: '@smoke'
                                ),

                                string(
                                    name: 'EMAIL',
                                    value: env.TEST_RESULT_EMAIL
                                )
                            ],

                            wait: true

                            echo "✅ QA PR Smoke tests completed"
                        }


                        // ==================================================
                        // PR → MASTER
                        // ==================================================

                        else if (env.CHANGE_TARGET == "master") {

                            echo "========================================"
                            echo "🔥 PR → MASTER → SMOKE"
                            echo "========================================"

                            build job: env.AUTOMATION_JOB,

                            parameters: [

                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                ),

                                string(
                                    name: 'BROWSER',
                                    value: env.DEFAULT_BROWSER
                                ),

                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),

                                string(
                                    name: 'TAGS',
                                    value: '@smoke'
                                ),

                                string(
                                    name: 'EMAIL',
                                    value: env.TEST_RESULT_EMAIL
                                )
                            ],

                            wait: true

                            echo "✅ MASTER PR Smoke tests completed"
                        }


                        // ==================================================
                        // UNKNOWN PR TARGET
                        // ==================================================

                        else {

                            echo "⚠️ No automation configured for PR target:"
                            echo "${env.CHANGE_TARGET}"
                        }
                    }


                    // ==================================================
                    // NORMAL BRANCH EXECUTION
                    // ==================================================

                    else {

                        echo "========================================"
                        echo "🌿 NORMAL BRANCH BUILD"
                        echo "========================================"

                        echo "Branch : ${env.BRANCH_NAME}"


                        // ==================================================
                        // DEV
                        // ==================================================

                        if (env.BRANCH_NAME == "dev") {

                            echo "👉 DEV branch detected"

                            echo "ℹ️ No automation after merge to DEV"
                        }


                        // ==================================================
                        // QA
                        // ==================================================

                        else if (env.BRANCH_NAME == "qa") {

                            echo "👉 QA branch detected"

                            echo "ℹ️ No automation after merge to QA"
                        }


                        // ==================================================
                        // MASTER
                        // ==================================================

                        else if (env.BRANCH_NAME == "master") {

                            echo "========================================"
                            echo "🚀 MASTER BRANCH"
                            echo "========================================"


                            // ==================================================
                            // MASTER → SMOKE
                            // ==================================================

                            echo "========================================"
                            echo "🔥 MASTER → SMOKE"
                            echo "========================================"

                            build job: env.AUTOMATION_JOB,

                            parameters: [

                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                ),

                                string(
                                    name: 'BROWSER',
                                    value: env.DEFAULT_BROWSER
                                ),

                                string(
                                    name: 'TEST_TYPE',
                                    value: 'smoke'
                                ),

                                string(
                                    name: 'TAGS',
                                    value: '@smoke'
                                ),

                                string(
                                    name: 'EMAIL',
                                    value: env.TEST_RESULT_EMAIL
                                )
                            ],

                            wait: true

                            echo "✅ MASTER Smoke tests completed"


                            // ==================================================
                            // MASTER → REGRESSION
                            // ==================================================

                            echo "========================================"
                            echo "🧪 MASTER → REGRESSION"
                            echo "========================================"

                            build job: env.AUTOMATION_JOB,

                            parameters: [

                                string(
                                    name: 'ENV',
                                    value: 'prod'
                                ),

                                string(
                                    name: 'BROWSER',
                                    value: env.DEFAULT_BROWSER
                                ),

                                string(
                                    name: 'TEST_TYPE',
                                    value: 'regression'
                                ),

                                string(
                                    name: 'TAGS',
                                    value: '@regression'
                                ),

                                string(
                                    name: 'EMAIL',
                                    value: env.TEST_RESULT_EMAIL
                                )
                            ],

                            wait: true

                            echo "✅ MASTER Regression tests completed"
                        }


                        // ==================================================
                        // OTHER BRANCH
                        // ==================================================

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

            echo "========================================"
            echo "🎉 ORCHESTRATOR SUCCESS"
            echo "========================================"
        }

        failure {

            echo "========================================"
            echo "❌ ORCHESTRATOR FAILED"
            echo "========================================"
        }

        always {

            echo "========================================"
            echo "📊 ORCHESTRATOR COMPLETED"
            echo "========================================"

            echo "Branch : ${env.BRANCH_NAME}"
            echo "PR ID  : ${env.CHANGE_ID ?: 'N/A'}"
        }
    }
}