package org.monstermaster.splashscreen;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * @author horodysk
 */
public class LogoEhridTest extends ActivityInstrumentationTestCase2<LogoEhrid> {

    /***/
    public LogoEhridTest() {
        super(LogoEhrid.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /***/
    @MediumTest
    public void testActivityStarted() throws Exception {
        assertNotNull("Intent was null", getActivity());
    }

}
