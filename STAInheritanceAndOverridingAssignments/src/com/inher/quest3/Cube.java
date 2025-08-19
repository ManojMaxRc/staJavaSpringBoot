package com.inher.quest3;

public class Cube extends Figures {

	@Override
	void volume(int x, int y, int z) {
		int cubeVolume = x * y * z;
		System.out.println("Cube class volume method : " + cubeVolume);
		
	}
}
