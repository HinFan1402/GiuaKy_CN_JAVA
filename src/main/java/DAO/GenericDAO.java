package DAO;

import java.util.List;

import Mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object ... parameters);
	Long add(String sql, Object ... parameters);
	void update(String sql, Object ... parameters);
	int count(String sql, Object... parameters);
}
