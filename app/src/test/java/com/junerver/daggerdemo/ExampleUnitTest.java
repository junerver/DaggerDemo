package com.junerver.daggerdemo;

import org.junit.Test;

/**
 * To work on unit tests, switch the TestDagger Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void testDagger() throws Exception {
        System.out.println(new TestDagger().toString());
        System.out.println(new OtherTest().toString());
    }
}