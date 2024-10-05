pipelineJob('job-dsl-plugin') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/mmanu-prasad/gitty.git')
          }
          branch('*/main')
          scriptPath('Jenkinsfile')
        }
      }
     
    }
  }
}