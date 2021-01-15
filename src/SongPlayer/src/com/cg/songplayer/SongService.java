package com.cg.songplayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongService {
	private BufferedReader reader;

	public void start() {
		// getSongList from songlist.txt file
		List<Song> songs = getSongs();
		// display song list
		System.out.println("-------Before Sorting---------");
		for (Song song : songs) {
			System.out.println(song);
		}
		 Collections.sort(songs);
		System.out.println("-------After Sorting---------");
		for (Song song : songs) {
			System.out.println(song);
		}
		// sorting the songs based on title
		
//		TreeSet<Song> sortedSet = new TreeSet<>(songs);
//		sortedSet.descendingSet();
//		System.out.println("-------After Sorting---------");
//		for (Song song : sortedSet) {
//			System.out.println(song);
//		}
		

	}

	private List<Song> getSongs() {
		// Read songlist.txt file and create song list
		List<Song> songList = new ArrayList<>();
		try {
			File file = new File("E:\\HANDS ON\\Training\\SongPlayer\\src\\com\\cg\\songplayer\\songlist.txt");
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("/");
				songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return songList;
	}
}