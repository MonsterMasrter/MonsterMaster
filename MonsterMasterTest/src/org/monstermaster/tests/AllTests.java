package org.monstermaster.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.monstermaster.main.AllMainTests;
import org.monstermaster.splashscreen.AllSplashscreenTests;
import org.monstermaster.utils.AllUtilsTests;

/**
 * @author horodysk
 */
public class AllTests {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllSplashscreenTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTest(AllMainTests.suite());
        suite.addTest(AllSplashscreenTests.suite());
        suite.addTest(AllUtilsTests.suite());
        // $JUnit-END$
        return suite;
    }

}
