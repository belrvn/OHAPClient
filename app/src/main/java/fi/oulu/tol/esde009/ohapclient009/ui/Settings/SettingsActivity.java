package fi.oulu.tol.esde009.ohapclient009.ui.Settings;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by bel on 17.04.16.
 */
public class SettingsActivity extends Activity {

    private final static String TAG = "Debug_SettingsActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .addToBackStack(null)
                .commit();


    }
}