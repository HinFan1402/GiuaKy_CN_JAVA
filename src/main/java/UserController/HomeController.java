package UserController;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UserModel;
import Service.ICategoryService;
import Service.IUserService;
import Utils.FormUtil;
import Utils.SessionUtil;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap", "/thoat", "/detail"})
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;

	@Inject
	private IUserService userService;

	private static final long serialVersionUID = 2686801510274002166L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String reload = request.getParameter("reload");
		if(reload != null && reload.equals("loading")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
			rd.forward(request, response);
		}
		String number = request.getParameter("number");
		if (number != null && number.equals("number1")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/one.jsp");
			rd.forward(request, response);
		} else if (number != null && number.equals("number2")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/two.jsp");
			rd.forward(request, response);
		} else if (number != null && number.equals("number3")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/three.jsp");
			rd.forward(request, response);
		} else if (number != null && number.equals("number4")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/four.jsp");
			rd.forward(request, response);
		} else if (number != null && number.equals("number5")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/five.jsp");
			rd.forward(request, response);
		} else if (number != null && number.equals("number6")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/details/listDetails/six.jsp");
			rd.forward(request, response);
		}
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			String alert = request.getParameter("alert");
			String message = request.getParameter("message");

			if (message != null && alert != null) {
				if(message.compareTo("invalid") == 0) {
				request.setAttribute("message", "Sai thông tin đăng nhập");
				request.setAttribute("alert", alert);
				}
					
				if(message.compareTo("not_login") == 0) {
					request.setAttribute("message", "Bạn chưa đăng nhập");
					request.setAttribute("alert", alert);
				}
				
				if(message.compareTo("not_permission") == 0) {
					request.setAttribute("message", "Hãy đăng nhập bằng tài khoản Admin");
					request.setAttribute("alert", alert);
				}
				if(message.compareTo("failRegister") == 0) {
					request.setAttribute("message", "Mật khẩu xác nhận không trùng khớp");
					request.setAttribute("alert", alert);
					RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
					rd.forward(request, response);
				}
				if(message.compareTo("success") == 0) {
					request.setAttribute("message", "Đăng ký tài khoản thành công");
					request.setAttribute("alert", alert);
				}
				if(message.compareTo("exist") == 0) {
					request.setAttribute("message", "Đã có tài khoản này trong hệ thống");
					request.setAttribute("alert", alert);
					RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
					rd.forward(request, response);
				}
				
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);

		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			response.sendRedirect(request.getContextPath() + "/trang-chu");
		} else if (action != null && action.equals("register")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
			rd.forward(request, response);
		} 
		else {
			request.setAttribute("categories", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1);
			if (model != null) {
				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
				if (model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath() + "/trang-chu");
				} else if (model.getRole().getCode().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath() + "/admin-home");
				}
			} else {
				response.sendRedirect(
						request.getContextPath() + "/dang-nhap?action=login&message=invalid&alert=danger");
			}
		} else if(action != null && action.equals("register")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model.setRoleId(2l);
			model.setStatus(1);
			
			model.setUserName(request.getParameter("userName"));
			model.setFullName(request.getParameter("fullName"));
			
			String pass = request.getParameter("password");
			String rePass = request.getParameter("rePassword");
			
			if(pass.compareToIgnoreCase(rePass) == 0) {
				model.setPassword(pass);
				if(userService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1) == null) {
					userService.addUser(model);
					response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=success&alert=danger");
				} else {
					response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=exist&alert=success");
				}
				
			} else {
				response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=failRegister&alert=danger");
			}
			
		}
	}
}
