package com.inher.quest5;

import java.util.Arrays;

public class MobMain {

	public static void main(String[] args) {
		
		FeaturePhone featureMobile = new FeaturePhone();
		featureMobile.call();
		
		SmartPhone smartMobile = new SmartPhone();
		smartMobile.call();
		System.out.println(Arrays.toString(smartMobile.apps()));
	}
}