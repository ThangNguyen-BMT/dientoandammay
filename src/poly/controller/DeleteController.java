package poly.controller;

import javax.servlet.http.HttpServletRequest;
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

import poly.bean.Sanpham;


@Controller
@Transactional
@RequestMapping("/delete/")
public class DeleteController {
	@Autowired
	SessionFactory factory;
	@RequestMapping(value = "xoaus/{maSP}", method = RequestMethod.GET)
	public String xoaus(ModelMap model, @PathVariable("maSP") int id, HttpServletRequest req) {
		Session session = factory.openSession();
		Sanpham sanpham = (Sanpham) session.get(Sanpham.class, id);
		Transaction t = session.beginTransaction();
		try {
			session.delete(sanpham);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return "redirect:/sanpham/sanpham.htm";
	}
}