package com.vti.model;

public class Sedan extends Car {
	private int lenght;

	public Sedan() {
		super();
	}

	public Sedan(int speed, double regularPrice, String color, int lenght) {
		super(speed, regularPrice, color);
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		double discount = 0;
		if (this.lenght > 20)
			discount = this.getRegularPrice() / 20;
		else
			discount = this.getRegularPrice() / 10;

		return this.getRegularPrice() - discount;
	}

}
