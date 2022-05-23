package FactoryDesignPattern;
import java.util.Scanner;
//import Factory.AnimalFactory;

public class FactoryDesignPatttern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String Str = null;
		System.out.println("Enter the Animal ");
		Str = scan.nextLine();
		 
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.getAnimal(Str);
		
		System.out.println(Str+" Speaks "+animal.speak());
	}

}
