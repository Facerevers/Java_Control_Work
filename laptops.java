public class laptops{
	private String laptop_manufacturer;
	private String laptop_model;
	private String laptop_color;
	private String os_name;
	private String hdd_manufacturer;
	private int hdd_size;
	private String ram_type;
	private int ram_size;
	
	public laptops(String laptop_manufacturer, String laptop_model, String laptop_color, String os_name, String hdd_manufacturer, int hdd_size, String ram_type,  int ram_size){
		this.laptop_manufacturer = laptop_manufacturer;
		this.laptop_model = laptop_model;
		this.laptop_color = laptop_color;
		this.os_name = os_name;
		this.hdd_manufacturer = hdd_manufacturer;
		this.hdd_size = hdd_size;
		this.ram_type = ram_type;
		this.ram_size = ram_size;
	}
	@Override
	public String toString(){
		String res = "";
		res += "Производитель: " + laptop_manufacturer + "\n";
		res += "Модель: " + laptop_model + "\n";
		res += "Цвет: " + laptop_color + "\n";
		res += "Операционная система: " + os_name + "\n";
		res += "Производитель HDD: " + hdd_manufacturer + "\n";
		res += "Объём HDD: " + hdd_size + "\n";
		res += "Тип RAM: " + ram_type + "\n";
		res += "Объём RAM:" + ram_size + "\n";
		return res;
	}
	@Override
	public boolean equeal(Object obj){
		if (obj instanceof laptops){
			return this.laptop_manufacturer(((laptops)obj).laptop_manufacturer) && this.laptop_model ==((laptops)obj).laptop_model && this.laptop_color == ((laptops)obj).laptop_color && this.os_name == ((laptops)obj).os_name && this.hdd_manufacturer ==((laptops)obj).hdd_manufacturer && this.hdd_size == ((laptops)obj).hdd_size && this.ram_type == ((laptops)obj).ram_type && this.ram_size == ((laptops)obj).ram_size);
		}
		return false;
	}
	public String get_manufacturer(){
		return this.laptop_manufacturer;
	}
	public String get_model(){
		return this.laptop_model;
	}
	public String get_color(){
		return this.laptop_color;
	}
	public String get_os(){
		return this.os_name;
	}
	public String get_hdd_manuf(){
		return this.hdd_manufacturer;
	}
	public int get_hdd_size(){
		return this.hdd_size;
	}
	public String get_ram_type(){
		return this.ram_type;
	}
	public int get_ram_size(){
		return this.ram_size;
	}
}