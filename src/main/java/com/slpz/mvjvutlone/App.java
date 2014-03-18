package com.slpz.mvjvutlone;

import java.util.List;

import com.slpz.mvjvutlone.dto.TrackDto;
import com.slpz.mvjvutlone.model.Track;
import com.slpz.mvjvutlone.dto.PassReqApi;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hi hello hello hello" );
        tst1();
        tst2();
    }
    
    public static void tst1() {
    	
    	TrackDto trackDto = new TrackDto();
    	
    	List<Track> tracks1 = trackDto.getAllTracks();
    	for (Track track : tracks1) {
    		System.out.println(track);
    	}
    	System.out.println("------");
    	
    	Track track11 = trackDto.getTrackByTitle("One");
    	System.out.println(track11);
    	System.out.println("------");
    	
    	Track track12 = trackDto.getTrackById(12);
    	System.out.println(track12);
    	System.out.println("------");
    	
    	Track track22 = new Track(22,"Jude","Beatles");
    	Track track23 = new Track(23,"Submarine","Beatles");
    	String result20 = trackDto.createTrack(track22);
    	System.out.println(result20);
    	result20 = trackDto.createTrack(track23);
    	System.out.println(result20);
    	tracks1 = trackDto.getAllTracks();
    	for (Track track : tracks1) {
    		System.out.println(track);
    	}
    	System.out.println("------");
    	
    	Track track24 = new Track(13,"1999","Pineapples");
    	result20 = trackDto.updateTrack(track24);
    	System.out.println(result20);
    	trackDto.deleteTrackById(12);
    	tracks1 = trackDto.getAllTracks();
    	for (Track track : tracks1) {
    		System.out.println(track);
    	}
    	System.out.println("------");
    }
    
    public static void tst2() {
    	PassReqApi reqApi = new PassReqApi();
    	System.out.println("sending post request");
		String response = reqApi.sendingPost("023");
		System.out.println(response);
		System.out.println("------");
    }
    
}
