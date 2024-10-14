pipelineJob('job-dsl-plugin') {
    parameters {
        activeChoiceParam('BRANCH_NAME') {
            description('Choose the branch to build')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["main", "dev"]')
                fallbackScript('"main"')
            }
        }
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/mmanu-prasad/gitty.git')
                    }
                    branches('*/dev')
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}
