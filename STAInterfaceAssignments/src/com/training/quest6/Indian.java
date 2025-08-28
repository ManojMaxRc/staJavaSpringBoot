package com.training.quest6;

public class Indian implements Cuisine{

	@Override
	public String[] showMenus(String type) {
		if(type.equalsIgnoreCase("starters")) {
			return new String[] {"Dragon chicken", "Corn fry", "Chicken french fries"};
		}else if (type.equalsIgnoreCase("maincourse")) {
			return new String[] {"Biriyani", "Ghee rice", "Non veg meals"};
		}else if (type.equalsIgnoreCase("dessert")) {
			return new String[] {"Gulab jamun", "Tender coconut milkshake", "Rasa gulla"};
		}else {
			return new String[]{"Invalid Indian Menu Choice"};
		}
	}
}
