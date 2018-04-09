package poly.controller;

import java.util.Date;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import poly.bean.Sanpham;

@Transactional
@Controller
@RequestMapping("/edit/")
public class EditController {

	@Autowired
	SessionFactory factory;

	@RequestMapping("sp/{id}")
	public String Showsp(ModelMap model, @PathVariable("id") Integer id) {
		Session session = factory.getCurrentSession();
		Sanpham sanpham = (Sanpham) session.get(Sanpham.class, id);
		model.addAttribute("sanpham", sanpham);
		return "Edit";
	}

	@RequestMapping(value = "suasp", method = RequestMethod.POST)
	public String UpdateSp(ModelMap model, 
			@RequestParam("maSP") int id, 
			@RequestParam("tenSP") String tenSP,
			@RequestParam("giaNhap") Integer giaNhap, 
			@RequestParam("giaBan") Integer giaBan,
			@RequestParam("soLuong") Integer soLuong,
			@RequestParam("xuatXu") String xuatXu) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Sanpham sanpham = (Sanpham) session.get(Sanpham.class, id);
		sanpham.setTenSP(tenSP);
		sanpham.setGiaNhap(giaNhap);
		sanpham.setGiaBan(giaBan);
		sanpham.setSoLuong(soLuong);
		sanpham.setXuatXu(xuatXu);
		System.out.print("vao ham");
		
		try {
			session.update(sanpham);
			t.commit();
			model.addAttribute("message", "Sửa thành công");
			System.out.print("Thanh cong");
			model.addAttribute("sanpham", sanpham);
		} catch (Exception e) {
			t.rollback();
			System.out.print("that bai");
			model.addAttribute("message", "Sửa thất bại" + e.getMessage());
			return "Edit";
		} finally {
			session.close();
		}
		return "redirect:/sanpham/sanpham.htm";
	}

}