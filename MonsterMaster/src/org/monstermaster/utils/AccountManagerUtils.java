package org.monstermaster.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;

/**
 * @author horodysk
 */
public class AccountManagerUtils {

    /***/
    public List<String> getCurretUserEmailAddress(Context context) {
        List<String> emails = new ArrayList<String>();
        Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
        Account[] accounts = getAccounts(context);

        for (Account account : accounts) {
            String name = account.name;
            Matcher matcher = emailPattern.matcher(name);
            if (matcher.matches()) {
                emails.add(name);
            }
        }

        return emails;
    }

    protected Account[] getAccounts(Context context) {
        return AccountManager.get(context).getAccounts();
    }
}
