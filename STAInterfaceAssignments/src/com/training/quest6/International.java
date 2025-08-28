package com.training.quest6;

public class International implements Cuisine{

	@Override
	public String[] showMenus(String type) {
		if(type.equalsIgnoreCase("starters")) {
			return new String[] {"Pasta", "Veg roll", "Momos"};
		}else if (type.equalsIgnoreCase("maincourse")) {
			return new String[] {"Pizza", "Chicken ramen", "Lasagne"};
		}else if (type.equalsIgnoreCase("dessert")) {
			return new String[] {"Cheese cake", "Tres leches", "Lava cake"};
		}else {
			return new String[]{"Invalid International Menu Choice"};
		}
	}
}
