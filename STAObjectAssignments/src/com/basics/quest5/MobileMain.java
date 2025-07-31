package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile("Galaxy S25 Ultra", "Samsung", "Black");
		
		Mobile mobile2 = new Mobile("Iphone 17 Pro", "Apple", "Orange");
		
		Mobile mobile3 = new Mobile("13", "Oneplus", "Blue");
		
		Mobile mobile4 = new Mobile("Phone 2", "Nothing", "Red");
		
		Mobile mobile5 = new Mobile("GT Pro", "Realme", "White");
		
		Mobile[] mobiles = new Mobile[5];
		mobiles[0] = mobile1;
		mobiles[1] = mobile2;
		mobiles[2] = mobile3;
		mobiles[3] = mobile4;
		mobiles[4] = mobile5;
		
		for (Mobile mobile : mobiles) {
			mobile.getDetails();
		}
		
		for (int i = 0; i < mobiles.length; i++) {
			if(mobiles[i].brand.trim().equalsIgnoreCase("Samsung")) {
			mobiles[i].getDetails();
			}
		}
	}

}
