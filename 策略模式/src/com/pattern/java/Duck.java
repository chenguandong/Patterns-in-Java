package com.pattern.java;

public class Duck {

	private  FlyBehavior flyBehavior;
	
	private QuackBehavior quackBehavior;
	
	//羽毛颜色
	protected void disPlay(){
		
	}
	
	//游泳
	protected void swim() {
		
	}
	
	public void performFly() {
		
		flyBehavior.fly();
	}
	
	public void performQuack() {
		
		quackBehavior.quack();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
