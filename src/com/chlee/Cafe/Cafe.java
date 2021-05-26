package com.chlee.Cafe;

public class Cafe {

	public static void main(String[] args) {
<<<<<<< HEAD
		CoffeeType Coffee = CoffeeType.ì•„ë©”ë¦¬ì¹´ë…¸;
		System.out.println("Lee cafeì— ì˜¤ì‹ ê±¸ í™˜ì˜í•©ë‹ˆë‹¤.");
		CoffeeType coffeeTypes[] = CoffeeType.values();
		
		String menu = String.join("/",
				CoffeeType.ì¹´íŽ˜ë¼ë–¼.toString(),
				CoffeeType.í”Œëž«í™”ì´íŠ¸.toString(),
				CoffeeType.ì¹´íŽ˜ëª¨ì¹´.toString()
=======
		
		CoffeeType Coffee = CoffeeType.¾Æ¸Þ¸®Ä«³ë;
		System.out.println("Lee cafe¿¡ ¿À½Å°É È¯¿µÇÕ´Ï´Ù.");
		CoffeeType coffeeTypes[] = CoffeeType.values();
		
		String menu = String.join("/",
				CoffeeType.Ä«Æä¶ó¶¼.toString(),
				CoffeeType.ÇÃ·§È­ÀÌÆ®.toString(),
				CoffeeType.Ä«Æä¸ðÄ«.toString()
>>>>>>> 09599347ceab841ab1d50e71329425487b49b595
				);
		
		System.out.println(menu);
		String[] memus = menu.split("/");
}
}