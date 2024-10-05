job('demo') {
    steps {
        shell('echo Hello World!')
    }
}

pipelineJob('github-demo') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('https://github.com/mmanu-prasad/gitty.git')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}