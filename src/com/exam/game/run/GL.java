package com.exam.game.run;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;



public class GL implements GLSurfaceView.Renderer
{
	public GL(){	

	}

	@Override
	public void onSurfaceCreated(GL10 glUnused, EGLConfig config){
		GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	}


	@Override
	public void onSurfaceChanged(GL10 glUnused, int width, int height){
		
	}	


	@Override
	public void onDrawFrame(GL10 glUnused){
		GLES20.glClear(GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);	
 	}	
}

