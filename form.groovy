pipelineJob('Formy-Job') {
 parameters{
 activeChoiceParam('CHOICE-1') {
            description('Allows user choose from multiple choices')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["choice1", "choice2"]')
                fallbackScript('"fallback choice"')
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