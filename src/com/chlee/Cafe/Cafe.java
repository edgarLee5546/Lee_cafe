package com.chlee.Cafe;

public class Cafe {

	public static void main(String[] args) {
<<<<<<< HEAD
		CoffeeType Coffee = CoffeeType.아메리카노;
		System.out.println("Lee cafe에 오신걸 환영합니다.");
		CoffeeType coffeeTypes[] = CoffeeType.values();
		
		String menu = String.join("/",
				CoffeeType.카페라떼.toString(),
				CoffeeType.플랫화이트.toString(),
				CoffeeType.카페모카.toString()
=======
		
		CoffeeType Coffee = CoffeeType.�Ƹ޸�ī��;
		System.out.println("Lee cafe�� ���Ű� ȯ���մϴ�.");
		CoffeeType coffeeTypes[] = CoffeeType.values();
		
		String menu = String.join("/",
				CoffeeType.ī���.toString(),
				CoffeeType.�÷�ȭ��Ʈ.toString(),
				CoffeeType.ī���ī.toString()
>>>>>>> 09599347ceab841ab1d50e71329425487b49b595
				);
		
		System.out.println(menu);
		String[] memus = menu.split("/");
}
}