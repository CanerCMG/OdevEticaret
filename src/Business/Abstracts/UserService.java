package Business.Abstracts;

import DataAccess.Abstracts.UserDaoService;
import Entities.Concretes.User;

public interface UserService {
	void add(User user,UserDaoService userDaoService);
	void update(User user,UserDaoService userDaoService);
	void delete(User user,UserDaoService userDaoService);
}
