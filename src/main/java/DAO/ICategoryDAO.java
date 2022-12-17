package DAO;

import java.util.List;

import Model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
}
