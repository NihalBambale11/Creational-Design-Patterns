package AbstractFactoryDesignPattern;

public class SeaAnimalFactory extends AnimalFactory {
	public Animal getAnimal(String animalType) {
		Animal animal = null;
		if("duck".equalsIgnoreCase(animalType)) {
			animal = new Duck();
		}
		else if("octopus".equalsIgnoreCase(animalType)) {
			animal = new Octopus();
		}
		else if("shark".equalsIgnoreCase(animalType)) {
			animal = new Shark();
		}
		return animal;
		
	}

}
