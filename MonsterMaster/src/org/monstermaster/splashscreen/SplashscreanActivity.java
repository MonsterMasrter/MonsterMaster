package org.monstermaster.splashscreen;

import org.monstermaster.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * @author horodysk
 */
public abstract class SplashscreanActivity extends Activity {

    private static final int TIME = 2 * 1000;

    private RelativeLayout layout;

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        logo = (ImageView) findViewById(R.id.splashscreen_logo);
        layout = (RelativeLayout) logo.getParent();

        startNextActivityAfterTime();
    }

    protected void setLogo(int drawable) {
        logo.setImageDrawable(getResources().getDrawable(drawable));
    }

    protected void setBackground(int drawable) {
        layout.setBackgroundDrawable(getResources().getDrawable(drawable));
    }

    private void startNextActivityAfterTime() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity();
                finish();
                changeAnimation();
            }

            private void changeAnimation() {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }

        }, TIME);
    }

    protected abstract void startActivity();

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }

}
