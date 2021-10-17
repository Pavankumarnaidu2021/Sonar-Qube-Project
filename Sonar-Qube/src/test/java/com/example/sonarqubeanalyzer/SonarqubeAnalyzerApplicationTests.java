package com.example.sonarqubeanalyzer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeAnalyzerApplicationTests {
    @Test
    void contextLoads() {
        ClassForTesting classForTesting = new ClassForTesting();
       int sum =  classForTesting.additionMethod(5,2);
        Assert.assertEquals(7, sum);
    }
}
