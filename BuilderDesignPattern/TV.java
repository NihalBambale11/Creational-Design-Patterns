package BuilderDesignPattern;

public abstract class TV {
	
	Remote r ;
	
	TV(Remote r){
		this.r=r;
	}
	
	abstract void on();
	abstract void off();

}
