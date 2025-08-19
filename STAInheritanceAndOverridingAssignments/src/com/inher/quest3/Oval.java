package com.inher.quest3;

public class Oval extends Figures{

	@Override
	void volume(int x, int y, int z) {
		int ovalVolume = (int)((4/3) * (Math.PI * x * y * z));
		System.out.println("Oval class voume method : " + ovalVolume);
	}

}
