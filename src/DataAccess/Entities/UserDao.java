package DataAccess.Entities;

import Core.SendEmail;
import DataAccess.Abstracts.UserDaoService;
import Entities.Concretes.User;
import Core.UserList;

public class UserDao implements UserDaoService{
	
	@Override
	public void add(User user) {
		
		if (UserList.userList.contains(user.getEmail())) {
			System.out.println("email adresiniz sistemde kayitlidir.Kayit gerceklestirilemedi.");
		}	
		
		else {		
		
		UserList.userList.add(user.getEmail());
		System.out.println("UserDao ile eklendi.");		
		SendEmail.sendEmail(user);
		}
	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
}