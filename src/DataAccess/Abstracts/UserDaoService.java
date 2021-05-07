package DataAccess.Abstracts;

import Entities.Concretes.User;

public interface UserDaoService 	{
	void add(User user);
	void update(User user);
	void delete(User user);

}
