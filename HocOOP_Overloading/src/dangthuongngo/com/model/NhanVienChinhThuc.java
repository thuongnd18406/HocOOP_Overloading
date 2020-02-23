package dangthuongngo.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public void tinhLuong(int ngayCong) {
		// TODO Auto-generated method stub
		if(ngayCong<20)
			System.out.println("5Trien");
		else
			System.out.println("20Trieu");
	}
}