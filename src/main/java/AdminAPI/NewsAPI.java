package AdminAPI;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import Model.NewsModel;
import Service.INewsService;
import Utils.HttpUtil;
import Utils.SessionUtil;



@WebServlet(urlPatterns = {"/api-admin-news"})
public class NewsAPI extends HttpServlet {
	
	@Inject
	private INewsService newsService;

	private static final long serialVersionUID = -915988021506484384L;
	
	//thêm bài viết
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		ObjectMapper mapper = new ObjectMapper();
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("application/json");
//		NewsModel newModel =  HttpUtil.of(request.getReader()).toModel(NewsModel.class);
//		
//		newModel = newsService.save(newModel);
//		mapper.writeValue(response.getOutputStream(), newModel);
	}
	
	//cập nhật bài viết
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		ObjectMapper mapper = new ObjectMapper();
//		request.setCharacterEncoding("UTF-8"); 
//		response.setContentType("application/json"); 
//		NewsModel newsModel =  HttpUtil.of(request.getReader()).toModel(NewsModel.class); 
//		newsModel = newsService.update(newsModel);
//		
//		//server trả dữ liệu lại cho client
//		mapper.writeValue(response.getOutputStream(), newsModel); 
	}
	
	
	//xóa bài viết
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("application/json");
		NewsModel newsModel =  HttpUtil.of(request.getReader()).toModel(NewsModel.class); 
		newsService.delete(newsModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");

	}
}
