package assignments;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex4 {
	
	Scanner sc = new Scanner(System.in);
	public void Q1() {
		System.out.print("Type some words: ");
		String input = sc.nextLine();
		System.out.println();
		System.out.println("Input: "+input);
		String[] words = input.split("\\s+");
		System.out.println("Word count in input: " + words.length);
	}
	
	public void Q2() {
		System.out.print("Type string 1: ");
		String s1 = sc.nextLine();
		System.out.println();
		System.out.print("Type string 2: ");
		String s2 = sc.nextLine();
		System.out.println("S1: " +s1 + "\tS2: "+ s2);
		System.out.println("S1 concat s2: " + s1.concat(s2));
	}
	
	public void Q3456() {
		
		//Q3
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		char[] c = name.toCharArray();
		if(!Character.isUpperCase(c[0])) {
			c[0] = Character.toUpperCase(c[0]);
		}
		System.out.println("Your name: " + String.valueOf(c));
		
		//Q4 Spell your name...
		int i=0; //...
		for(char x : c) {
			System.out.println("Character #" + (i+1) + " is: "+Character.toUpperCase(x));
			i++; 
		}
		
		//Q5
		System.out.print("Type your last name: ");
		String Lname = sc.nextLine();
		System.out.println("Your full name is: " + name + " " + Lname);
		
		//Q6 
		System.out.print("Type your full name: ");
		String fullname = sc.nextLine();
		String[] nameArr = fullname.split("\\s+");
		System.out.println("Your first name is: " + nameArr[0] );
		int nsize = nameArr.length;
		System.out.println("Your last name is: " + nameArr[nsize-1]);
		String dem_name="";
		for(int j=1; j< nsize-1;j++) {
			dem_name+= nameArr[j]+" ";
		}
		System.out.println("Your dem-name :D is: " + dem_name);
	}
	
	public String makeWordStartUpCase(String in) {
		String out="";
		
		char[] c = in.toCharArray();
		if(!Character.isUpperCase(c[0])) {
			c[0] = Character.toUpperCase(c[0]);
		}
		
		out = String.valueOf(c);
		return out;
		
	}
	
	private void onExit() {
		// TODO Auto-generated method stub
		sc.close();
	}

}
