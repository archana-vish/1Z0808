package com.oca.constructors;

public class AccessLevels {
	
	public AccessLevels() {}
	
	//public final AccessLevels(String name) {}
	
	private AccessLevels(String mod1) {}
	
	protected AccessLevels(int mod2) {
		
		String name = "Shre/*" 
					+ "*/ya";
	}

}
