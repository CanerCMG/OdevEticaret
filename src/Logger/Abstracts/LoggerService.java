package Logger.Abstracts;

import Entities.Concretes.User;

public interface LoggerService {

	void Login (User user,LoggerService loggerService);
	void Logout(User user,LoggerService loggerService);
	
}