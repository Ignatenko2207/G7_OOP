package ua.com.qalight.model;

import ua.com.qalight.abstraction.AbstractShape;

public class Square extends AbstractShape{

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	
	public void getStrings() {
		System.out.println(super.protectedString);
		System.out.println(super.publicString);
	}
	
}
