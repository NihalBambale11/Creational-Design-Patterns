package BuilderDesignPattern;

public class NewRemote implements Remote {

	@Override
	public void on() {
		System.out.println("New Remote");
	}

	@Override
	public void off() {
		System.out.println("New Remote");
		
	}

}
