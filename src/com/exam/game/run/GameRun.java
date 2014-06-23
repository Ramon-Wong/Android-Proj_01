package com.exam.game.run;
 
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.util.Log;




public class GameRun extends Activity{
	
	String  LOG = "GameRun";
	private GLSurfaceView glSurface;
	/** Called when the activity is first created. */




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
		final ConfigurationInfo cInfo = am.getDeviceConfigurationInfo();
		
		if(cInfo.reqGlEsVersion >= 0x20000){
			Log.i(LOG, "Supporting GLES 2.0:     <================================");
		}else{
			Log.i(LOG, "no Support for GLES 2.0: <================================");
			Log.i(LOG, "Fall back to GLES 1.x:   <================================");
		}
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Create an Instance with this Activity
		glSurface = new GLSurfaceView(this);
		//Set our own Renderer
		// dus de class uit de GLloop.java zit hier? hier in dit geval de naam van de dir
		glSurface.setRenderer(new GL());    
		//Set the GLSurface as View to this Activity
		
		setContentView(glSurface);
	}

	@Override
	protected void onResume() {
		super.onResume();
		glSurface.onResume();
	}


	@Override
	protected void onPause() {
		super.onPause();
		glSurface.onPause();
	}
 
}
