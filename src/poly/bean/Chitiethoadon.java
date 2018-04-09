package poly.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitiethoadon database table.
 * 
 */
@Entity
@Table(name="chitiethoadon")
@NamedQuery(name="Chitiethoadon.findAll", query="SELECT c FROM Chitiethoadon c")
public class Chitiethoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maCTHD;

	@Column(length=255)
	private String ghiChu;

	private int soLuong;

	private float thanhTien;

	//bi-directional many-to-one association to Hoadon
	@ManyToOne
	@JoinColumn(name="MaHD")
	private Hoadon hoadon;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne
	@JoinColumn(name="MaSP")
	private Sanpham sanpham;

	public Chitiethoadon() {
	}

	public int getMaCTHD() {
		return this.maCTHD;
	}

	public void setMaCTHD(int maCTHD) {
		this.maCTHD = maCTHD;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getThanhTien() {
		return this.thanhTien;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

}