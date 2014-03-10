package com.slpz.mvjvutlone.model;

public class Track {
 
	Integer id;
	String title;
	String singer;
	
	public Track() {
		super();
	}

	public Track(Integer id, String title, String singer) {
		super();
		this.id = id;
		this.title = title;
		this.singer = singer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getSinger() {
		return singer;
	}
 
	public void setSinger(String singer) {
		this.singer = singer;
	}
 
	@Override
	public String toString() {
		return "Track [ id=" + id + ", title=" + title + ", singer=" + singer + " ]";
	}
 
}
