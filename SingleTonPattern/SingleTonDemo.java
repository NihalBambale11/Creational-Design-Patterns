package SingleTonPattern;

public class SingleTonDemo {

	public static void main(String[] args) {
		LazySingleTon lst1 = LazySingleTon.getOneObjectRef();
		LazySingleTon lst2 = LazySingleTon.getOneObjectRef();
		LazySingleTon lst3 = LazySingleTon.getOneObjectRef();
		
		
		System.out.println(lst1);
		System.out.println(lst2);
        System.out.println(lst3); 
	}

}
