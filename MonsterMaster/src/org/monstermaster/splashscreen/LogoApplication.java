package org.monstermaster.splashscreen;

import org.monstermaster.R;
import org.monstermaster.main.MainActivity;

import android.content.Intent;
import android.os.Bundle;

/**
 * @author horodysk
 */
public class LogoApplication extends SplashscreanActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLogo(R.drawable.logo_monstermaster);
        setBackground(R.drawable.sky);
    }

    @Override
    protected void startActivity() {
        Intent intent = new Intent(LogoApplication.this, MainActivity.class);
        startActivity(intent);
    }

}
