package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sanpham database table.
 * 
 */
@Entity
@Table(name="sanpham")
@NamedQuery(name="Sanpham.findAll", query="SELECT s FROM Sanpham s")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maSP;

	@Column(length=250)
	private String donViTinh;

	private int giaBan;

	private int giaNhap;

	private int soLuong;

	@Column(length=50)
	private String tenSP;

	@Column(length=11)
	private String xuatXu;

	//bi-directional many-to-one association to Chitiethoadon
	@OneToMany(mappedBy="sanpham")
	private List<Chitiethoadon> chitiethoadons;

	//bi-directional many-to-one association to Giohang
	@OneToMany(mappedBy="sanpham")
	private List<Giohang> giohangs;

	//bi-directional many-to-one association to Loaisanpham
	@ManyToOne
	@JoinColumn(name="MaLoai")
	private Loaisanpham loaisanpham;

	public Sanpham() {
	}

	public int getMaSP() {
		return this.maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getDonViTinh() {
		return this.donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public int getGiaBan() {
		return this.giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public int getGiaNhap() {
		return this.giaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenSP() {
		return this.tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getXuatXu() {
		return this.xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public List<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(List<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	public Chitiethoadon addChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().add(chitiethoadon);
		chitiethoadon.setSanpham(this);

		return chitiethoadon;
	}

	public Chitiethoadon removeChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().remove(chitiethoadon);
		chitiethoadon.setSanpham(null);

		return chitiethoadon;
	}

	public List<Giohang> getGiohangs() {
		return this.giohangs;
	}

	public void setGiohangs(List<Giohang> giohangs) {
		this.giohangs = giohangs;
	}

	public Giohang addGiohang(Giohang giohang) {
		getGiohangs().add(giohang);
		giohang.setSanpham(this);

		return giohang;
	}

	public Giohang removeGiohang(Giohang giohang) {
		getGiohangs().remove(giohang);
		giohang.setSanpham(null);

		return giohang;
	}

	public Loaisanpham getLoaisanpham() {
		return this.loaisanpham;
	}

	public void setLoaisanpham(Loaisanpham loaisanpham) {
		this.loaisanpham = loaisanpham;
	}

}