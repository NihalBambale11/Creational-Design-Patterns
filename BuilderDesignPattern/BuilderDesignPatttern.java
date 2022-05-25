package BuilderDesignPattern;

public class BuilderDesignPatttern {

	public static void main(String[] args) {
		TV sonyold  = new Sony(new OldRemote());
		sonyold.on();
		sonyold.off();
		System.out.println();
		
		TV sonynew = new Sony(new NewRemote());
		sonynew.on();
		sonynew.off();
		System.out.println();

		
		TV samold = new Samsung(new OldRemote());
		samold.on();
		samold.off();
		System.out.println();

		
		TV samnew = new Samsung(new NewRemote());
		samnew.on();
		samnew.off();
		System.out.println();

		

	}

}
