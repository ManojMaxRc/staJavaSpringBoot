package com.training.quest4;

public class VLCMediaplayer implements MediaPlayer{

	public void playVideo() {
		System.out.println("Play MKV files");		
	}

	@Override
	public void downloadMusic() {
		System.out.println("Download files as MP3");
	}
}