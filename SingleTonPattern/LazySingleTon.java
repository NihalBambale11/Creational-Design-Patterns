package SingleTonPattern;

public class LazySingleTon {
	
	private static LazySingleTon l;   /// making a Instance without Declaring
	
	private LazySingleTon(){    //Making a Constructor as Private so no one can make Objects  	
		
	}
	
	public static LazySingleTon getOneObjectRef(){  ///A public Methods to make an object which Will First check the instance is null or not.
		if(l==null) {                                //////// nOw the Object will be Created .
			l=new LazySingleTon();
		}
		
		return l;  
	}

}