package sach;

public class TacGia {
	private String tenTacGia;
	private int ngaysinh;
	private int thangsinh;
	private int namsinh;
	
	public TacGia(int ngaysinh, int thangsinh, int namsinh) {
		this.ngaysinh = ngaysinh;
		this.thangsinh = thangsinh;
		this.namsinh=namsinh;
	} 
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	
	public int getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(int ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public int getThangsinh() {
		return thangsinh;
	}
	public void setThangsinh(int thangsinh) {
		this.thangsinh = thangsinh;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public void tt2() {
		System.out.println("Ngay sinh : "+ngaysinh +"/"+thangsinh+"/"+namsinh);
		
	}
}
