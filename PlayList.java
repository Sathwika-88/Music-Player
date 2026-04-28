package com;
import java.util.List;

public class PlayList {
String name;
List<Song> songs;
public PlayList(String name, List<Song> songs) {
	super();
	this.name = name;
	this.songs = songs;
}

public PlayList(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Song> getSongs() {
	return songs;
}
public void setSongs(List<Song> list) {
	this.songs = list;
}
@Override
public String toString() {
	return "PlayList [name=" + name + ", songs=" + songs + "]";
}

}
