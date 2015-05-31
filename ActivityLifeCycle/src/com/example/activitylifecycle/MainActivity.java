package com.example.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DEB", "onCreate is called");
        num++;
    }

    protected void onStart (){
    	super.onStart();
    	Log.d("DEB", "onStart is called");
    	num++;
    }
    
    protected void onResume (){
    	super.onResume();
    	Log.d("DEB", "onResume is called");
    }
    
    protected void onPause (){
    	super.onPause();
    	Log.d("DEB", "onPause is called");
    }
    
    protected void onStop (){
    	super.onStop();
    	Log.d("DEB", "onStop is called");
    }
    
    protected void onRestart (){
    	super.onRestart();
    	Log.d("DEB", "onRestart is called");
    }
    
    protected void onDestroy (){
    	super.onDestroy();
    	Log.d("DEB", "onDestroy is called");
    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
    	Log.d("DEB", "onSaveInstanceState is called");
    	Log.d("DEB","Count="+num);
    	savedInstanceState.putInt("DEB", num);
    	super.onSaveInstanceState(savedInstanceState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
    	Log.d("DEB", "onRestoreInstanceState is called");
    	super.onRestoreInstanceState(savedInstanceState);
    	savedInstanceState.getInt("DEB");
    	Log.d("DEB","Count="+num);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}