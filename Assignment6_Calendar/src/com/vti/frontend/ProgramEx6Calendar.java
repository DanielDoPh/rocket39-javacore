package com.vti.frontend;

import java.util.ArrayList;
import java.util.Date;

import com.vti.model.User;
import com.vti.utils.ScannerUtils;

public class ProgramEx6Calendar {
	private static ArrayList<User> listUser = new ArrayList<User>();
	private static boolean isLoggedIn = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		
		int key; 
		while(true) {
			showMenu();
			key = ScannerUtils.inputInt();
			if(key==1) {
				login();
			}
			else if(key ==2 ) {
				createAccount();
			}
			else if(key ==3 ) {
				getNowDate();
			}
			else if(key ==4 ) {
				changeDate();
			}
			else if(key ==5 ) {
				showAccount();
			}
			else if(key ==6 ) {
				System.out.println("Quited! :D");
				break;
			}
			
		}
	}

	private static void showAccount() {
		// TODO Auto-generated method stub
		if(isLoggedIn) {
			System.out.println("Thông tin account: " + listUser.get(0).toString());
		}
		else {
			System.out.println("Cần đăng nhập để sử dụng chức năng này!");
		}
	}

	private static void changeDate() {
		// TODO Auto-generated method stub
		if(isLoggedIn) {
			Date d = new Date();
			System.out.printf("\n%s %tB %<te, %<tY\n", "Ngày hiện tại là: ", d);
			System.out.printf("\n%s %tB %<te, %<tY\n", "Ngày âm lịch là: ", d);
		}
		else {
			System.out.println("Cần đăng nhập để sử dụng chức năng này!");
		}
	}

	private static void getNowDate() {
		// TODO Auto-generated method stub
		if(isLoggedIn) {
			Date d = new Date();
			System.out.printf("\n%s %tB %<te, %<tY\n", "Ngày hiện tại là: ", d);
		}
		else {
			System.out.println("Cần đăng nhập để sử dụng chức năng này!");
		}
		
	}

	private static void createAccount() {
		// TODO Auto-generated method stub
		User u = new User();
		System.out.println("Nhập thông tin account: ");
		System.out.print("User name: ");
		String username = ScannerUtils.inputString("Nhap lai Username!");
		u.setUserName(username);
		
		System.out.print("\nFull name: ");
		String fullname = ScannerUtils.inputString("Nhap lai Full name!");
		u.setFullName(fullname);
		
		int ID= listUser.size()+1;
		u.setID(ID);
		Date d = new Date();
		u.setJoinDate(d);
		
		listUser.add(u);
		System.out.println("Tao account thanh cong");
		
	}

	public static void showMenu() {

		System.out.println("Lịch Vạn Niên");
		if (isLoggedIn) {
			System.out.println("\t1. Đăng nhập");
			System.out.println("\t2. Tạo Account");
			System.out.println("\t3. Xem ngày hiện tại");
			System.out.println("\t4. Đổi lịch dương sang lịch âm");
			System.out.println("\t5. Xem thông tin Account");
			System.out.println("\t6. Quit");
		} else {
			System.out.println("\t1. Đăng nhập");
			System.out.println("\t2. Tạo Account");
			System.out.println("\t3. Xem ngày hiện tại (login required)");
			System.out.println("\t4. Đổi lịch dương sang lịch âm (login required)");
			System.out.println("\t5. Xem thông tin Account (login required)");
			System.out.println("\t6. Quit");
		}

	}

	public static void login() {
		System.out.println("User name: ");
		String username = ScannerUtils.inputString("User name: ");
		User u = new User(username);
		if (listUser.contains(u)) {
			System.out.println("Đăng nhập thành công!");
			isLoggedIn=true;
			
		} else {
			System.out.println("Đăng nhập thất bại!");
			
		}
	}

}
