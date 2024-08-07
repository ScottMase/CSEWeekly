package com.tus.song;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PlaylistTest {
    private Playlist playList;

    @BeforeEach
    public void setup() {
        playList = new Playlist();
    }
    @Test
    void testNoSongsinList() {
    	assertEquals(0, playList.getNumberOfSongs());
    }

    @Test
    void testAddOneSongOK() {
        Song song = new Song("Title", "Artist", 180);
        assertEquals("SONG ADDED",playList.addSong(song));
        assertEquals(1, playList.getNumberOfSongs());
    }
    
    @Test
   void testAddOneSongTitleEmpty() {
        Song song = new Song("", "Artist", 180);
        assertEquals("TITLE OR ARTIST EMPTY",playList.addSong(song));
        assertEquals(0, playList.getNumberOfSongs());
    }
    
    @Test
   void testAddOneSongArtistEmpty() {
        Song song = new Song("Title", "", 180);
        assertEquals("TITLE OR ARTIST EMPTY",playList.addSong(song));
        assertEquals(0, playList.getNumberOfSongs());
    }
    
    @Test
   void testAddSongTitleAlreadyInList() {
        Song song = new Song("Title", "Artist", 180);
        Song song1 = new Song("Title", "Artist1", 180);
        assertEquals("SONG ADDED",playList.addSong(song));
        assertEquals("SONG ALREADY IN LIST",playList.addSong(song1));
        assertEquals(1, playList.getNumberOfSongs());
    }
    
    @Test
  void testAddSongPlayListFull() {
        Song song1 = new Song("Title1", "Artist1", 180);
        Song song2 = new Song("Title2", "Artist2", 180);
        Song song3 = new Song("Title3", "Artist3", 180);
        Song song4 = new Song("Title4", "Artist4", 180);
        Song song5 = new Song("Title5", "Artist5", 180);
        Song song6 = new Song("Title6", "Artist6", 180);
        assertEquals("SONG ADDED",playList.addSong(song1));
        assertEquals("SONG ADDED",playList.addSong(song2));
        assertEquals("SONG ADDED",playList.addSong(song3));
        assertEquals("SONG ADDED",playList.addSong(song4));
        assertEquals("SONG ADDED",playList.addSong(song5));
        assertEquals("PLAYLIST FULL",playList.addSong(song6));
        assertEquals(5, playList.getNumberOfSongs());
    }
    
    @Test
   void testAddSongTwoFromArtistAlready() {
        Song song1 = new Song("Title1", "Artist1", 180);
        Song song2 = new Song("Title2", "Artist1", 180);
        Song song3 = new Song("Title3", "Artist1", 180);
        assertEquals("SONG ADDED",playList.addSong(song1));
        assertEquals("SONG ADDED",playList.addSong(song2));
        assertEquals("ALREADY 2 SONGS FROM Artist1",playList.addSong(song3));
        assertEquals(2, playList.getNumberOfSongs());
    }

    @Test
   void testGetSongsByArtist() {
        Song song1 = new Song("Title 1", "Artist 1", 180);
        Song song2 = new Song("Title 2", "Artist 2", 200);
        playList.addSong(song1);
        playList.addSong(song2);
        List<Song> songsByArtist = playList.getSongsByArtist("Artist 1");
        assertEquals(1, songsByArtist.size());
        assertEquals("Artist 1", songsByArtist.get(0).getArtist());
    }

    @Test
    void testGetSongsShorterThan() {
        Song song1 = new Song("Title 1", "Artist 1", 180);
        Song song2 = new Song("Title 2", "Artist 2", 200);
        playList.addSong(song1);
        playList.addSong(song2);
        List<Song> songsShorterThan = playList.getSongsShorterThan(200);
        assertEquals(1, songsShorterThan.size());
        assertEquals(song1, songsShorterThan.get(0));
        assertEquals(180, songsShorterThan.get(0).getDuration());
    }
    
}
        
