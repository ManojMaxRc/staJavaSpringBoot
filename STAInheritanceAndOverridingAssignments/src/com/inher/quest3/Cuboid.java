package com.inher.quest3;

public class Cuboid extends Figures{

	@Override
	void volume(int x, int y, int z) {
		int cuboidVolume = x * y * z;
		System.out.println("Cuboid class volume method : " + cuboidVolume);
	}

}