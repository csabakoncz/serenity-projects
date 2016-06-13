##Sample project evaluating JBehave multithreaded behavior

###Running:
```
mvn test -Dthreadcount=<someNumber|default=1>
```

###Sample output for `mvn test`:

```
Running p1.StepMonitoringTest                                      
THREAD COUNT = 1                                                   
Processing system properties {}                                    
Using controls EmbedderControls[batch=false,skip=false,generateView...
beforeStory: BeforeStories                                         
afterStory                                                         
                                                                   
Running story p1/step_monitoring_test.story                        
beforeStory: step_monitoring_test.story                            
beforeStep: Given a successful step                                
IN: givenASuccessfulStep                                           
successful: Given a successful step                                
beforeStep: Then following step should be performed                
IN: followingStepShouldBePerformed                                 
successful: Then following step should be performed                
beforeStep: Given a failing step                                   
IN: givenAFailingStep                                              
failed: Given a failing step                                       
notPerformed: Then following step should not be performed          
afterStory                                                         
                                                                   
beforeStory: AfterStories                                          
afterStory                                                         
                                                                   
Generating reports view to 'c:\work\git\serenity-projects\jbehave-m
```

###Output from `mvn test -Dthreadcount=2`:
```
Running p1.StepMonitoringTest                                 
THREAD COUNT = 2                                              
Processing system properties {}                               
Using controls EmbedderControls[batch=false,skip=false,generat
beforeStory: BeforeStories                                    
Running story p1/step_monitoring_test.story                   
IN: givenASuccessfulStep                                      
IN: followingStepShouldBePerformed                            
IN: givenAFailingStep                                         
beforeStory: step_monitoring_test.story                       
beforeStep: Given a successful step                           
successful: Given a successful step                           
beforeStep: Then following step should be performed           
successful: Then following step should be performed           
beforeStep: Given a failing step                              
failed: Given a failing step                                  
notPerformed: Then following step should not be performed     
afterStory                                                    
                                                              
beforeStory: AfterStories                                     
Generating reports view to 'c:\work\git\serenity-projects\jbeh...
```

Observations:
1. With two threads there is no `afterStory` notification for `AfterStories`. This leads to Serenity reports not being generated (https://github.com/serenity-bdd/serenity-jbehave/issues/89)
1. In multithreaded mode, `beforeStory` is issued after the story is actually performed.