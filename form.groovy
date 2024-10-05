pipelineJob('Formy-Job') {

    listView('project-A') {
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}


  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/mmanu-prasad/gitty.git')
          }
          branch('*/main')
        }
      }
      lightweight()
    }
  }
}