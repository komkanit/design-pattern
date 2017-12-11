package com.javacodegeeks.patterns.facadepattern;

public class ScheduleServer {
	
	public void startBooting(){
		System.out.println("Starts booting...");
	}
	
	public void readSystemConfigFile(){
		System.out.println("Reading system config files...");
	}
	
	public void init(){
		System.out.println("Initializing...");
	}
	
	public void initializeContext(){
		System.out.println("Initializing context...");
	}
	
	public void initializeListeners(){
		System.out.println("Initializing listeners...");
	}
	
	public void createSystemObjects(){
		System.out.println("Creating system objects...");
	}
	
	public void releaseProcesses(){
		System.out.println("Releasing processes...");
	}
	
	public void destory(){
		System.out.println("Destorying...");
	}
	
	public void destroySystemObjects(){
		System.out.println("Destroying system objects...");
	}
	
	public void destoryListeners(){
		System.out.println("Destroying listeners...");
	}
	
	public void destoryContext(){
		System.out.println("Destroying context...");
	}

	public void shutdown(){
		System.out.println("Shutting down...");
	}
}
