package org.monstermaster.splashscreen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author horodysk
 */
public class AllSplashscreenTests extends TestCase {

    /***/
    public static Test suite() {
        TestSuite suite = new TestSuite(AllSplashscreenTests.class.getName());
        // $JUnit-BEGIN$
        suite.addTestSuite(LogoApplicationTest.class);
        suite.addTestSuite(LogoEhridTest.class);
        // $JUnit-END$
        return suite;
    }

}
