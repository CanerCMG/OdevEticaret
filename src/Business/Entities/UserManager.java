package Business.Entities;

import Business.Abstracts.UserService;
import Core.CheckValidate;
import DataAccess.Abstracts.UserDaoService;
import Entities.Concretes.User;
import Logger.Abstracts.LoggerService;

public class UserManager implements UserService {
	private UserDaoService userDaoService ;
	private LoggerService loggerService;
	
	public UserManager() {}	
	
	public UserManager(UserDaoService userDaoService, LoggerService loggerService) {
		super();
		this.userDaoService = userDaoService;
		this.loggerService = loggerService;
	}

	@Override
	public void add(User user,UserDaoService userDaoService) {
		

			if(CheckValidate.checkEmail(user) && CheckValidate.checkLastName(user) && CheckValidate.checkPassword(user) && CheckValidate.checkUserName(user) ) {
				
				userDaoService.add(user);			
			}	
		
			else	{
				System.out.println("Kayit gerceklestirilemedi.");
			}
			
		}
	

	@Override
	public void update(User user,UserDaoService userDaoService) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user,UserDaoService userDaoService) {
		// TODO Auto-generated method stub
		
	}

	

}
