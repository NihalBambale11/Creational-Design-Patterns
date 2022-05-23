package AbstractFactoryDesignPattern;

import java.util.Scanner;

//import factory.AnimalFactory;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		String Str = null;
		String str = null;
		System.out.println("Enter the AnimalFactory ");
		Str = scan.nextLine();
		
		System.out.println("Enter the Animal");
		str = scan.nextLine();
		
		Animal animal = null;
		AnimalFactory animalFactory = null;
		
		animalFactory = animalFactory.getAnimalFactory(Str);
		animal = animalFactory.getAnimal(str); //sea
		
		System.out.println(animalFactory.getClass().getName());
		System.out.println(str+" Speaks "+animal.Speak());
		

	}

}
