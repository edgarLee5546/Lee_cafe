package CoffeeType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		CoffeeType coffees = CoffeeType.아메리카노;
		System.out.println("Lee cafe에 오신걸 환영합니다.");
		CoffeeType coffeeTypes[] = CoffeeType.values();

		String menu = String.join("/", 
				CoffeeType.카페라떼.toString(), 
				CoffeeType.플랫화이트.toString(),
				CoffeeType.카푸치노.toString(),
				CoffeeType.아메리카노.toString(),
				CoffeeType.카페모카.toString());
				
		System.out.println(menu);
        int idx = LocalDate.now().getDayOfYear() % coffeeTypes.length;
		String weekDay = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("E")
				.withLocale(Locale.KOREAN));
		System.out.println(weekDay + "요일 스페셜: " + coffeeTypes[idx]);
		
		
		System.out.println("원하는 커피 종류");
		
		Scanner scanner = new Scanner(System.in);
		int 제품번호 = scanner.nextInt();
        System.out.println("제품번호" + 제품번호 + "를 선택하셨습니다.");
        scanner.close();
		
		String[] menus = menu.split("/");
		return;
	}
}