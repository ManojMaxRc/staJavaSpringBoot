package com.training.quest4;

import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the media player choice : 1.VLC 2.Windows");
		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			MediaPlayer mediaPlayer = new VLCMediaplayer();
			mediaPlayer.playVideo();
			mediaPlayer.downloadMusic();
			break;
		
		case 2:
			mediaPlayer = new WindowsMediaPlayer1();
			mediaPlayer.playVideo();
			mediaPlayer.downloadMusic();
			break;

		default:
			System.out.println("Invalid input choice");
			break;
		}
	}
}