package org.monstermaster.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.monstermaster.main.AllMainTests;
import org.monstermaster.splashscreen.AllSplashscreenTests;

/**
 * @author horodysk
 */
public class AllTests extends TestCase {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTest(AllMainTests.suite());
        suite.addTest(AllSplashscreenTests.suite());
        // $JUnit-END$
        return suite;
    }

}
