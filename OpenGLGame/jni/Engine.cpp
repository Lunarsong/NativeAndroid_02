#include "Engine.h"

extern "C"
{
    JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnInit( JNIEnv* env, jobject obj );
    JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnResize( JNIEnv* env, jobject obj, jint iWidth, jint iHeight );
    JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnFrame( JNIEnv* env, jobject obj );
};

JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnInit( JNIEnv* env, jobject obj )
{
	LOGE( "Hello Init!" );
}

JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnResize( JNIEnv* env, jobject obj, jint iWidth, jint iHeight )
{
	LOGE( "Hello Screen! Width: %i, Height: %i", iWidth, iHeight );
}

JNIEXPORT void JNICALL Java_com_example_openglgame_JNILib_OnFrame( JNIEnv* env, jobject obj )
{
	LOGE( "Hello Frame!" );
}
