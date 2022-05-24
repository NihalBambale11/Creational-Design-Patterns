package SingleTonPattern;

public class SingleTonDemo1 {

	public static void main(String[] args) {
		EarlySingleTon est1 = EarlySingleTon.getOneObjectRef();
		EarlySingleTon est2 = EarlySingleTon.getOneObjectRef();
		EarlySingleTon est3 = EarlySingleTon.getOneObjectRef();
		
		System.out.println(est1);
		System.out.println(est2);
		System.out.println(est3);
	}

}
