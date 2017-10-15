package nyc.c4q.my_hello_world_android_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Running onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Running onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Running onPause");


    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Running onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Running onDestroy");
    }
}