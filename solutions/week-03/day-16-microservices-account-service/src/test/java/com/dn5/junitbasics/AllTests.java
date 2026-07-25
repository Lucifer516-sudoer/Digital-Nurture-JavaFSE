package com.dn5.junitbasics;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        Calculator.class,
        EvenChecker.class,
        AssertionTest.class
})
public class AllTests {

}
