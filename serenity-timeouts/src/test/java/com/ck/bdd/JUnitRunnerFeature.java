package com.ck.bdd;

import net.serenitybdd.jbehave.SerenityJBehaveSystemProperties;
import net.serenitybdd.jbehave.SerenityStories;

public class JUnitRunnerFeature extends SerenityStories {

    public JUnitRunnerFeature() {
        findStoriesIn( "stories" );
        findStoriesCalled( "*.feature" );
        configureTimeouts();
        int threads = Integer.parseInt( System.getProperty( "jbehave.threads", "1" ) );
        configuredEmbedder().embedderControls().useThreads( threads );
    }

    private void configureTimeouts() {
        String timeouts = configuredEmbedder().embedderControls().storyTimeouts();
        timeouts += ",stories/time10.feature:10";
        timeouts += ",stories/time20.feature:20";

        String timeoutsProp = SerenityJBehaveSystemProperties.STORY_TIMEOUT.getName();
        getEnvironmentVariables().setProperty( timeoutsProp, timeouts );
    }

}
