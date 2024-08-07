package com.tus.song;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public String addSong(Song song) {
    	// if song title already there do not allow
    	if (songs.size()==5) {
    		return "PLAYLIST FULL";
    	}
    	if (song.getArtist().isEmpty()||song.getTitle().isEmpty()) {
    		return "TITLE OR ARTIST EMPTY";
    	}
    	
		for (Song playListSong : songs) {
			if (playListSong.getTitle().equals(song.getTitle())) {
				return "SONG ALREADY IN LIST";
			}
		}
		int numSongsFromArtist=0;
		for (Song playListSong : songs) {
			if (playListSong.getArtist().equals(song.getArtist())) {
				numSongsFromArtist++;
			}
		}
		if (numSongsFromArtist==2) {
			return "ALREADY 2 SONGS FROM "+song.getArtist();
		}
        songs.add(song);
        return "SONG ADDED";
    }


    public List<Song> getSongsByArtist(String artist) {
        ArrayList<Song> songsByArtist = new ArrayList<>();
        for (Song song : songs) {
            if (song.getArtist().equals(artist)) {
                songsByArtist.add(song);
            }
        }
        return songsByArtist;
    }

    public List<Song> getSongsShorterThan(int duration) {
        ArrayList<Song> songsShorterThan = new ArrayList<>();
        for (Song song : songs) {
            if (song.getDuration() < duration) {
                songsShorterThan.add(song);
            }
        }
        return songsShorterThan;
    }

    public int getNumberOfSongs() {
        return songs.size();
    }
}


