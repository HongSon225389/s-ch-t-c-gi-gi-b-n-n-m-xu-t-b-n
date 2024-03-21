package sach;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sach t1 = new Sach();
		System.out.println("Ten sach : ");
		t1.setTenSach(sc.nextLine());
		System.out.println("Tac gia : ");
		t1.setTacGia(sc.nextLine());
		System.out.println("Gia sach : ");
		t1.setGiaBan(sc.nextDouble());
		System.out.println("Nam xuat ban : ");
		t1.setNamXuatBan(sc.nextInt());
		System.out.println("Ngay sinh");
		TacGia t2 = new TacGia(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Nhap ngay thang xuat ban : ");
		Ngay t3 = new Ngay(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Thong tin :");
		t1.tt1();
		t2.tt2();
		t3.tt3();
	}
}
