package com;

public class Song {
int songId;
String songTitle;
String artist;
double durations;
public Song(int songId, String songTitle, String artist, double durations) {
	super();
	this.songId = songId;
	this.songTitle = songTitle;
	this.artist = artist;
	this.durations = durations;
}
public int getSongId() {
	return songId;
}
public void setSongId(int songId) {
	this.songId = songId;
}
public String getSongTitle() {
	return songTitle;
}
public void setSongTitle(String songTitle) {
	this.songTitle = songTitle;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public double getDurations() {
	return durations;
}
public void setDurations(double durations) {
	this.durations = durations;
}
@Override
public String toString() {
	return "Song [songId=" + songId + ", songTitle=" + songTitle + ", artist=" + artist + ", durations=" + durations
			+ "]";
}

}
