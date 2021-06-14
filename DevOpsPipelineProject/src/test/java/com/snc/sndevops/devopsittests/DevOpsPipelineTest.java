package com.snc.sndevops;
import org.junit.Assert;
import org.junit.Test; 

public class DevOpsPipeline_Test {

    String testExecutionStatus = "Success";

    @Test 
    public void testDevOpsPipeline1() { 
        Assert.assertEquals(testExecutionStatus,"Success");  
    }
}
 

