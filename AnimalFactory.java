package FactoryDesignPattern;

public class AnimalFactory {
	public Animal getAnimal(String animalType) {
		Animal animal = null;
		
		if(animalType.equalsIgnoreCase("dog")) {
			animal = new Dog();
		}
		else if(animalType.equalsIgnoreCase("cat")) {
			animal = new Cat();
		}
		else if(animalType.equalsIgnoreCase("duck")) {
			animal = new Duck();
		}
		return animal;
	}

}
