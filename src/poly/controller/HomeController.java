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

import org.springframework.web.bind.annotation.RequestMapping;


import poly.bean.Sanpham;


@Controller
@Transactional
public class HomeController {
	@Autowired
	SessionFactory factory;
	
	@RequestMapping("index")
	public String index(ModelMap model){
		Session session = factory.getCurrentSession();
		String hql = "FROM Sanpham";
		Query query = session.createQuery(hql);
		List<Sanpham> list = query.list();
		model.addAttribute("sanpham", list);
		return "index";
	}
	@RequestMapping("lien-he")
	public String contact(ModelMap model){
		return "lienhe/contac";
	}
	
	
}
