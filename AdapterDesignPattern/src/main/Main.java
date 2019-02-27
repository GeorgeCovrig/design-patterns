package main;

import adapter.AdapterOldToNew;
import old.classes.VideoStreamingImplementation;
import old.classes.VideoStreamingInterface;

public class Main {

	public static void main(String[] args) {
		//how it was working with the old Video provider
		VideoStreamingInterface streamingImplementation=new VideoStreamingImplementation();
		System.out.println(streamingImplementation.playVideo("Olaaa"));
		
		
		//how it will work with the adapter
		
		streamingImplementation = new AdapterOldToNew();
		System.out.println(streamingImplementation.playVideo("Olaaa"));
		
		//no real change was made here
		//with the help of adapter design pattern
	}

}
