package dangthuongngo.com.test;

import dangthuongngo.com.model.NhanVien;
import dangthuongngo.com.model.NhanVienChinhThuc;
import dangthuongngo.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc();
		teo.tinhLuong(25);
		NhanVienThoiVu ty =new  NhanVienThoiVu();
		ty.tinhLuong(25);
	}

}
