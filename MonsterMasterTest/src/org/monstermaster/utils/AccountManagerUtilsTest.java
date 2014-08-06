package org.monstermaster.utils;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import android.accounts.Account;
import android.content.Context;
import android.test.mock.MockContext;

/**
 * @author horodysk
 */
public class AccountManagerUtilsTest extends TestCase {

    Context context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = new MockContext();
    }

    /***/
    public void testThatAccountsAreMatchedCorrectly() throws Exception {
        // given
        List<String> expected = new ArrayList<String>();
        expected.add("email@mail.com");
        expected.add("email@email.com");

        Account[] accountList = new Account[3];
        accountList[0] = new Account("email@mail.com", "email");
        accountList[1] = new Account("not-email", "email");
        accountList[2] = new Account("email@email.com", "not-email");

        AccountManagerUtilsForTests testClass = new AccountManagerUtilsForTests(accountList);

        // when
        List<String> result = testClass.getCurretUserEmailAddress(context);

        // then
        assertEquals(expected, result);
    }

    /***/
    public void testConeDontCrashesWhenNoAccountIsPresent() throws Exception {
        // given
        List<String> expected = new ArrayList<String>();
        Account[] accountList = new Account[0];

        AccountManagerUtilsForTests testClass = new AccountManagerUtilsForTests(accountList);

        // when
        List<String> result = testClass.getCurretUserEmailAddress(context);

        // then
        assertEquals(expected, result);
    }

    private class AccountManagerUtilsForTests extends AccountManagerUtils {

        private Account[] accountList;

        @SuppressWarnings("hiding")
        public AccountManagerUtilsForTests(Account[] accountList) {
            this.accountList = accountList;
        }

        @SuppressWarnings({ "unused", "hiding" })
        @Override
        protected Account[] getAccounts(Context context) {
            return accountList;
        }
    }

}
