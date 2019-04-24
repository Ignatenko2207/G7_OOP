package ua.com.qalight.abstraction;

public abstract class AbstractShape implements Shape {
	
	private String privateString = "private string";
	String defaultString = "default string";
	protected String protectedString = "protected string";
	public String publicString = "public string";
	
	public abstract double getArea();

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}
	
	
	
}
