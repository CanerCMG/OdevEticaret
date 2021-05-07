package Logger.Concrete;

import Core.UserList;
import Entities.Concretes.User;
import Logger.Abstracts.LoggerService;

public class LoggerManager implements LoggerService{

	@Override
	public void Login(User user, LoggerService loggerService) {
		if (UserList.userList.contains(user.getEmail())) {
			System.out.println("Giris yapildi ");
		}
		else {
			System.out.println("Sisteme kayitlio email adresiniz bulunamadi. ");
		}
	}

	@Override
	public void Logout(User user, LoggerService loggerService) {
		// TODO Auto-generated method stub
		
	}
	


}
