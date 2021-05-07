package Core;

import Entities.Concretes.User;

public class SendEmail {
	 public static void sendEmail (User user) {
		System.out.println(user.getEmail()+ " " + "adresine dogrulama emaili gonderildi.");
		
	}
}
