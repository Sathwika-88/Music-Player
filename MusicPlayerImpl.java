package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayerImpl implements MusicPlayer {
//private static final Song[] Songs = null;
List<Song> songs = new ArrayList<>();
String currentSong=new String("");
List<PlayList> playlists=new ArrayList<>();
	@Override
	public void addSong(Song song) {
		// TODO Auto-generated method stub
		songs.add(song);
	}

	@Override
	public void updateSong(int songId, String title, String artist, double duration) {
		// TODO Auto-generated method stub
		for(Song i:songs)
		{
			if(i.songId==songId)
			{
				i.songTitle=title;
				i.artist=artist;
				i.durations=duration;
			}
		}
	}

	@Override
	public void deleteSong(int songId) {
		// TODO Auto-generated method stub
		Iterator it=songs.iterator();
		while(it.hasNext()) {
			Song s=(Song) it.next();
			if(s.songId==songId)
			{
				 it.remove();
			}
		}
		
	}

	@Override
	public void playSong(int songId) {
		// TODO Auto-generated method stub
		for(Song i:songs)
		{
			if(i.songId==songId)
			{
				  System.out.println("playing "+i+" song....");
				  currentSong=i.songTitle;
				 // System.out.println(currentSong);
			}
		}
		
	}

	@Override
	public void pauseSong() {
		// TODO Auto-generated method stub
		if(!currentSong.equals(""))
		System.out.println("pausing "+currentSong+" song");
		else
			System.out.println("No song is playing");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		currentSong="";
	}

	@Override
	public void displayAllSongs() {
		// TODO Auto-generated method stub
		for(Song s:songs)
		{
			System.out.println(s.songTitle);
		}
	}

	@Override
	public void createPlayList(String playListName) {
		// TODO Auto-generated method stub
		PlayList p=new PlayList(playListName);
		playlists.add(p);
	}

	@Override
	public void addSongToPlayList(String playListName, Song list) {
		// TODO Auto-generated method stub
		int c=0;
		for(PlayList p:playlists)
		{
			if(p.name.equals(playListName))
			{
				c=1;
				if(p.songs==null)
				{
					List<Song> li=new ArrayList<>();
					li.add(list);
					p.songs=new ArrayList<>(li);
				}
				else
				p.songs.add(list);
			}
		}
			if(c==0) {
				createPlayList(playListName);
				for(PlayList p:playlists)
				{
					if(p.name.equals(playListName))
					{
						if(p.songs==null)
						{
							List<Song> li=new ArrayList<>();
							li.add(list);
							p.songs=new ArrayList<>(li);
						}
						else
						p.songs.add(list);
					}
				}
			}
			 
		}
	

	@Override
	public void playPlayList(String playListName) {
		// TODO Auto-generated method stub
		for(PlayList p:playlists)
		{
			if(p.name.equals(playListName))
			{
				//p.setSongs( list);
				List<Song> l=p.getSongs();
				for(Song s:l)
				{
					System.out.println("now playing "+s.songTitle);
				}
			}
		}
	}

	@Override
	public void displayAllPlayList() {
		// TODO Auto-generated method stub
		for(PlayList p:playlists)
		{
			System.out.println(p.name);
		}
	}

	@Override
	public void playSongPlayList(String playlistname, int songname) {
		// TODO Auto-generated method stub
		for(PlayList p:playlists)
		{
			if(p.name.equals(playlistname))
			{
				//p.setSongs( list);
				List<Song> l=p.getSongs();
				for(Song s:l)
				{
					if(s.songId==songname) {
					System.out.println("now playing "+s.songTitle);
					  currentSong=s.songTitle;

					}
					
				}
			}
		}
	}

	 

}
