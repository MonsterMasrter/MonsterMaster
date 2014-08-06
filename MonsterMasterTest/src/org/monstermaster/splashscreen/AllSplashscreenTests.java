package org.monstermaster.splashscreen;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.monstermaster.tests.AllTests;

/**
 * @author horodysk
 */
public class AllSplashscreenTests {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTestSuite(LogoApplicationTest.class);
        suite.addTestSuite(LogoEhridTest.class);
        // $JUnit-END$
        return suite;
    }

}
