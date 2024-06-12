package com.d2d.basiclooper;

import android.os.Handler;
import android.os.Looper;

public class BackgroundThread extends Thread {
	private Handler handler;
	
	@Override
	public void run() {
		super.run();
		
		Looper.prepare();   // Associating thread
		handler = new Handler(Looper.myLooper());
		
		// We run our first task here.
		handler.post(new FirstTask());
		
		// We run our second task here.
		handler.post(new SecondTask());
		
		Looper.loop();
		
	}
	
	/**
	 * This method is used to add different tasks to the message queue
	 *
	 * @param task
	 */
	public void addTaskToMessageQueue (Runnable task) {
		handler.post(task);
	}
}
