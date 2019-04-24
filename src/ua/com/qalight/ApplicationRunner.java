package ua.com.qalight;

import ua.com.qalight.model.Square;

public class ApplicationRunner {
	
	public static void main(String[] args) {
	
		Square square1 = new Square();
		square1.setSide(10.0);
		
		Square square2 = new Square();
		square2.setSide(100.0);
		
		System.out.println(square1.getArea());
		System.out.println(square2.getArea());
		
	}

}
