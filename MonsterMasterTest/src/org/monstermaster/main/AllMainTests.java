package org.monstermaster.main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author horodysk
 */
public class AllMainTests extends TestCase {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllMainTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTestSuite(MainActivityTest.class);
        // $JUnit-END$
        return suite;
    }

}
