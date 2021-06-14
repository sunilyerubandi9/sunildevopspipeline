package com.snc.sndevops.devopsittests;
import org.junit.Assert;
import org.junit.Test; 

public class DevOpsPipelineTest {

    String testExecutionStatus = "Success";

    @Test 
    public void testDevOpsPipeline1() { 
        Assert.assertEquals(testExecutionStatus,"Success");  
    }
}
 

