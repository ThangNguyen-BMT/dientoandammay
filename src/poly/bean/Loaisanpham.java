package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaisanpham database table.
 * 
 */
@Entity
@Table(name="loaisanpham")
@NamedQuery(name="Loaisanpham.findAll", query="SELECT l FROM Loaisanpham l")
public class Loaisanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=30)
	private String maLoai;

	@Column(length=50)
	private String ghiChu;

	@Column(length=50)
	private String tenLoai;

	//bi-directional many-to-one association to Sanpham
	@OneToMany(mappedBy="loaisanpham")
	private List<Sanpham> sanphams;

	public Loaisanpham() {
	}

	public String getMaLoai() {
		return this.maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<Sanpham> getSanphams() {
		return this.sanphams;
	}

	public void setSanphams(List<Sanpham> sanphams) {
		this.sanphams = sanphams;
	}

	public Sanpham addSanpham(Sanpham sanpham) {
		getSanphams().add(sanpham);
		sanpham.setLoaisanpham(this);

		return sanpham;
	}

	public Sanpham removeSanpham(Sanpham sanpham) {
		getSanphams().remove(sanpham);
		sanpham.setLoaisanpham(null);

		return sanpham;
	}

}