package com.slpz.mvjvutlone.dto;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.slpz.mvjvutlone.model.Track;

public class TrackDto {

	private static Map<Integer,Track> tracks = new HashMap<Integer,Track>();
	
	static {
		tracks.put(11, new Track(11,"One","U2"));
		tracks.put(12, new Track(12,"Loosing","REM"));
		tracks.put(13, new Track(13,"1999","Pumpkins"));
	}

	public List<Track> getAllTracks() {
		
		List<Track> trackList = new ArrayList<Track>();
		
		for (Object value : tracks.values()) {
		    Track track = (Track)value;
		    trackList.add(track);
		}
		
		return trackList;
	}
	
	public Track getTrackById(Integer id) {
		
		Track track = tracks.get(id);

        return track;
	}

	public Track getTrackByTitle(String name) {
		
		for (Object value : tracks.values()) {
		    Track track = (Track)value;
		    if (name.equals(track.getTitle())) {
		    	return track;
		    }
		}

        return null;
	}
	
	public String createTrack(Track track) {
		
		tracks.put(track.getId(), track);
		
		String result = "Track saved : " + track;
		
		return result;
	}
	
	public void deleteTrackById(Integer id) {
		
		tracks.remove(id);
	}
	
	public String updateTrack(Track track) {
		
		tracks.put(track.getId(), track);
		
		String result = "Track updated : " + track;
		
		return result;
	}
	
}
