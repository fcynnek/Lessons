package com.coderscampus.lesson2;

import java.io.Serializable;

public class CarFactory extends GenericFactory implements Serializable {
// extends can only extend to ONE class
// implements can extend multiple interfaces
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4546162754071415681L;
	// 	taking the object as it is and storing it so it could be recreate it at a later time
	public CarFactory () {
		this.totalCapacity =  1000;
	}
	
	@Override
	public Product build(Part[] parts) {
		Body body = null;
		Frame frame = null;
		Electronics electronics = null;
		
		for (Part part : parts) {
			if (part instanceof Electronics) {
				electronics = (Electronics) part;
			} else if (part instanceof Frame) {
				frame = (Frame) part;
			} else if (part instanceof Body) {
				body = (Body) part;
			}
		}
		
		if (body != null && frame != null && electronics != null) {
			Car car = new Car();
			car.setBody(body);
			car.setFrame(frame);
			car.setElectronics(electronics);
			return car;
		}
		return null; // returns not successfully built car
	}
	

}
