import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class lapt{
	public static void main(String[] args)throws Exception{
		laptops laptop_one = new laptops("DEXP", "Aquilon", "Чёрный", "Windows 11", "Western Digital", 256, "DDR4", 8);
		laptops laptop_two = new laptops("IRBIS", "NB290", "Чёрный", "Windpws 10", "Transcend", 256, "DDR4", 16);
		laptops laptop_three = new laptops("ASUS", "Vivobook Go 15", "Серебристый", "No-OS", "Western Digital", 256, "DDR4", 8);
		laptops laptop_four = new laptops("MSI", "Modern 14", "Чёрный", "No-OS", "Kingston", 256, "DDR4", 16);
		laptops laptop_five = new laptops("Acer", "Aspire 5", "Серый", "Windows 11", "Kingston", 256, "DDR4", 8);
		laptops laptop_six = new laptops("Apple", "MacBook Air", "Золотистый", "macOS", "Apple", 256, "DDR4", 8);
		laptops laptop_seven = laptop_one;
		Set<laptops>unic_laptops = new HashSet<laptops>();
		unic_laptops.add(laptop_one);
		unic_laptops.add(laptop_two);
		unic_laptops.add(laptop_three);
		unic_laptops.add(laptop_four);
		unic_laptops.add(laptop_five);
		unic_laptops.add(laptop_six);
		unic_laptops.add(laptop_seven);
		System.out.printf("Перый ноутбук идентичен седьмому: %b \n", laptop_one.equals(laptop_seven));
		System.out.printf("Всего уникальных ноутбуков: %d \n", unic_laptops.size());
		Map<Integer, String> map_choice = new HashMap<>();
		map_choice.put(1, "Производитель");
		map_choice.put(2, "Модель");
		map_choice.put(3, "Цвет");
		map_choice.put(4, "Операционная система");
		map_choice.put(5, "Производитель HDD");
		map_choice.put(6, "Объём HDD");
		map_choice.put(7, "Тип RAM");
		map_choice.put(8, "Объём RAM");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите характеристики: Производитель");
		String manuf_user = sc.nextString();
		System.out.println("Модель");
		String model_user = sc.nextString();
		System.out.println("Цвет");
		String color_user = sc.nextString();
		System.out.println("Операционная система");
		String color_user = sc.nextString();
		System.out.println("Производитель HDD");
		String hdd_manuf_user = sc.nextString();
		System.out.println("Объём HDD");
		int hdd_size_user = sc.nextInt();
		System.out.println("Тип RAM");
		String ram_type_user = sc.nextString();
		System.out.println("Объём RAM");
		int ram_size_user = sc.nextInt();
		for (laptops lap: uniclaptops){
			if((lap.get_hdd_size() >= hdd_size_user) && (lap.get_ram_size() >= ram_size_user){
				System.out.println(lap.toString());
				System.out.println();
			}
		}
		sc.close();
	}
}