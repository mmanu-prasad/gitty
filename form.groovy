job('example-job-with-params') {
    parameters {
        activeChoiceParam('PARAM1') {
            description('First parameter')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Option 1", "Option 2", "Option 3"]')
                fallbackScript('["Option 1"]')
            }
        }
        activeChoiceParam('PARAM2') {
            description('Second parameter')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Option A", "Option B", "Option C"]')
                fallbackScript('["Option A"]')
            }
        }
        activeChoiceParam('PARAM3') {
            description('Third parameter')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Choice X", "Choice Y", "Choice Z"]')
                fallbackScript('["Choice X"]')
            }
        }
    }
    steps {
        shell('''
            echo "PARAM1: ${PARAM1}"
            echo "PARAM2: ${PARAM2}"
            echo "PARAM3: ${PARAM3}"
        ''')
    }
}
