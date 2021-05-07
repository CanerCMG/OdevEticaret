package Adapter;
import Core.UserList;
import Entities.Concretes.User;
import Logger.Abstracts.LoggerService;

public class LoginWithGoogleAccAdapter  implements LoggerService {

	@Override
	public void Login(User user, LoggerService loggerService) {
		if (UserList.userList.contains(user.getEmail())) {
			System.out.println("Google account ile Giris yapildi ");
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