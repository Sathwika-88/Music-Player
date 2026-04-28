package com;
import java.util.List;

public interface MusicPlayer {
void addSong(Song song);
void updateSong(int songId,String title,String artist,double duration);
void deleteSong(int songId);
void playSong(int songId);
void pauseSong();
void stop();
void displayAllSongs();
void createPlayList(String playListName);
void addSongToPlayList(String playListName,Song list);
void playPlayList(String playListName);
void displayAllPlayList();
void playSongPlayList(String playlistname,int songname);
}
