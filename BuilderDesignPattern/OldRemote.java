package BuilderDesignPattern;

public class OldRemote implements Remote {

	@Override
	public void on() {
		System.out.println("Old Remote");
	}

	@Override
	public void off() {
		System.out.println("Old Remote");
		
	}
	

}
