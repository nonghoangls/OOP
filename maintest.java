package inherit;

public class maintest {

	public static void main(String[] args) {
		Vietnampeople vn = new Vietnampeople("Hoang ngu", 20, 1.6f);
		USApeople usa = new USApeople("Joe Biden", 80, 1.85f);
		
		vn.communicate();
		usa.communicate();
		vn.drive();
		
	}
	
	
	
}
