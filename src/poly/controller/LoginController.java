package poly.controller;


	import java.io.File;
	import java.util.List;

	import javax.servlet.ServletContext;
	import javax.servlet.http.Cookie;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import javax.transaction.Transactional;

	import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.criterion.Restrictions;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.CookieValue;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.multipart.MultipartFile;

import poly.bean.Taikhoan;


	@Controller
	@Transactional
	@RequestMapping("/dangnhap/")
	public class LoginController {
		@Autowired
		SessionFactory factory;
		@Autowired
		ServletContext context;
		
		@RequestMapping(value="dangnhap", method=RequestMethod.GET)
		public String DN(ModelMap model) {
			model.addAttribute("user", new Taikhoan());
			return "dangnhap";
		}
		@RequestMapping(value="/dangnhap", method=RequestMethod.POST)
		public String Dangnhap(HttpServletRequest request, ModelMap model, @ModelAttribute("user") Taikhoan user, HttpServletResponse response) {
			HttpSession session1 = request.getSession();
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			try {
				String hql = "FROM Taikhoan where tenDangNhap = " + "'" + user.getTenDangNhap() +"' and matKhau='"+user.getMatKhau()+"'";
				Query query = session.createQuery(hql);
				Taikhoan u = (Taikhoan)query.uniqueResult();
				if(u==null) {
					model.addAttribute("message1", "Tên đăng nhập không tồn tại");
					return "dangnhap";
				}
				
				else {
					model.addAttribute("message2", "Mật khẩu không đúng");
					return "dangnhap";
				}
				
			}catch (Exception e) {
				t.rollback();
				model.addAttribute("message", "Lỗi đăng nhập");
			}finally {
				session.close();
			}
			return "index";
		}
		
	}
