package test.main;

public class Factory {
	 public static Pen getPen( ){
		  System.out.println("펜");
		  return new Pen( );
	}

}
