package francisco.landicho.com.landichofranciscolab4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;






public class MainActivity extends Activity {

    private Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");

        button = (Button) findViewById(R.id.buttonToast);
        button1 = (Button) findViewById(R.id.buttonSnackBar);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "BACK button is clicked.", Toast.LENGTH_LONG).show();

            }

    });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(view, "NEXT button is clicked.", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }





}

