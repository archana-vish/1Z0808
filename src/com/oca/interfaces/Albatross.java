package com.oca.interfaces;

abstract class SeaBird {
	public abstract void fly(int height);
}

public interface Albatross {
	 abstract Long fly();
}

class babyAlbatross implements Albatross {
	public Long fly() {return 1l;}
	
	
}
