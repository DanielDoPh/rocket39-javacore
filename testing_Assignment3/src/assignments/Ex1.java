package assignments;

import java.util.Random;
import java.util.Scanner;

import utils.ScannerUtils;



public class Ex1 {
	Scanner sc = new Scanner(System.in);
	public void Q1() {
		Account acc1 = new Account();
		Account acc2 = new Account();
		acc1.Luong = 5240f;
		acc2.Luong = 10970.055f;
		System.out.println("Luong 1 float: " + acc1.Luong);
		System.out.println("Luong 2 float: " + acc2.Luong);

		int intLuong1 = (int) acc1.Luong;
		int intLuong2 = (int) acc2.Luong;

		System.out.println("Luong 1 float to int: " + intLuong1);
		System.out.println("Luong 2 float to int: " + intLuong2);
	}

	public void Q2_Q3() {
		// Q2
		Random rd = new Random();
		int rdNum = rd.nextInt(0, 99999);
		System.out.println("Ori Num: " + rdNum);

		String numfmt = String.format("%05d", rdNum);
		System.out.println("Formated number: " + numfmt);
		// Q3
		String last2char = numfmt.substring(3, 5);
		System.out.println("Last 2 of rdNum: " + last2char);
	}

	public void Q4() {
		System.out.println("Input an integer a: ");
		int a = ScannerUtils.inputInt();
		System.out.println("Input an integer b: ");
		int b = ScannerUtils.inputInt();
		
		float c= (float) a/b;

		System.out.printf("\n%s %.2f", "a / b = ", c);
	}
}

class Account {

	float Luong;
	String ten;
}