package DAO;

import java.util.List;

import Model.NewsModel;
import Paging.Pageable;

public interface INewsDAO extends GenericDAO<NewsModel>{
	NewsModel findOne(Long id);
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newModel);
	void update(NewsModel updateNew);
	void delete(long id);
	List<NewsModel> findAll(Pageable pageble);
	int getTotalItem();

}
