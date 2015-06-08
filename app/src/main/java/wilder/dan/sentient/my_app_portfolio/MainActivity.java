package wilder.dan.sentient.my_app_portfolio;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchApp(View view) {
        Context context = getApplicationContext();

        CharSequence appName;
        CharSequence base = context.getString(R.string.toast_description);

        switch(view.getId())
        {
            case R.id.button :
                appName = "Spotify Streamer";
                break;
            case R.id.button2 :
                appName = "Scores";
                break;
            case R.id.button3 :
                appName = "Library";
                break;
            case R.id.button4 :
                appName = "Build It Bigger";
                break;
            case R.id.button5 :
                appName = "XYZ Reader";
                break;
            case R.id.button6 :
                appName = "capstone";
                break;
            default:
                appName = "unexpected";
        }

        CharSequence text = TextUtils.concat(base," ", appName," app!");

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
