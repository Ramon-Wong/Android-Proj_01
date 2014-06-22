package com.exam.game.run;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;



public class GameRun extends Activity {
	
	String LOG = "com.exam.game.run";
	
	
	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Log.i(LOG, "Function onCreate: <===");
		setContentView(R.layout.main);
    }

	@Override
	public void onPause(){
		super.onPause();
		Log.i(LOG, "Function onPause: <===");
	}
    
    @Override
	public void onResume(){ 
		super.onResume();
		Log.i(LOG, "Function onResume: <===");
	}


    @Override
	public boolean onKeyDown( int keyCode, KeyEvent msg){
		
		Log.i(LOG, "Function onKeyDown: %i <===", keyCode);
		return super.onKeyDown(keyCode, msg);
	}
    
    @Override
	public boolean onKeyUp( int keyCode, KeyEvent msg){
		
		Log.i(LOG, "Function onKeyUp: %i <===", keyCode);
		return super.onKeyUp(keyCode, msg);
	}
    
	@Override
	public boolean onTouchEvent( MotionEvent event){
		Log.i(LOG, "Function onTouch: %i x %i <===", event.getX(), event.getY());
		return true;
	}
}







