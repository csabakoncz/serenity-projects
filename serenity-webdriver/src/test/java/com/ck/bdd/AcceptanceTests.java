package com.ck.bdd;

import org.jbehave.core.parsers.gherkin.GherkinStoryParser;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTests extends SerenityStories {

    public AcceptanceTests() {
        findStoriesIn("stories");
        findStoriesCalled("*.feature");

        configuration().useStoryParser(new GherkinStoryParser());
    }
}
