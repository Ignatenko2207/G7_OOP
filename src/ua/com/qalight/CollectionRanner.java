package ua.com.qalight;

import ua.com.qalight.model.Circle;

public class CollectionRanner {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		circle1.setRadius(10);
		
		
		Circle circle2 = new Circle();
		circle2.setRadius(100);
		
		
		System.out.println(circle1.getArea());
		System.out.println(circle2.getArea());
	}

}
