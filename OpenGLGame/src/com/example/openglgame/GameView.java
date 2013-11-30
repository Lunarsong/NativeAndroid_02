package com.example.openglgame;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import com.example.openglgame.JNILib;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class GameView extends GLSurfaceView 
{
	private static class Renderer implements GLSurfaceView.Renderer 
    {
        public void onDrawFrame( GL10 gl ) 
        {
        	JNILib.OnFrame();
        }

        public void onSurfaceChanged( GL10 gl, int iWidth, int iHeight ) 
        {
        	JNILib.OnResize( iWidth, iHeight );
        }

        public void onSurfaceCreated( GL10 gl, EGLConfig config ) 
        {
        	JNILib.OnInit();
        }
    }
	
    public GameView( Context context ) 
    {
        super( context );
        
        // Pick an EGLConfig with RGB8 color, 16-bit depth, no stencil,
        // supporting OpenGL ES 2.0 or later backwards-compatible versions.
        setEGLConfigChooser( 8, 8, 8, 0, 16, 0 );
        setEGLContextClientVersion( 2 );
        setRenderer( new Renderer() );
    }
}
