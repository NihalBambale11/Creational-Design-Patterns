package AbstractFactoryDesignPattern;

//import factory.LandAnimalFactory;
//import factory.SeaAnimalFactory;

public abstract class AnimalFactory {
	public abstract Animal getAnimal(String animalType);
	
	public static AnimalFactory getAnimalFactory(String factoryType) {
		AnimalFactory animalFactory = null;
		if("sea".equalsIgnoreCase(factoryType)) {
			animalFactory = new SeaAnimalFactory();
		}
		else {
			animalFactory = new LandAnimalFactory();
		}
		
		return animalFactory;
	}
}



