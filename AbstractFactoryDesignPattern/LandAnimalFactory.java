package AbstractFactoryDesignPattern;

public class LandAnimalFactory extends AnimalFactory {
	public Animal getAnimal(String animalType) {
		Animal animal = null;
		if("Dog".equalsIgnoreCase(animalType)) {
			animal = new Dog();
		}
		else if("Cat".equalsIgnoreCase(animalType)) {
			animal = new Cat();
		}
		return animal;
		
	}

}