package org.monstermaster.main;

import java.util.List;

import org.monstermaster.R;
import org.monstermaster.utils.AccountManagerUtils;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author horodysk
 */
public class MainActivity extends Activity {

    private AccountManagerUtils accountManager = new AccountManagerUtils();

    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (TextView) findViewById(R.id.emial_name);
        List<String> curretUserEmailAddress = accountManager.getCurretUserEmailAddress(getApplicationContext());

        if (!curretUserEmailAddress.isEmpty())
            email.setText(curretUserEmailAddress.toString());
    }

}
