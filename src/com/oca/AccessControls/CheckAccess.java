package com.oca.AccessControls;
import com.oca.AccessControls.package2.*;

public class CheckAccess {
	
    
	public static void main(String...strings ) {

		SubClass sub = new SubClass();
		SuperClass sup = new SuperClass();
		
		sub = (SubClass) sup;
		
		
		
	}

}



class SubClass extends SuperClass {
	
}
