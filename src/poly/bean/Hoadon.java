package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the hoadon database table.
 * 
 */
@Entity
@Table(name="hoadon")
@NamedQuery(name="Hoadon.findAll", query="SELECT h FROM Hoadon h")
public class Hoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maHD;

	@Column(length=250)
	private String ghiChu;

	@Temporal(TemporalType.DATE)
	private Date ngayTao;

	private int soHD;

	private float tongTien;

	//bi-directional many-to-one association to Chitiethoadon
	@OneToMany(mappedBy="hoadon")
	private List<Chitiethoadon> chitiethoadons;

	//bi-directional many-to-one association to Khachhang
	@ManyToOne
	@JoinColumn(name="MaKH")
	private Khachhang khachhang;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne
	@JoinColumn(name="MaNV")
	private Nhanvien nhanvien;

	public Hoadon() {
	}

	public int getMaHD() {
		return this.maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public int getSoHD() {
		return this.soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public float getTongTien() {
		return this.tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public List<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(List<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	public Chitiethoadon addChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().add(chitiethoadon);
		chitiethoadon.setHoadon(this);

		return chitiethoadon;
	}

	public Chitiethoadon removeChitiethoadon(Chitiethoadon chitiethoadon) {
		getChitiethoadons().remove(chitiethoadon);
		chitiethoadon.setHoadon(null);

		return chitiethoadon;
	}

	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

}