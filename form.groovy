pipelineJob('Formy-Job') {
 parameters{
 activeChoiceParam('CHOICE-1') {
            description('Allows user choose from multiple choices')
            filterable()
            choiceType('SINGLE_SELECT')
              groovyScript {
        
                        fallbackScript(String fallbackScript)
                        script(String script)
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
          branch('*/main')
        }
      }
      lightweight()
    }
  }
}