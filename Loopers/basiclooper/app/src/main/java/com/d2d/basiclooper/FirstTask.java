package com.d2d.basiclooper;

import android.os.SystemClock;
import android.util.Log;

public class FirstTask implements Runnable {
	
	public static int mCount = 0;
	
	public static boolean mIsTaskComplete = false;
	
	public static boolean mIsTaskStarted = false;
	
	@Override
	public void run() {
		Log.i("BasicLooper", "task1 has started running on the thread.");
		mIsTaskStarted = true;
		
		// this is called in the thread
		for (int i = 0; i < 100; i++) {
			SystemClock.sleep(250);    // some delay
			// Assume that this is a heavy task which is performed.
			Log.i("BasicLooper", "Performing task1 #" + (i + 1));
			mCount++;
		}
		
		mIsTaskComplete = true;
		
		Log.i("BasicLooper", "task1 has finished running on the thread.");
	}
}
