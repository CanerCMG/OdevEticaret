package Core;
import java.util.regex.Pattern;
import Entities.Concretes.User;

public  class CheckValidate {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	public static boolean checkUserName(User user){
		
		if (user.getName().length()>=2) {
			System.out.println("kullanici adi gecerlidir.");
		return true;	
		}
		
		else {
			System.out.println("kullanici adinizin uzunlugu 2 karakterden kisa olamaz!");
		return false;				
		}
		}
	
	public static boolean checkLastName(User user){
		
		if (user.getLastName().length()>=2) {
			System.out.println("kullanici soyadi gecerlidir.");
			return true;		
		}
		
		else {
			System.out.println("kullanici soyadinizin uzunlugu 2 karakterden kisa olamaz!");
			return false;	
		}
		}

	public static boolean checkPassword (User user) {
		if(user.getPassword().length() <= 6) {
			
			System.out.println("parola uzunlugu en az 6 karakter olmalidir.");
		return false;
		}
			
		else {
			System.out.println("parola gecerlidir.");
		return true;
		}	
		}
			
	static boolean a = false;
	public static boolean checkEmail(User user) {
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		a = pattern.matcher(user.getEmail()).find()  	;		
		if(a==true) {
				
		System.out.println("Email dogrulandi.");
		return a;
		}
		else { 
		System.out.println("Email dogrulanamadi lutfen gecerli bir email adresi giriniz.");
		return a;
		}
		}


}

