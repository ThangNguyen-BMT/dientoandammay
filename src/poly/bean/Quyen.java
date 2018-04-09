package poly.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the quyen database table.
 * 
 */
@Entity
@Table(name="quyen")
@NamedQuery(name="Quyen.findAll", query="SELECT q FROM Quyen q")
public class Quyen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int maQuyen;

	@Column(unique=true, length=50)
	private String tenQuyen;

	//bi-directional many-to-one association to Taikhoan
	@OneToMany(mappedBy="quyenBean")
	private List<Taikhoan> taikhoans;

	public Quyen() {
	}

	public int getMaQuyen() {
		return this.maQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		this.maQuyen = maQuyen;
	}

	public String getTenQuyen() {
		return this.tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	public List<Taikhoan> getTaikhoans() {
		return this.taikhoans;
	}

	public void setTaikhoans(List<Taikhoan> taikhoans) {
		this.taikhoans = taikhoans;
	}

	public Taikhoan addTaikhoan(Taikhoan taikhoan) {
		getTaikhoans().add(taikhoan);
		taikhoan.setQuyenBean(this);

		return taikhoan;
	}

	public Taikhoan removeTaikhoan(Taikhoan taikhoan) {
		getTaikhoans().remove(taikhoan);
		taikhoan.setQuyenBean(null);

		return taikhoan;
	}

}