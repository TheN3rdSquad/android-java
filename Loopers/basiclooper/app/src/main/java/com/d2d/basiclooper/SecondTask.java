package com.d2d.basiclooper;

import android.os.SystemClock;
import android.util.Log;

public class SecondTask implements Runnable {
	
	public static int mCount = 0;
	
	public static boolean mIsTaskComplete = false;
	
	public static boolean mIsTaskStarted = false;
	@Override
	public void run() {
		Log.i("BasicLooper", "task2 has started running on the thread.");
		mIsTaskStarted = true;
		
		// this is called in the thread
		for (int i = 0; i < 100; i++) {
			SystemClock.sleep(100);
			// Assume this is a heavy task which is performed.
			Log.i("BasicLooper", "Performing task2 #" + (i + 1));
			mCount++;
		}
		mIsTaskComplete = true;
		
		Log.i("BasicLooper", "task2 has finished running on the thread.");
	}
}
