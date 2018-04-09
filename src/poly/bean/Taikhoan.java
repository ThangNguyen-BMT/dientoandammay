package poly.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the taikhoan database table.
 * 
 */
@Entity
@Table(name="taikhoan")
@NamedQuery(name="Taikhoan.findAll", query="SELECT t FROM Taikhoan t")
public class Taikhoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maTaiKhoan;

	@Column(length=50)
	private String matKhau;

	@Column(length=50)
	private String tenDangNhap;

	@Column(length=50)
	private String trangThai;

	//bi-directional many-to-one association to Quyen
	@ManyToOne
	@JoinColumn(name="Quyen")
	private Quyen quyenBean;

	public Taikhoan() {
	}

	public int getMaTaiKhoan() {
		return this.maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Quyen getQuyenBean() {
		return this.quyenBean;
	}

	public void setQuyenBean(Quyen quyenBean) {
		this.quyenBean = quyenBean;
	}

}