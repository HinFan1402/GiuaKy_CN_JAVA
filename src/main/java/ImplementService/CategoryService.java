package ImplementService;

import java.util.List;

import javax.inject.Inject;

import DAO.ICategoryDAO;
import Model.CategoryModel;
import Service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDAO;
	
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}
	
}
