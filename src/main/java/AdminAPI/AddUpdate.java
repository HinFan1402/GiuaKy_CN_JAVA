package AdminAPI;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ICategoryDAO;
import Model.NewsModel;
import Service.ICategoryService;
import Service.INewsService;

@WebServlet(urlPatterns = {"/admin-edit"})
public class AddUpdate extends HttpServlet {
	
	private static final long serialVersionUID = 2686801510274002166L;
	
	@Inject
	private INewsService newsService;
	@Inject
	private ICategoryService categoryService;
	@Inject
	private ICategoryDAO categoryDAO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("id");
		
		String category = request.getParameter("category");
		String title = request.getParameter("title");
		String thumbnail = request.getParameter("thumbnail");
		String shortDescription = request.getParameter("shortDescription");
		String content = request.getParameter("content");
		NewsModel x = new NewsModel();
		x.setTitle(title);
		x.setThumbnail(thumbnail);
		x.setShortDescription(shortDescription);
		x.setContent(content);
		x.setCategoryId(1l);
		if(action != null && action.equals("null")) { //hành động add
			
			newsService.save(x);
			response.sendRedirect(
					request.getContextPath() + "/admin-news?type=list&page=1&maxPageItem=2&sortName=title&sortBy=desc");
		} else { //hành động edit
			x.setId(Long.parseLong(action));
			newsService.update(x);
			response.sendRedirect(
					request.getContextPath() + "/admin-news?type=list&page=1&maxPageItem=2&sortName=title&sortBy=desc");
		}
	}
}
