package profile;

public class Bird extends Animal{
	Bird(){
		super();
		System.out.println("A new bird has been created!");
	}
	
	@Override
	void sleep(){
		System.out.println("A bird sleeps...");
	}
	void eat(){
		System.out.println("A bird eats...");
	}
}
