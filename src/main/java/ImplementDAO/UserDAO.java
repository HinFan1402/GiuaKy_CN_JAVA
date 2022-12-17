package ImplementDAO;

import java.util.List;

import DAO.IUserDAO;
import Mapper.UserMapper;
import Model.UserModel;


public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO  {

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public Long addUser(UserModel userModel) {
		String sql = "insert into user(username, password, fullname, status, roleid) values (?, ?, ?, ?, ?)";
		return add(sql, userModel.getUserName(), userModel.getPassword(), userModel.getFullName(), userModel.getStatus(), userModel.getRoleId());
	}
	
}
