package com.slpz.mvjvutlone.dto;

import com.slpz.mvjvutlone.model.Track;

public class TrackDto {

	public Track getTrackInJSON(String name) {
		
		Track track = new Track();
        track.setTitle("Enter Trackman");
        track.setSinger(name);

        return track;
	}
	
	public String createTrackInJSON(Track track) {
		
		String result = "Track saved : " + track;
		
		return result;
	}
	
}
