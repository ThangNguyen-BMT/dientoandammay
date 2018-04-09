package poly.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the giohang database table.
 * 
 */
@Entity
@Table(name="giohang")
@NamedQuery(name="Giohang.findAll", query="SELECT g FROM Giohang g")
public class Giohang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maGioHang;

	@Column(length=255)
	private String ghiChu;

	private int gia;

	private int soLuong;

	private int tenSP;

	private float thanhTien;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne
	@JoinColumn(name="MaSP")
	private Sanpham sanpham;

	public Giohang() {
	}

	public int getMaGioHang() {
		return this.maGioHang;
	}

	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getGia() {
		return this.gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getTenSP() {
		return this.tenSP;
	}

	public void setTenSP(int tenSP) {
		this.tenSP = tenSP;
	}

	public float getThanhTien() {
		return this.thanhTien;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

}