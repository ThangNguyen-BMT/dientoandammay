package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the khachhang database table.
 * 
 */
@Entity
@Table(name="khachhang")
@NamedQuery(name="Khachhang.findAll", query="SELECT k FROM Khachhang k")
public class Khachhang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maKH;

	@Column(length=50)
	private String diaChi;

	@Column(length=50)
	private String email;

	@Column(length=250)
	private String ghiChu;

	@Column(length=11)
	private String sdt;

	@Column(length=30)
	private String tenKH;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="khachhang")
	private List<Hoadon> hoadons;

	public Khachhang() {
	}

	public int getMaKH() {
		return this.maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
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

	public String getTenKH() {
		return this.tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public List<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(List<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	public Hoadon addHoadon(Hoadon hoadon) {
		getHoadons().add(hoadon);
		hoadon.setKhachhang(this);

		return hoadon;
	}

	public Hoadon removeHoadon(Hoadon hoadon) {
		getHoadons().remove(hoadon);
		hoadon.setKhachhang(null);

		return hoadon;
	}

}