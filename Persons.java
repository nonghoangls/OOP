package inherit;

public class Persons {

	protected String name;
	protected int age;
	protected float height;
	
	public Persons(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void drive() {
		System.out.println("Drive Lamborghini Aventador Super Star Galaxy Smart Ultra");
		
	}
	
	
}
