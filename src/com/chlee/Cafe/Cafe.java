package com.chlee.Cafe;

public class Cafe {

	public static void main(String[] args) {
		
		CoffeeType Coffee = CoffeeType.�Ƹ޸�ī��;
		System.out.println("Lee cafe�� ���Ű� ȯ���մϴ�.");
		CoffeeType coffeeTypes[] = CoffeeType.values();
		
		String menu = String.join("/",
				CoffeeType.ī���.toString(),
				CoffeeType.�÷�ȭ��Ʈ.toString(),
				CoffeeType.ī���ī.toString()
				);
		
		System.out.println(menu);
		String[] memus = menu.split("/");
}
}