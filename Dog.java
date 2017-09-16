package profile;

public class Dog extends Animal{
	Dog(){
		super();
		System.out.println("A new dog has been created!");
	}
	
	@Override
	void sleep(){
		System.out.println("A dog sleeps...");
	}
	void eat(){
		System.out.println("A dog eats...");
	}

}
