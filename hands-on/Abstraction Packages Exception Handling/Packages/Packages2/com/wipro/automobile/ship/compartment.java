package com.wipro.automobile.ship;

public class compartment {
	double height;
    double width;
	double breadth;
	
	public compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public String display() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}

}
