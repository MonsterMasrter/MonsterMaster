package org.monstermaster.splashscreen;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * @author horodysk
 */
public class LogoApplicationTest extends ActivityUnitTestCase<LogoApplication> {

    /***/
    public LogoApplicationTest() {
        super(LogoApplication.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(), LogoApplication.class);
        startActivity(intent, null, null);
    }

    /***/
    @MediumTest
    public void testActivityStarted() throws Exception {
        assertNotNull("Intent was null", getActivity());
    }

}
