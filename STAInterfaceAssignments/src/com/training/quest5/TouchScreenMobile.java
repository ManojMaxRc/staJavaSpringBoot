package com.training.quest5;

public class TouchScreenMobile extends BasicMobile implements SmartPhone{

	@Override
	public void showApps() {
		System.out.println("Instagram, Youtube");
	}

	@Override
	public void cameraTypes() {
		System.out.println("Selfie camera, Rear camera");
	}
}