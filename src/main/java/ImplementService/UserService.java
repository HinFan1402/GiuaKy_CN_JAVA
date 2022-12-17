package ImplementService;

import javax.inject.Inject;

import DAO.IUserDAO;
import ImplementDAO.UserDAO;
import Model.UserModel;
import Service.IUserService;

public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

	@Override
	public Long addUser(UserModel userModel) {
		// TODO Auto-generated method stub
		return userDAO.addUser(userModel);
	}
	
}
