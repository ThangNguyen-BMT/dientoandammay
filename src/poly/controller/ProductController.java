package poly.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.Sanpham;

@Transactional
@Controller
@RequestMapping("/sanpham/")
public class ProductController {
	@Autowired
	SessionFactory factory;

	@RequestMapping("sanpham")
	public String index(ModelMap model) {
		Session session = factory.getCurrentSession();
		String hql = "FROM Sanpham";
		Query query = session.createQuery(hql);
		List<Sanpham> list = query.list();
		model.addAttribute("sanpham", list);
		
		return "sanpham/sanpham";
	}
	@RequestMapping("chitiet")
	public String chitiet(ModelMap model) {
		Session session = factory.getCurrentSession();
		String hql = "FROM Sanpham";
		Query query = session.createQuery(hql);
		List<Sanpham> list = query.list();
		model.addAttribute("sanpham", list);
		
		return "sanpham/chitiet";
	}
	
	@RequestMapping("san-pham")
	public String product(ModelMap model){
		return "sanpham/insert";
	}
	// Bổ sung insert
			@RequestMapping(value = "insert", method = RequestMethod.GET)
			public String insert(ModelMap model) {
				model.addAttribute("sp", new Sanpham());
				return "sanpham/insert";
			}

			@RequestMapping(value = "insert", method = RequestMethod.POST)
			public String insert(ModelMap model, @ModelAttribute("sp") Sanpham sp) {
				Session session = factory.openSession();
				Transaction t = session.beginTransaction();
				try {
					session.save(sp);
					t.commit();
					model.addAttribute("message", "Thêm mới thành công !");
				} catch (Exception e) {
					t.rollback();
					model.addAttribute("message", "Thêm mới thất bại !");
				} finally {
					session.close();
				}
				return "redirect:/sanpham/sanpham.htm";
			}
}
