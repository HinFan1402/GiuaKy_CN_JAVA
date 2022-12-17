package Service;

import Model.NewsModel;
import Model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
	Long addUser(UserModel userModel);
}
