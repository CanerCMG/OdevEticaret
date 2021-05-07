import Adapter.LoginWithGoogleAccAdapter;
import Business.Entities.UserManager;
import DataAccess.Abstracts.UserDaoService;
import DataAccess.Entities.UserDao;
import Entities.Concretes.User;
import Logger.Abstracts.LoggerService;

public class Main {

	public static void main(String[] args) {
	
		
		User caner = new User("Caner","camoglu","caner.cmg@hotmail.com","1234567");//Sisteme Dogru Kayit 
		//User cansu = new User("Caner","camoglu","caner.cmg@hotmail.com","1234567");//Sisteme yanlis Kayit ayni e posta adresi deneneniyor.
		UserDaoService userDao = new UserDao();
		UserManager userManager = new UserManager();	
	

		userManager.add(caner, userDao);
		//userManager.add(cansu, userDao);//Sisteme yanlis Kayit ayni e posta adresi deneneniyor.
		
		LoggerService loginWithGoogleAccAdapter = new LoginWithGoogleAccAdapter();//Google account ile giris 
			
		loginWithGoogleAccAdapter.Login(caner, loginWithGoogleAccAdapter);
		
		
	}
	


}

