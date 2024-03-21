package sach;

public class Sach {
	private String tenSach;
	private String tacGia;
	private double giaBan;
	private int namXuatBan;

/*	public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}*/
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	
	public void tt1() {
		System.out.println("Ten sach : "+tenSach);
		System.out.println("Tac gia : "+tacGia);
		System.out.println("Nam xuat ban : "+namXuatBan);
		System.out.println("Gia ban : "+giaBan);
	}
}
