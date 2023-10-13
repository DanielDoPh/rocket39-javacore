package hmm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ProgramEx2 {

	static ArrayList<String> HoTen = new ArrayList<String>();
	static ArrayList<String> ID = new ArrayList<String>();
	static ArrayList<String> BD = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Ho = { "Nguyen", "Ly", "Le", "Phan", "Pham", "Hoang", "Phung" };
		String[] TenDem = { "Van", "Thi", "Quoc", "Minh", "Thanh", "Hoai", "Tien" };
		String[] Ten = { "Co", "Cai", "Ten", "Nao", "Dep", "Hay", "Khong" };
		Random rd = new Random();
		for (int i = 0; i < 10;) {
			int x = (int) rd.nextInt(0, 7);
			int y = (int) rd.nextInt(0, 7);
			int z = (int) rd.nextInt(0, 7);
			String temp = Ho[x] + " " + TenDem[y] + " " + Ten[z];

			if(HoTen.contains(temp))
				continue;
			else {
				HoTen.add(temp);
				i++;
			}
		}
		
		// Add ID :D
		for (int i = 0; i < 10;) {

			String temp = "SV"+ rd.nextInt(1000000,9999999);
			if(ID.contains(temp))
				continue;
			else {
				ID.add(temp);
				i++;
			}
		}
		
		//Add BD (Random date 1999-02-01  and 1999-12-31
//		Date date = new Date();
//		System.out.println(date);
//		System.out.printf("%td-%<tm-%<tY", date);
		//Print
		System.out.printf("\n%s\t %-20s\t %-12s\t %s\n","STT", "Ho Ten", "MSV", "Ngay sinh");
		System.out.println("==============================");
		for (int i = 0; i < 10;i++) {
			System.out.printf("%d\t %-20s\t %-12s\t %td-%<tm-%<tY\n", i+1, HoTen.get(i), ID.get(i), new Date() /*BD.get(i)*/);
		}
	}


	class SV {

		String HoTen, ID;
		Date BD;
	}

}
