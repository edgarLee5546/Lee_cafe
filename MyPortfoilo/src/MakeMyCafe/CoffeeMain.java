package MakeMyCafe;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		CoffeeType coffees = CoffeeType.�Ƹ޸�ī��;
		System.out.println("Lee cafe�� ���Ű� ȯ���մϴ�.");
		CoffeeType coffeeTypes[] = CoffeeType.values();

		String menu = String.join("/", 
				CoffeeType.ī���.toString(), 
				CoffeeType.�÷�ȭ��Ʈ.toString(),
				CoffeeType.īǪġ��.toString(),
				CoffeeType.�Ƹ޸�ī��.toString(),
				CoffeeType.ī���ī.toString());
				cccc
		System.out.println(menu);
        int idx = LocalDate.now().getDayOfYear() % coffeeTypes.length;
		String weekDay = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("E")
				.withLocale(Locale.KOREAN));
		System.out.println(weekDay + "���� �����: " + coffeeTypes[idx]);
		
		
		System.out.println("���ϴ� Ŀ�� ����");
		
		Scanner scanner = new Scanner(System.in);
		int ��ǰ��ȣ = scanner.nextInt();
        System.out.println("��ǰ��ȣ" + ��ǰ��ȣ + "�� �����ϼ̽��ϴ�.");
        scanner.close();
		
		String[] menus = menu.split("/");
		return;
	}
}