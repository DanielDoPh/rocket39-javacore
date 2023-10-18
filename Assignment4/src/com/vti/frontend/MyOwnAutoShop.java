package com.vti.frontend;

import java.util.ArrayList;

import com.vti.model.Car;
import com.vti.model.Ford;
import com.vti.model.Sedan;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car sed1 = new Sedan(250,50000,"Black",18);
		
		
		Car ford1 = new Ford(200,25000,"Cement",2022,500);
		Car ford2 = new Ford(220,30000,"White Gray",2021,700);
		
		Car car1 = new Car(380,100000,"Myth");
		
		ArrayList<Car> cars= new ArrayList<Car>();
		
		cars.add(sed1);
		cars.add(ford1);
		cars.add(ford2);
		cars.add(car1);
		
		for(Car c : cars) {
			System.out.println("Sale price: "+c.getSalePrice());
		}
	}

}
