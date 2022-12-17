package ImplementService;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import DAO.ICategoryDAO;
import DAO.INewsDAO;
import Model.CategoryModel;
import Model.NewsModel;
import Paging.Pageable;
import Service.INewsService;

public class NewsService implements INewsService {
	
	@Inject
	private INewsDAO newsDAO;
	
	@Inject
	private ICategoryDAO categoryDAO;
	
	public List<NewsModel> findByCategoryId(Long categoryid) {
		return newsDAO.findByCategoryId(categoryid);
	}

	@Override
	public Long save(NewsModel newsModel) {
//		newsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
//		CategoryModel x = categoryDAO.findByCode(newsModel.getCategoryCode());
//		newsModel.setCategoryId(x.getId());
//		Long newsId = newsDAO.save(newsModel);
		return newsDAO.save(newsModel);
	}

	

	@Override
	public List<NewsModel> findAll(Pageable pageble) {
		// TODO Auto-generated method stub
		return newsDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return newsDAO.getTotalItem();
	}

	@Override
	public void update(NewsModel updateNews) {
		newsDAO.update(updateNews);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for(long id : ids) {
			newsDAO.delete(id);
		}
	}

	@Override
	public NewsModel findOne(long id) {
		// TODO Auto-generated method stub
		NewsModel newModel = newsDAO.findOne(id);
		CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
		newModel.setCategoryCode(categoryModel.getCode());
        return newModel;
	}

	
}
