package myportfolioapp.krzyzek.confkit.net.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button mSpotifyStreamer;
    Button mScoresApp;
    Button mLibraryApp;
    Button mBuildItBigger;
    Button mXYZReader;
    Button mCapstoneMyOwnApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamer = (Button) findViewById(R.id.button_spotify_streamer);
        mScoresApp = (Button) findViewById(R.id.button_scores_app);
        mLibraryApp = (Button) findViewById(R.id.button_library_app);
        mBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        mXYZReader = (Button) findViewById(R.id.button_xyz_reader);
        mCapstoneMyOwnApp = (Button) findViewById(R.id.button_capstone_my_own_app);


        mSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_spotfiy_streamer));
            }
        });

        mScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_scores_app));
            }
        });

        mLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_library_app));
            }
        });

        mBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_build_it_bigger));
            }
        });

        mXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_xyz_reader));
            }
        });

        mCapstoneMyOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getApplicationContext(), getString(R.string.toast_capstone_my_own_app));
            }
        });

    }

    private void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            showToast(getApplicationContext(), getString(R.string.toast_settings));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
