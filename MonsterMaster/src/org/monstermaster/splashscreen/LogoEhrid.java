package org.monstermaster.splashscreen;

import org.monstermaster.R;

import android.content.Intent;
import android.os.Bundle;

/**
 * @author horodysk
 */
public class LogoEhrid extends SplashscreanActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setLogo(R.drawable.logo_ehrid);
	}

	@Override
	protected void startActivity() {
		Intent intent = new Intent(LogoEhrid.this, LogoApplication.class);
		startActivity(intent);
	}

}
