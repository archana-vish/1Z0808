package com.oca.interfaces;

public class TestDefaultMethods implements Moveable, Jumpable {

	@Override
	public void changePostion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String changePostion(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePositionDefault() {
		// TODO Auto-generated method stub
		Jumpable.super.changePositionDefault();
	}

}

