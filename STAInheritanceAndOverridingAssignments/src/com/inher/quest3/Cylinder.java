package com.inher.quest3;

public class Cylinder extends Figures{

	@Override
	void volume(int x, int y, int z) {
		int cylinderVolume =(int)(Math.PI * x * x * y);
		System.out.println("Cylinder class volume method : " + cylinderVolume);
	}
}