package com.tk.time;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
	
	/**
	 * Induced offset between server and client clocks (client is lagging)
	 */
	public static final long SERVER_OFFSET = 1200;// SET THE OFFSET ACCORDING TO THE DELAY YOU WANT IN YOUR NETWORK
	
	/**
	 * Network IP address
	 */
	public static String HOST_ADDR = "192.168.43.125"; //GIVE YOUR SYSTEM CURRENT IP ADDRESS
	

	/**
	 * Network port
	 */
	public static int HOST_PORT = 1223; // GIVE A PORT NO. WHICH IS NOT IN USE
	
	/**
	 * Get a random delay between 10 - 100 ms
	 * @return
	 */
	public static long getRandomDelay(){
		return ThreadLocalRandom.current().nextLong(10, 100 + 1);
	}
	
	/**
	 * Attempts to sleep the calling thread for given duration
	 * @param duration
	 */
	public static void sleepThread(long duration){
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
