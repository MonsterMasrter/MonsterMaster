package org.monstermaster.utils;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author horodysk
 */
public class AllUtilsTests {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllUtilsTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTestSuite(AccountManagerUtilsTest.class);
        // $JUnit-END$
        return suite;
    }

}
