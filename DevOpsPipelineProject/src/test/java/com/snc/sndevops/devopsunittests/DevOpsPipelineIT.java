package com.snc.sndevops.devopsunittests;
import org.junit.Assert;
import org.junit.Test; 

public class DevOpsPipelineIT {

    String testExecutionStatus = "Success";

    @Test 
    public void testDevOpsPipeline1() { 
        Assert.assertEquals(testExecutionStatus,"Success");  
    }
}
 

