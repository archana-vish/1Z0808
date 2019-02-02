package com.oca.lamdas;

public class MyAnimalChecker implements TestAnimal  {

	@Override
	public boolean check(Animal a) {
		// TODO Auto-generated method stub
		if (a.canSwim()) 
			return true;
		else
			return false;
	}

	
}
