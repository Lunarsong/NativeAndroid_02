package com.example.openglgame;

public class JNILib 
{
    static 
    {
        System.loadLibrary( "Engine" );
    }

    public static native void OnInit();
    public static native void OnResize( int iWidth, int iHeight );
    public static native void OnFrame();
}

