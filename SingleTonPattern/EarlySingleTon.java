package SingleTonPattern;



public class EarlySingleTon {
	
	private static EarlySingleTon l = new  EarlySingleTon();      	
	
	private EarlySingleTon(){
		
	}
	
	public static EarlySingleTon getOneObjectRef(){
		return l;

	}

}