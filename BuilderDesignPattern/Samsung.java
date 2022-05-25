package BuilderDesignPattern;

public class Samsung extends TV {
	Remote rt;

	Samsung(Remote r) {
		super(r);
		this.rt=r;
	}

	@Override
	void on() {
		System.out.print("Samsung TV ON With-  ");
		rt.on();
	}

	@Override
	void off() {
		System.out.print("Samsung TV OFF With-  ");
		rt.off();
	}
	

}
