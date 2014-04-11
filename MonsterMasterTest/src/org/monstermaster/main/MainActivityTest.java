package org.monstermaster.main;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * @author horodysk
 */
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

    /***/
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(intent, null, null);
    }

    /***/
    @MediumTest
    public void testActivityStarted() throws Exception {
        assertNotNull("Intent was null", getActivity());
    }
}
