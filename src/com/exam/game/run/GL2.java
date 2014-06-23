package com.exam.game.run;

import android.opengl.GLES20;

/**
 * This class implements our custom renderer. Note that the GL10 parameter passed in is unused for OpenGL ES 2.0
 * renderers -- the static class GLES20 is used instead.
 */
public class GL2 extends Renderer{
		
    @Override
    public void onCreate(int width, int height, boolean contextLost) {
        GLES20.glClearColor(0f, 0f, 0f, 1f);
    }
 
    @Override
    public void onDrawFrame(boolean firstDraw) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT| GLES20.GL_DEPTH_BUFFER_BIT);
    }	
}
