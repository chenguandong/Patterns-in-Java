package com.pattern.java;

public class ModeDuck extends Duck{

	@Override
	protected void disPlay() {
		// TODO Auto-generated method stub
		super.disPlay();
		
		System.out.println("Model 颜色鸭子");
	}
	
	@Override
	protected void swim() {
		// TODO Auto-generated method stub
		super.swim();
		
		System.out.println("Model 游泳");
	}
}
