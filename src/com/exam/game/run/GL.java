package com.exam.game.run;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;

import android.opengl.GLU;
import android.opengl.GLSurfaceView;






public class GL implements	Renderer {
	private int 			glWidth;
	private int				glHeight;
	private boolean			SurfaceCreated;


	public GL(){
		SurfaceCreated		= false;
		glWidth				= 1;
		glHeight			= 1;
	}
 
 
	@Override
 	public void onSurfaceCreated(GL10 NOT_USED, EGLConfig config) {	
		
		SurfaceCreated		= true;
	}
 
 
     @Override
    public void onSurfaceChanged(GL10 NOT_USED, int width, int height) {
		
	}
 
 
    @Override
    public void onDrawFrame(GL10 NOT_USED) {
		
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT| GLES20.GL_DEPTH_BUFFER_BIT);
    }	
    	
 
    public abstract void onCreate(int width, int height, boolean contextLost);
	public abstract void onDrawFrame(boolean firstDraw);	
}


/*
public class GL implements Renderer {
	private Cube   cube;
	private Camera Cam; 


	private float rquadx; 
	private float rquady; 
	private float rquadz; 

	public GL(){
		cube = new Cube();
		Cam  = new Camera();
	}


	public void onSurfaceCreated(GL10 gl, EGLConfig config) {		
		gl.glShadeModel(GL10.GL_SMOOTH); 			//Enable Smooth Shading
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f); 	//Black Background
		gl.glClearDepthf(1.0f); 					//Depth Buffer Setup
		gl.glEnable(GL10.GL_DEPTH_TEST); 			//Enables Depth Testing
		gl.glDepthFunc(GL10.GL_LEQUAL); 			//The Type Of Depth Testing To Do
		
		//Really Nice Perspective Calculations
		gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST); 
	}


	public void onDrawFrame(GL10 gl) {
		//Clear Screen And Depth Buffer
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);	
		gl.glLoadIdentity();			//Reset The Current Modelview Matrix		
		
		// Set Camera here
		Cam.SetCamera(gl);
	   
		//
		// Draw Shit here!

		//Drawing
		gl.glPushMatrix();

		gl.glTranslatef(0.0f, 0.2f, 0.0f);	//Move down 1.0 Unit And Into The Screen 7.0
		//Minor change: Scale the Cube to 80 percent, otherwise it would be too large for the Emulator screen
		gl.glScalef(0.9f, 0.9f, 0.9f); 			
		gl.glRotatef(rquadx, 1.0f, 0.0f, 0.0f);	//Rotate The Square On The X axis 
		gl.glRotatef(rquady, 0.0f, 1.0f, 0.0f);	//Rotate The Square On The X axis 
		gl.glRotatef(rquadz, 0.0f, 0.0f, 1.0f);	//Rotate The Square On The X axis 
		cube.draw(gl);
		//Draw the Cube
		gl.glPopMatrix();		
 
		rquadx -= 1.5f;			//Decrease The Rotation Variable For The Quad ( NEW )
		rquady += 1.5f;			//Decrease The Rotation Variable For The Quad ( NEW )
		rquadz += 2.5f;			//Decrease The Rotation Variable For The Quad ( NEW )
	}


	public void onSurfaceChanged(GL10 gl, int width, int height) {
		if(height == 0) { 					//Prevent A Divide By Zero By
			height = 1; 					//Making Height Equal One
		}

		gl.glViewport(0, 0, width, height); 	//Reset The Current Viewport
		gl.glMatrixMode(GL10.GL_PROJECTION); 	//Select The Projection Matrix
		gl.glLoadIdentity(); 					//Reset The Projection Matrix

			//Calculate The Aspect Ratio Of The Window
		GLU.gluPerspective(gl, 45.0f, (float)width / (float)height, 0.1f, 100.0f);

		gl.glMatrixMode(GL10.GL_MODELVIEW); 	//Select The Modelview Matrix
		gl.glLoadIdentity(); 			//Reset The Modelview Matrix
	}
}

/*

import android.opengl.GLES20;
 
public class GLES20Renderer extends GLRenderer {
 
    @Override
    public void onCreate(int width, int height,
            boolean contextLost) {
        GLES20.glClearColor(0f, 0f, 0f, 1f);
    }
 
    @Override
    public void onDrawFrame(boolean firstDraw) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT
                | GLES20.GL_DEPTH_BUFFER_BIT);
    }
} 


*/
