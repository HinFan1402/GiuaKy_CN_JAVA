package ImplementDAO;
import java.util.List;

import DAO.ICategoryDAO;
import Mapper.CategoryMapper;
import Model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {
	
	@Override
	public List<CategoryModel> findAll() {
		String sl = "select * from category";
		return query(sl, new CategoryMapper());
	}
	

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

  
}
