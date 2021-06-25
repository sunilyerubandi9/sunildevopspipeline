package com.snc.sndevops.devopsittests;
import org.junit.Assert;
import org.junit.Test; 

public class DevOpsPipelineTest2 {

    String testExecutionStatus = "Success";

    @Test 
    public void testDevOpsPipeline1() { 
        Assert.assertEquals(testExecutionStatus,"Success");  
    }
}