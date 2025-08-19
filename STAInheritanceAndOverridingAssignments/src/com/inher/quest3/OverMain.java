package com.inher.quest3;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Figures cubeFigures = new Cube();
		System.out.println("Enter the side : ");
		int cubeSide = input.nextInt();
		cubeFigures.volume(cubeSide, cubeSide, cubeSide);
		
		Figures cuboidFigures = new Cuboid();
		System.out.println("Enter the length : ");
		int cuboidLength = input.nextInt();
		
		System.out.println("Enter the width : ");
		int cuboidWidth = input.nextInt();
		
		System.out.println("Enter the height : ");
		int cuboidHeight = input.nextInt();
		cuboidFigures.volume(cuboidLength, cuboidWidth, cuboidHeight);
		
		Figures cylinderFigures = new Cylinder();
		System.out.println("Enter the radius : ");
		int cylinderRadius = input.nextInt();
		System.out.println("Enter the height : ");
		int cylinderHeight = input.nextInt();
		cylinderFigures.volume(cylinderRadius, cylinderHeight, 0);
		
		Figures ovalFigures = new Oval();
		System.out.println("Enter the semi axis 1 : ");
		int ovalSemiAsis1 = input.nextInt();
		System.out.println("Enter the semi axis 2 : ");
		int ovalSemiAsis2 = input.nextInt();
		System.out.println("Enter the semi axis 3 : ");
		int ovalSemiAsis3 = input.nextInt();
		ovalFigures.volume(ovalSemiAsis1, ovalSemiAsis2, ovalSemiAsis3);
	}
}