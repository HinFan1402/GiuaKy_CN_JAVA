package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel x = new CategoryModel();
			x.setId(resultSet.getLong("id"));
			x.setCode(resultSet.getString("code"));
			x.setName(resultSet.getString("name"));
			return x;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
