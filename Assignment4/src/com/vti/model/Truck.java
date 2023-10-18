package com.vti.model;

public class Truck extends Car {
	private int weight;

	public Truck() {
		super();
	}

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		double discount = 0;
		if (this.weight > 2000)
			discount = this.getRegularPrice() / 10;
		else
			discount = this.getRegularPrice() / 5;

		return this.getRegularPrice() - discount;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
