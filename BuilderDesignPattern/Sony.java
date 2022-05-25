package BuilderDesignPattern;

public class Sony extends TV {
	Remote rt;

	Sony(Remote rt) {
		super(rt);
		this.rt=r;
		
	}

	@Override
	void on() {
		System.out.print("Sony TV ON With-  ");
		rt.on();
		
	}

	@Override
	void off() {
		System.out.print("Sony TV OFF With-  ");
		rt.off();
		
	}
	

}
