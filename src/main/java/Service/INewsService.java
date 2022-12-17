package Service;

import java.util.List;

import Model.NewsModel;
import Paging.Pageable;

public interface INewsService {
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newModel);
	void update(NewsModel updateNew);
	void delete(long[] ids);
	List<NewsModel> findAll(Pageable pageble);
	int getTotalItem();
	NewsModel findOne(long id);

}
