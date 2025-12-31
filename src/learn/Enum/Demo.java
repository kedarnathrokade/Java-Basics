package learn.Enum;

enum Laptop{
	
	Mackbook(2000), Elite(1000), thinpad(800), XPS;
	Laptop(){
		price = 600;
	}
	int price;
	Laptop(int price){
		
		this.price = price;
	}
	
}



public class Demo {

	public static void main(String[] args) {
		
		Laptop lap[] = Laptop.values();
		
		for(Laptop l : lap) {
			
			System.out.println(l+" : "+l.price);
		}
	}
}
