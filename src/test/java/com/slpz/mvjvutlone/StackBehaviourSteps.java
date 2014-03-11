package com.slpz.mvjvutlone;

import java.util.Stack;
import junit.framework.Assert;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StackBehaviourSteps {
	
	private Stack<String> stack;

	public StackBehaviourSteps() {
		stack = new Stack<String>();
	}
	
    @Given("I have an empty stack")
    public void givenIHaveAnEmptyStack() { 
    	stack = new Stack<String>(); 
    }

    @When("I push an item $item")
    public void whenIPushAnItem(@Named("item") String item) { 
    	stack.push(item); 
    }

    @Then("I should count $expected")
    public void thenIShouldCount(@Named("expected") int expected) {
        int actual = stack.size();
        Assert.assertEquals(stack.size(), expected);
//        if (actual != expected) 
//            throw new RuntimeException("expected:"+expected+";actual:"+actual);
    }
}
