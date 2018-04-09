package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the nhanvien database table.
 * 
 */
@Entity
@Table(name="nhanvien")
@NamedQuery(name="Nhanvien.findAll", query="SELECT n FROM Nhanvien n")
public class Nhanvien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maNV;

	@Column(length=50)
	private String diaChi;

	@Column(length=50)
	private String email;

	@Column(length=250)
	private String ghiChu;

	@Column(length=11)
	private String sdt;

	@Column(length=30)
	private String tenNV;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="nhanvien")
	private List<Hoadon> hoadons;

	public Nhanvien() {
	}

	public int getMaNV() {
		return this.maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getTenNV() {
		return this.tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public List<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(List<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	public Hoadon addHoadon(Hoadon hoadon) {
		getHoadons().add(hoadon);
		hoadon.setNhanvien(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setNhanvien(null);

		return hoadon;
	}

}